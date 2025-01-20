public class studentsforset{
    String name;
    int rollno;

    public studentsforset(String str, int num){
        this.name=str;
        this.rollno=num;
    }

    public String toString(){
        return "Student{"+"name='"+name+'\''+",rollno="+rollno+'}';
    }


   
}