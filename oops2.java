class Student{
    String name;
    int age;

    Student(String n, int a){
        this.name=n;
        this.age=a;

    }

    public void printinfo(String naam){
        System.out.println(naam);
    }
    public void printinfo(int umar){
        System.out.println(umar);
    }
    public void printinfo(String naam,int umar){
        System.out.println(naam+" "+umar);
    }
    
}




public class oops2 {
    public static void main(String[] args) {

        Student s1=new Student("girdharlalji",42);

        s1.printinfo(s1.age);
        s1.printinfo(s1.name);
        s1.printinfo(s1.name,s1.age);

        
    }
}
