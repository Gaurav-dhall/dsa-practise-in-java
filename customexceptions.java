import java.util.Scanner;

public class customexceptions {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Enter ur age");

        try{
        age=sc.nextInt();
            if(age>100){
            throw new myException();
        }}
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class myException extends Exception{

}

