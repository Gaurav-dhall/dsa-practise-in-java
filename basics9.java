
import java.util.Scanner;

public class basics9 {

    public static void main(String[] args) {

        int n;

        do{
        System.out.println("Enter a positive number to print and negative number to stop");
       
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        System.out.println(n);
    }while(n>0);

    }
    
}
