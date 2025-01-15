import java.util.Stack;

public class collectionsFrameworkStacks {
    public static void main(String[] args) {
        Stack <String> animal = new Stack<>();
        animal.push("lion");
        animal.push("dog");
        animal.push("chidiya");
        animal.push("kabootar");
        System.out.println("The stack of animals is "+ animal);
        System.out.println(animal.peek());
animal.pop();
       System.out.println(animal); 
    }
}
