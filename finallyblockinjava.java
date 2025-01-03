public class finallyblockinjava {
    public static void main(String[] args) {
        int a[] = new int[4];
        System.out.println("Hello world");

        try {
            System.out.println(a[56]);}
        catch (Exception e) {
            System.out.println("exceptions handled");
        }
        finally{
            System.out.println("I will run always");

        }

        System.out.println("Bye world");
    }
}
