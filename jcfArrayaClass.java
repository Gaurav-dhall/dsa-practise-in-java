import java.util.Arrays;

public class jcfArrayaClass {
    public static void main(String[] args) {
        int [] numbers = {24,12,56,10,2,78,6};
        Arrays.sort(numbers);

        int key=Arrays.binarySearch(numbers, 6);
        System.out.println("The index of element 6 is "+key);



    }
}
