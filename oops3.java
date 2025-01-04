class Shape{
    String color;
    public void area(){
        System.out.println("prints area");
    }
}

class Triangle extends Shape{

    public void area(int l, int h){
        System.out.println("the area is "+l*h/2);
    }

}

class Circle extends Shape{
    public void area(int radius){
        System.out.println("Area is "+(3.14)*radius*radius);
    }
}

class EquilateralTriangle extends Triangle{

    public void area(int side){
        System.out.println("The area is "+Math.sqrt(3.00)*side*side/4);
    }

}




public class oops3 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color="blue";
        System.out.println(t1.color);
        t1.area(2,2);

        EquilateralTriangle t3= new EquilateralTriangle();
        t3.area(4);
    }
}
