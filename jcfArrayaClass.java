import java.util.Arrays;

public class jcfArrayaClass {
    public static void main(String[] args) {
        int [] numbers = {24,12,56,10,2,78,6};
        Arrays.sort(numbers);

        int key=Arrays.binarySearch(numbers, 6);
        System.out.println("The index of element 6 is "+key);

        // parallel sort arrays ko divide krke multiple processors ko dedeta hai but iske liye no of elements minimum 8192 hone chahiye vrna quick sort hi lagta hai 

        Arrays.fill(numbers, 0); // used to fill a particular value at all indexes of a particular array 

       for(int i: numbers){
        System.out.print(i+" ");
       }


    }
}
