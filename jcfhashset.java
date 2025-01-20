import java.util.HashSet;
import java.util.Set;

public class jcfhashset {
    public static void main(String[] args) {
        Set<Integer> setlearn = new HashSet<>();
        setlearn.add(32);
        setlearn.add(5);
        setlearn.add(12);
        setlearn.add(91);
        setlearn.add(11);

        setlearn.add(32);
        setlearn.add(32);
        setlearn.add(32);
        setlearn.add(32);
        setlearn.add(32); // not added as set cannot have repeated elements 


        setlearn.remove(12); //removes 12

        System.out.println(setlearn.contains(11));

        System.out.println(setlearn.isEmpty());

        System.out.println(setlearn);

        System.out.println(setlearn.size());
        setlearn.clear();
        System.out.println(setlearn);



    }
}
