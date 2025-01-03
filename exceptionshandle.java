public class exceptionshandle {
    public static void main(String[] args) {
        int a[]=new int[5];
        
        System.out.println("hello guys");
        // try{ 
            
        //     int result=5/0;
        //     System.out.println(a[9]);
           
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("you are fool");
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getMessage());
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e);
        // }


        try{ 
            
            int result=5/0;
            System.out.println(a[9]);
           
        }
        // catch(ArrayIndexOutOfBoundsException |ArithmeticException|NullPointerException e){
        //     System.out.println("handling the exceptions");
        // }
    //     catch(ArithmeticException e){
    //  System.out.println("handling the exceptions");
    //     }
        catch(Exception e){
            System.out.println("all exceptions handfled");
        }
        

        System.out.println("Bye guys");
       
    }
}
