package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


//Employee class implement CRUD operations
public class Employee {

	Connection con;
	PreparedStatement pstmt;
	Statement stmt;
	ResultSet res;

	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeejdbc","root","2697");

		return con;
	}

	public void insertEmployee(String name, int cityId, String contact)
	{
		System.out.println();

		try {
			String sqlInsert = "INSERT INTO employee(name,city_id,contact) VALUES (?,?,?)";
			pstmt = getConnection().prepareStatement(sqlInsert);
			pstmt.setString(1, name);
			pstmt.setInt(2, cityId);
			pstmt.setString(3, contact);
			//		pstmt.executeUpdate();
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Records inserted successfully!");
			}else {
				System.out.println("Something went wrong!!");
			}
			getConnection().close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


	public void getEmployee()
	{
		System.out.println("**************** Display Employees*****************");
		System.out.println("EmpId\tName\tCity\t\tContact No.");
		System.out.println("---------------------------------------------------");
		try {
			stmt = getConnection().createStatement();
			res = stmt.executeQuery("SELECT e.id,e.name,l.city_name,e.contact FROM employee e"
					+ " INNER JOIN location l ON e.city_id = l.city_id ORDER BY e.id");

			while(res.next()) {
				System.out.println(res.getInt(1)+"\t"+res.getString(2)+
						"\t"+res.getString(3)+" \t\t "+res.getString(4));

			}
			System.out.println("---------------------------------------------------");
			String countRecords = "SELECT COUNT(id) from employee";
			res = stmt.executeQuery(countRecords);
			int count=0;
			while(res.next()) {
				count = res.getInt(1);
			}
			System.out.println("Total no. of records are: "+count);
			System.out.println("---------------------------------------------------");
			getConnection().close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void updateEmployee(int id,int cityId)
	{
		try {

			String updateQuery = "UPDATE employee SET city_id=? WHERE id=?";
			pstmt=getConnection().prepareStatement(updateQuery);
			pstmt.setInt(1, cityId);
			pstmt.setInt(2, id);
			int count = pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Successfully Updated!!");

			}else {
				System.out.println("Something went wrong!!");
			}
			getConnection().close();			

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteEmployee(int eid)
	{
		System.out.println();
		try {
			System.out.println("Selected employee: ");
			System.out.println("EmpId\tName\tCity\tContact No.");
			System.out.println("-----------------------------------------");
			pstmt=getConnection().prepareStatement("SELECT e.id,e.name,l.city_name,e.contact FROM employee e "
					+ " INNER JOIN location l USING(city_id) WHERE id=?");
			pstmt.setInt(1, eid);
			res = pstmt.executeQuery();

			while(res.next()) {
				System.out.println(res.getInt(1)+"\t "+res.getString(2)+
						"\t"+res.getString(3)+"\t"+res.getString(4));

			}
			System.out.println("-----------------------------------------");
			System.out.println("Are you sure you want to delete this employee's record? (Y/N): ");
			Scanner deleteOption = new Scanner(System.in);
			char choice = deleteOption.next().charAt(0);
			if(choice=='y' || choice=='Y') {
				String sqlDelete = "DELETE FROM employee WHERE id=?";
				pstmt = getConnection().prepareStatement(sqlDelete);
				pstmt.setInt(1, eid);
				int count = pstmt.executeUpdate();
				if(count>0) {
					System.out.println("Record deleted successfully!");
				}else {
					System.out.println("Something went wrong!!");
				}
				getConnection().close();
			}else {
				System.out.println("Not deleted!!");
				getConnection().close();
			}
			

		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}

