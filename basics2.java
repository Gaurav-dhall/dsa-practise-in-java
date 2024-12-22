
import java.util.Arrays;

public class basics2 {
    public static void main(String[] args) {
        int [] marks= new int[3];
        marks[0]=25;
        marks[1]=45;
        marks[2]=89;
        // System.out.println(marks[2]);
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);

        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
