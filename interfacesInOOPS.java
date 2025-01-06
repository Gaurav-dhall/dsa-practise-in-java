interface Animal{
    public void walk();
}

interface Herbivore{

}

class Horse implements Animal,Herbivore{ //multiple inheritance possible in interface not in class
    public void walk(){
        System.out.println("Horse walks on four legs");
    }
}

public class interfacesInOOPS {
   public static void main(String[] args) {
        Horse h1= new Horse();
        h1.walk();
   } 
}
