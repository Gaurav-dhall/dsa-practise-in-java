abstract class Animal{
    abstract public void walk();

    Animal(){
        System.out.println("you are creating a new animal");
    }

    public void newanimal(){
        System.out.println("hello from animal");
    }

}

class Horse extends Animal{

    Horse(){
        System.out.println("You are creating a horse");
    }
    public void walk(){
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on two legs");
    }
}

public class abstractionInOOPS {
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();
        h1.newanimal();

        // Animal a1=new Animal();
        // a1.walk();  cannot be instantiated as asbstract
    }
}
