package Week3_4;

	import java.util.LinkedList;
	import java.util.Queue;

	public class enqueue {
	    public static void main(String[] args) {
	        // Create and initialize a Queue using a LinkedList
	        Queue<String> queue = new LinkedList<>();

	        
	        queue.add("10");
	        queue.add("20");
	        queue.add("30");
	        queue.add("40");
	        queue.add("50");

	        System.out.println("array : " + queue);

	       if(queue.isEmpty()){
                System.out.println("Queue is empty");
            }else{
                System.out.println("Queue is not empty");
            
	        String number = queue.remove();
	        
	        System.out.println("Removed from array : " + number + " | New array : " + queue);
	        
	        number =queue.poll();
	        System.out.println("Removed from array : " + number + " | New array : " + queue);
	        
	       } 
	    }
	}