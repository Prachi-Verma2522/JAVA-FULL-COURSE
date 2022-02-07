
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		// Queue follow FIFO
		
		// Polymorphic Statement
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		
		// Direct Object Construction
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		/*queue.add(10);
		queue.add(9);*/
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Head 10 9 8 7 6 5 4 3 2 1 Tail

		// PriorityQueue will sort the data in Queue for Processing Purpose
		// Head 1 2 3 4 5 6 7 8 9 10 Tail
		
		// 1. peek -> returns the head of queue
		// 2. poll -> removes and return the head of queue
		
		//int head = queue.peek();
		/*int head = queue.poll();
		System.out.println("head is: "+head);
		System.out.println("Size of queue is: "+queue.size());*/
		
		//System.out.println(queue.contains(9));
		
		int size = queue.size();
		for(int i=0;i<size;i++) {// if we don't initialize size variable then the result of poll would be 1 2 3 4 5 as size will be decreased
			int head = queue.poll();// size will be 5 so it's advised to define size separately
			System.out.println(head);
		}
		
		System.out.println("queue is: "+queue);
		System.out.println("finally the size is: "+queue.size());
		
	}

}

