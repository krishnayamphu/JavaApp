package javaapp.inheritance;
class School{
    public String schoolName;
}

// IS-A Relation
public class Student extends School{
    String studentName;
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.studentName="Ram";
        s1.schoolName="Aptech";

        s2.studentName="Hari";
        s2.schoolName="Abc";

        System.out.println("Name:"+s1.studentName);
        System.out.println("School:"+s1.schoolName);

        System.out.println("Name:"+s2.studentName);
        System.out.println("School:"+s2.schoolName);
    }
}
