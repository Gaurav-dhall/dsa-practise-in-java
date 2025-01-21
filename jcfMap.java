import java.util.HashMap;
import java.util.Map;

public class jcfMap {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();
        students.put("one", 1);
        students.put("two", 2);
        students.put("three", 3);

        students.put("four", 4);
        students.put("five", 5);
        // System.out.println(students);

        // //iteration of entry set (inside for loop datat tyepe identifier then set to be iterated)
        // for(Map.Entry<String,Integer> e: students.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }

        //iteration of key set --> data type identifier followed by set 
        // for(String key: students.keySet()){
        //     System.out.println(key);
        // }

        // // iteration of value set 

        // for(Integer value : students.values()){
        //     System.out.println(value);
        // }

        System.out.println(students.containsValue(15));
        System.out.println(students.isEmpty());
        students.clear();
        System.out.println(students);

    }
}
