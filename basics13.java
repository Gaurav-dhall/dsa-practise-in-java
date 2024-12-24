
public class basics13 {

    public static void printJava(){
        System.out.println("print java");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static void printName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        printJava();
        printJava();
        printName("kishori ji ");
        printName("lala");

        int sum=sum(50,60 );
        System.out.println("the sum is "+ sum);
    }
}
