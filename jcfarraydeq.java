import java.util.ArrayDeque;

public class jcfarraydeq {
    public static void main(String[] args) {
        ArrayDeque <Integer> arrdeq = new ArrayDeque<>();
        arrdeq.offer(12);
        arrdeq.offerFirst(10);
        arrdeq.offerLast(1);
        arrdeq.offer(145);
        System.out.println(arrdeq);

     System.out.println(   arrdeq.peekLast());
     System.out.println(   arrdeq.peekFirst());
     System.out.println(   arrdeq.peek());

     System.out.println(arrdeq.poll());
     System.out.println(arrdeq.pollFirst());
     System.out.println(arrdeq.pollLast());
     System.out.println(arrdeq);
      

    }
}
