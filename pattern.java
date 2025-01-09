
public class pattern {

    public static void pattern1( int n){

        // * * * *
        // * * * *
        // * * * *
        // * * * *

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }

    }

    public static void pattern2(int n){
        // *
        // * *
        // * * *
        // * * * * 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }

    }


    public static void pattern3(int n){
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i+1; j++) {

                System.out.print((j+1) + " ");
                
            }
            System.out.println();
            
        }
    }

    public static void pattern4(int n){
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4 
        // 5 5 5 5 5
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
            
        }
    }

    public static void pattern5(int n){
        // * * * * * 
        // * * * * 
        // * * * 
        // * *
        // *


        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >0 ; j--) {

                System.out.print("*"+" ");
                
            }
            System.out.println();
            
        }
    }

    public static void pattern6(int n){
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        for (int i = 0; i <5; i++) {
            for (int j = 0; j<n-i; j++) {
                System.out.print(j+1 +" ");
                
            }
            System.out.println();
            
        }
    }

    public static void pattern7 (int n){
// 0        *
// 1      * * *
// 2    * * * * *
// 3  * * * * * * *
// 4* * * * * * * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <(2*n-1); j++) {
                if((i+j)<(n-1)||j>(i+n-1)){
                    System.out.print(" "+" ");
                }
                else{
                    System.out.print("*"+" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        pattern7(10);
      
    }
}
