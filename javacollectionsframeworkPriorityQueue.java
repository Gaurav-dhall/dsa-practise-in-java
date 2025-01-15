import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class javacollectionsframeworkPriorityQueue {
    public static void main(String[] args) {
        
        Queue <Integer> learnpq = new PriorityQueue<>(Comparator.reverseOrder());
        learnpq.offer(45);
        learnpq.offer(4);
        learnpq.offer(9);
        learnpq.offer(62);
        learnpq.offer(34);
        

        System.out.println(learnpq); //min heap implemented
    //   int c=  learnpq.poll();
    //   System.out.println(c);
      System.out.println(learnpq);

    }
}
