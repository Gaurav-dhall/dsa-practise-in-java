
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
   
    public static void pattern7alter(int n){

// 0        *
// 1      * * *
// 2    * * * * *
// 3  * * * * * * *
// 4* * * * * * * * *

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j >0; j--) {
                System.out.print(" "+" ");
            }

            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*"+" ");
                
            }
            for (int j = n-1-i; j >0; j--) {
                System.out.print(" "+" ");
                
            }

            System.out.println();


            
        }
    }
   
   public static void pattern8(int n){
    //  * * * * * * * * *
    //    * * * * * * *  
    //      * * * * *   
    //        * * *  
    //          *

        for (int i = 0; i <n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" "+" ");
            }

            for (int j = (2*n-1)-2*i; j>0; j--) {
                System.out.print("*"+" ");
                
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" "+" ");
            }

            System.out.println();
            
        }
   }
   
   public static void pattern9(int n){

//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
// * * * * * * * * *
//   * * * * * * *  
//     * * * * *   
//       * * *  
//         *

    pattern7(n);
    pattern8(n);

   }
  
  public static void pattern10(int n){

// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
    pattern2(n);
    pattern5(n-1);
  }
  
  public static void pattern10alter(int n){

// * 
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *
        for (int i = 1; i <=2*n-1; i++) {

            if(i<=n){
                  for (int j = 0; j < i; j++) {
                System.out.print("*"+" ");
                
            }
            System.out.println();
            }

            else{
                for (int j = 0; j < 2*n-i; j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

          
            
        }
  }
  

  public static void pattern11(int n){
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1"+" ");
                    }
                    else{
                         System.out.print("0"+" ");
                    }
                   
                }
                else{
                    if(j%2==0){
                        System.out.print("0"+" ");
                    }
                    else{
                         System.out.print("1"+" ");
                    }
                   
                }
                
            }
            System.out.println();
        }
  }
   

  public static void pattern11alter(int n){
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    int start;
    
            for (int i = 1; i <= n; i++) {
                if(i%2==0){ start=0;}
                else{
                     start=1;
                }
                for (int j = 1; j <= i; j++) {
                  
                      
                       System.out.print(start);
                       start=1-start;
                       
                   
                    
                }
                System.out.println();
            }
      }
  
 
  public static void pattern12(int n){
// 1                 1 
// 1 2             2 1
// 1 2 3         3 2 1
// 1 2 3 4     4 3 2 1
// 1 2 3 4 5 5 4 3 2 1
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i+1; j++) {
            System.out.print(j+1 +" ");
        }

        for (int j = (n-i-1)*2; j >0 ; j--) {
            System.out.print(" "+" ");
        }


        for (int j = i+1; j >0; j--) {
            System.out.print(j+ " ");
        }

        System.out.println();
    }
  }
      
  public static void pattern13(int n){
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
    int num=1;
for (int i = 1; i <=n; i++) {
    for (int j = 1; j <=i; j++) {
        System.out.print(num+" ");
        num++;
    }
System.out.println();
        
    }
    
  }

 public static void pattern14(int n){
// A 
// A B
// A B C
// A B C D
// A B C D E

    for (int i = 1; i <=n; i++) {
        char letter='A';
        for (int j = 1; j <=i; j++) {
            System.out.print(letter+" ");
            letter++;
        }
        System.out.println();
    }
 }
 public static void pattern14alter(int n){
// A 
// A B
// A B C
// A B C D
// A B C D E
    for (int i = 1; i <=n; i++) {
        // char letter='A';
        for (char j='A'; j <= 'A'+i-1; j++) {
            System.out.print(j+" ");
            // letter++;
        }
        System.out.println();
    }
 }

 public static void pattern15(int n){
// A B C D E 
// A B C D
// A B C
// A B
// A
    for (int i = 0; i < n; i++) {
        for (char j ='A' ; j <='A'+n-1-i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
 }

 public static void pattern16(int n){
    // A 
    // B B
    // C C C
    // D D D D
    // E E E E E
        for (int i = 1; i <=n; i++) {
            char letter=(char)('A'+i-1);
           for (int j = 1; j <=i; j++) {
                System.out.print(letter+" ");
           }
            System.out.println();
        }
     }

public static void pattern17(int n){
//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A
    for (int i = 0; i < n; i++) {
        for (int j = n-i-1; j >0; j--) {
            System.out.print(" "+" ");
            
        }
        for (char j='A'; j <= 'A'+i; j++) {
            System.out.print(j+ " ");
        }
        for (char j=(char)('A'+i-1); j >='A'; j--) {
            System.out.print(j+ " ");
        }
        
        for (int j = n-i-1; j >0; j--) {
            System.out.print(" "+" ");

        }

        System.out.println();
        
    }
}
public static void pattern17alter(int n){
//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A
    for (int i = 0; i < n; i++) {
        char letter='A';
        for (int j = n-i-1; j >0; j--) {
            System.out.print(" "+" ");
            
        }
        for (int j = 0; j < 2*i+1; j++) {
            System.out.print(letter+" ");
            if(j<i){
                letter++;
            }
            else{
                letter--;
            }
            
        }
        
        for (int j = n-i-1; j >0; j--) {
            System.out.print(" "+" ");

        }

        System.out.println();
        
    }
}


 public static void pattern18(int n){
// E 
// D E
// C D E
// B C D E
// A B C D E
    for (int i = 1; i <= n; i++) {
        for (char j =(char) ('A'+n-i); j <='A'+n-1; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
        
    }
 }
 
 public static void pattern19(int n){

// * * * * * * * * * * 
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *
// *                 *
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                System.out.print('*'+" ");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print('*'+" ");
            }
            System.out.println();
        }
        

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print('*'+" ");
            }
            for (int j = 0; j < 2*(n-1-i); j++) {
                System.out.print(" "+" ");
            }
            for (int j = 0; j <i+1; j++) {
                System.out.print('*'+" ");
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
        // pattern7(5);
        // pattern7alter(12);
        // pattern8(12);
        // pattern9(10);
        // pattern10(5);
        // pattern10alter(10);
        // pattern11(5);
        // pattern11alter(10);
        // pattern12(5);
        // pattern13(5);
        // pattern14(5);
        // pattern14alter(5);
        // pattern15(5)
        // pattern16(5);
        // pattern17(5);
        // pattern17alter(5);
        // pattern18(5);
        pattern19(5);
      
    }
}