public class throwAndThrowsInJava {

    public static void getnumberfromarray(int b[]) throws ArrayIndexOutOfBoundsException{
        System.out.println(b[8]);
    }
    public static void main(String[] args) {
      

        int a[]= new int[5];

        try{
        getnumberfromarray(a);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("exception handled");
    }

    }
}
  