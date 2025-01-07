public class genermethods {
//     public static<E> void printdata(E name){
//         System.out.println(name);
// }

public<E extends Number> void  doubledata(E data){
    System.out.println(data);
}
    public static void main(String[] args) {
        // printdata("Laddu gopal");
        // printdata(12345);
        genermethods obj = new genermethods();
        customClass obj2 = new customClass();
    //     obj2.<Integer>doubledata(123);
    //    obj.<String>doubledata("name");
    obj.doubledata(123);
    }
}

class customClass{

}

