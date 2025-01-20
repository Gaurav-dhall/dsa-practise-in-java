import java.util.HashMap;
import java.util.Map;

public class jcfMap {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        students.put("one", 1);
        students.put("two", 2);
        students.put("three", 3);

        if(!students.containsKey("one")){
            students.put("one", 420);//putIfAbsent shows this behaviour only
        }

        students.putIfAbsent("one", 102);//puts only if the key is absent other wise doesnt override
        

        System.out.println(students);
    }
}
