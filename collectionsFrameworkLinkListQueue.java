import java.util.LinkedList;
import java.util.Queue;

public class collectionsFrameworkLinkListQueue {
    public static void main(String[] args) {
        Queue <Integer> queque = new LinkedList<>();
        queque.offer(45);
        queque.offer(12);
        queque.offer(23);

        System.out.println(queque);

    
System.out.println(queque.poll());
        System.out.println(queque);
        System.out.println(queque.peek());
  
    }
}
