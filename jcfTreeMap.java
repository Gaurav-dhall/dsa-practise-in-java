import java.util.Map;
import java.util.TreeMap;

public class jcfTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> students = new TreeMap<>();// uunlike hash map tree map will have a sorted order on the basis of key 
        students.put("thakurji",1);
        students.put("shreeji",2);
        students.put("kishoriji",3);
        students.put("sudamaji",4);
        students.put("laltaji",5);

        // System.out.println(students); 
        // will print in sorted order of key here key is string therefore in alphabetical order 
        students.remove("thakurji");
        System.out.println(students);
    }
}
