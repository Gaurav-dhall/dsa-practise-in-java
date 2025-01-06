public class genericsAndWrappers {
    public static void main(String[] args) {
        // Integer obj = new Integer(24);
        Integer obj2 = Integer.valueOf(45);

        Integer obj4 = Integer.valueOf("452");
        System.out.println(obj4/2);
        Integer obj3=54; //autoboxing primitive-->wrapper class

        int age=obj3;//unboxing wrapper class-->primitive data 
    }
}
