public class q09{
    public static void main(String args[]) {
        EXAM[] ex=new EXAM[1]; // You can update the size to 5 I'm not doing now!!
        ex[0]=new EXAM();
        ex[0].input_Student("Rocky Bhai",1951,"Duniya");
        ex[0].input_Marks(100,100,100);
        ex[0].display_Student();
        ex[0].display_Result();
    }
}
class STUDENT{
    int roll;
    String name,course;
    void input_Student(String n,int r,String cr){
        name=n;
        roll=r;
        course=cr;
    }
    void display_Student(){
        System.out.println("Name of the Student: "+name+"\nRoll number: "+roll+"\nCourse: "+course);
    }
}    
class EXAM extends STUDENT{
    int mark1,mark2,mark3;
    void input_Marks(int m1, int m2,int m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display_Result(){
        System.out.println("Marks of first subject: "+mark1+"\nMarks of second subject: "+mark2+"\nMarks of third subject: "+mark3);
    }
}


