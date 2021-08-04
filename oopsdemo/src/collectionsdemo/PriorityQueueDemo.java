package collectionsdemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// Create a Priority Queue - store data in ascending order
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        
        //insert data using offer()
        
        numbers.offer(80);
        numbers.offer(2000);
        System.out.println("Head Element: "+numbers.peek());

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }

		
		
	}

}
