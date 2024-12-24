
import java.util.Scanner;

public class minigame {
    public static void main(String[] args) {
        int genNum=(int)(Math.random()*100);
        int guess=0;

        System.out.println("I have a number between 1-100 in mind guess it if u can on the basis of hints (enter a negative number to stop)");
        Scanner sc=new Scanner((System.in));

        

        while(guess!=genNum){
        System.out.println("Enter your random guess");
        guess=sc.nextInt();
        if(guess<genNum&&guess>0-5
        ){
            System.out.println("Your guess is less than my number");

        }

        else if(guess>genNum){
            System.err.println("Your guess is greater than my number");

        }
        else if(guess<0){
            
            break;
        }

    }

    if(guess<0){
        System.out.println("the number was "+genNum);
    }
    else{

    System.out.println("Wohoo u guessed the number right the number is "+genNum);}


    }
}
