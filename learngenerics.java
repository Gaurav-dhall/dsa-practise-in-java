class Dog<T,V>{
   T id;
   V name;

    public Dog(T identity, V name){
        this.id=identity;
        this.name=name;
    }

    public T getid(){
        return this.id;
    }
}



public class learngenerics {
    public static void main(String[] args) {
        Dog<String,String> d1=new Dog<String,String>("123","chiku");
       System.out.println(d1.getid());
        Dog<String,String> d2=new Dog<String,String>("abc","pillu");
        Dog<Integer,String>d3=new Dog<Integer,String>(123,"shera");
    }
}


