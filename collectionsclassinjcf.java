import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class collectionsclassinjcf {
    public static void main(String[] args) {
        List<studentsforset> list=new ArrayList<>();
        list.add(new studentsforset("thakurji", 2));
        list.add(new studentsforset("kishori ji", 1));
        list.add(new studentsforset("mansukha", 3));
        list.add(new studentsforset("tansukha", 4));
        // System.out.println(list);

        // studentsforset s1 = new studentsforset("rahul", 6);
        // studentsforset s2 = new studentsforset("anjali", 7);

        // System.out.println(s1.compareTo(s2));



    
        // System.out.println("Array list: "+list);
        // System.out.println("Min : "+ Collections.min(list));
        // System.out.println("max : "+ Collections.max(list));
        // System.out.println("frequency of 9 : "+ Collections.frequency(list,9));

        Collections.sort(list,new Comparator<studentsforset>() {
            @Override

            public int compare(studentsforset o1,studentsforset o2){
                return o1.name.compareTo(o2.name);//now will compare on basis of name also
            }
            
        });
        // Collections.sort(list);
        System.out.println(list);
    }
}
