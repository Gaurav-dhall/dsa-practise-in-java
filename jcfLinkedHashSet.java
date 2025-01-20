import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class jcfLinkedHashSet {
    public static void main(String[] args) {

        //  Set<Integer> setlearn = new LinkedHashSet<>();
        // setlearn.add(32);
        // setlearn.add(5);
        // setlearn.add(12);
        // setlearn.add(91);
        // setlearn.add(11);

        // setlearn.add(32);
        // setlearn.add(32);
        // setlearn.add(32);
        // setlearn.add(32);
        // setlearn.add(32); // not added as set cannot have repeated elements 


        // setlearn.remove(12); //removes 12

        // System.out.println(setlearn.contains(11));

        // System.out.println(setlearn.isEmpty());

        // System.out.println(setlearn);

        // System.out.println(setlearn.size());
        // setlearn.clear();
        // System.out.println(setlearn);
        
        Set <studentsforset> students = new HashSet<>();
        students.add(new studentsforset("Thakur ji", 1));
        students.add(new studentsforset("shree ji", 2));
        students.add(new studentsforset("tansukha ji", 3));
        students.add(new studentsforset("mansukha ji", 4));
        students.add(new studentsforset("mansukha ji", 4));// this will add mansukha ji two times however as per behaviour of set it should not this is because se takes every "new studentsforset" as a unique object irrespective of data entered in it as hashing is done on object not on roll no or name isliye hame batana padega ki do objects kis basis pe ek doosre se alag hai i.e hashing kispe honi chahiye samjhee

        System.out.println(students);


    }
}
