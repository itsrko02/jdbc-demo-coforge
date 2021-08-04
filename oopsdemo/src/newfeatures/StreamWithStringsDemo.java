package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithStringsDemo {

	public static void main(String[] args) {


		// Count the empty strings
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.printf("List %s has %d empty strings %n", strList, count);
       
        // Count String with length more than 3
        long num = strList.stream().filter(x -> x.length()> 3).count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);
       
        // Count number of String which startswith "a"
        count = strList.stream().filter(x -> x.startsWith("a")).count();
        System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);
       
        // Remove all empty Strings from List
        List<String> filtered = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.printf("Original List : %s, List without Empty Strings : %s %n", strList, filtered);
       
        // Create a List with String more than 2 characters
        filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);
       
        // Convert String to Uppercase and join them using comma
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
	}

}
