// import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionsfraeworkarraylist {
    public static void main(String[] args) {

        // String [] studentsname = new String[30];
        // studentsname[0]="harry";

        // // studentsname[1]----studentsname[28]

        // studentsname[29]="gaurav";
        // studentsname[30]="thakurji";
        // // error array index out of bound
        // System.out.println(studentsname[30]);

        ArrayList<String> studentsname = new ArrayList<>();

        studentsname.add("thakurji"); //to add an element
        studentsname.add("shreeji");
        studentsname.add("tansukha");
        studentsname.add("mansukha");
        // size=n
        // n+n/2+1

        System.out.println(studentsname);

        studentsname.add("radha rani");
        System.out.println(studentsname);

        studentsname.add(2,"yashoda maiya");//to add an element at a particular index
        System.out.println(studentsname);

        List<String> innerlist = new ArrayList() ;
        innerlist.add("hanumanji");
        innerlist.add("raghav ji");

       studentsname.addAll(innerlist); //adds inner list in the students name
       System.out.println(studentsname);

    //    System.out.println(studentsname.get(4));

    //    studentsname.remove(2);
    //    studentsname.remove(4);
    //    studentsname.remove(1);

    //    System.out.println(studentsname);

    //    studentsname.clear();
    //    System.out.println(studentsname);

    studentsname.remove(String.valueOf("thakurji"));
    System.out.println(studentsname);

    System.out.println(studentsname.contains("shyamaju"));

    // for (int i = 0; i < studentsname.size(); i++) {
    //     System.out.println("The element is "+studentsname.get(i));

    // }

    // for (String element : studentsname) {
    //     System.out.println("the element is "+element);
    // }

    // for each loops 

    // every collection framework has a  iterator 
    Iterator <String> it = studentsname.iterator();
    while (it.hasNext()) {
        System.out.println("the element has "+it.next());
        
    }
    }
}
