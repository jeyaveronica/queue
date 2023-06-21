package queuemode;
import java.util.Queue;
import java.util.LinkedList;

public class queuedemo {	
	
	   public static void main(String[] args) {
	      
	      Queue<Integer> input_queue = new LinkedList<>();
	      input_queue.offer(150);
	      input_queue.offer(300);
	      input_queue.offer(450);
	      input_queue.offer(600);
	      System.out.println("The queue is defined as: " + input_queue);
	      int removedNumber = input_queue.poll();  // The poll() method of the Queue interface returns the
	                                                  //object at the top of the current queue and removes it. If the queue is empty this method returns null.
	      System.out.println("After removing an element, the elements of the queue are: " +input_queue);
	      System.out.println("The removed element: " +removedNumber);
	   }
	   }
	
