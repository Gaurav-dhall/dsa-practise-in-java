class Students{
    String name;
    static String school;

}



public class staticInOOPS {
    public static void main(String[] args) {
        Students.school="st.gabriel";

        Students s1=new Students();
        s1.name="lala";
        System.out.println(s1.school);

        
    } 
}
