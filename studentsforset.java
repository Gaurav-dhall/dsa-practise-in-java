public class studentsforset implements Comparable<studentsforset>{
    String name;
    int rollno;

    public studentsforset(String str, int num){
        this.name=str;
        this.rollno=num;
    }

    public String toString(){
        return "Student{"+"name='"+name+'\''+",rollno="+rollno+'}';
    }

    @Override
    public int compareTo(studentsforset that) {
        // TODO Auto-generated method stub
        return this.rollno-that.rollno; 
       /*  this vo object hai jisme compare to function lagaya gya hai aur that vo hai jo as parameter passed hui hai 
        to agar +ve to jispe function lagaya haai vo object bada hai 
        agar - ve to jo object pass kiya hai vo bada hai 
        agar 0 to barabar hai interms of roll no */
    }


   
}