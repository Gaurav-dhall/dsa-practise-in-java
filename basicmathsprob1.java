import java.util.Scanner;

public class basicmathsprob1 {

        public static int count(int N){
        int countdig=0;
        // basic c

        while (N>0) {
            int lastdigit=N%10;
            N/=10;//extracting the digitds from end 
            ++countdig;
            
        }
       
return countdig;   
    }

    public static int countlog(int N ){
        int countdig = (int)(Math.log10(N)+1);
        return countdig;
    }
   public static void main(String[] args) {



   
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    // scan();
   System.out.println(count(N)); 
   System.out.println(countlog(N)); 
   
    //another way is formula integer part of (log 10(N)+1)




   } 
}
