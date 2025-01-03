class pen{
    String type;
    String color;

    public void write(){
        System.out.println("Im writing");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


class Student{
    String name;
    int age;

    Student(){
        System.out.println("constructor called");
    }

    Student(Student s){
        this.name=s.name;
        this.age=s.age;
    }

    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);

    }

  
}





public class oops1 {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.write();
        pen1.printColor();
        
        pen pen2= new pen();
        pen2.color="black";
        pen2.type="ballpoint";
        pen2.printColor();

        Student s1=new Student();
        s1.name="madhav";
        s1.age=24;

        Student s2=new Student(s1);
        
        // System.out.println(s1.age);
        s2.printDetails();
    }
}
