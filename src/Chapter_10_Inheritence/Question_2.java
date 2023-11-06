package Chapter_10_Inheritence;
/*
    Create a class hierarchy for a university system. Define a base class "Person" with fields for name and age.
    Create subclasses "Student" and  with their own unique attributes and methods.
 */

class  Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}

class Student extends Person{
    int rollno;
    String course;
    Student(String name,int age){
        super(name,age);
    }
    public  void setRollno(int rollno){
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }
    public void enrollInCourse(String course){
        this.course=course;
    }
    public void dropCourse(String course){
        if(this.course.equalsIgnoreCase(course)){
            this.course="";
            System.out.println("Course Dropped successfully.");
        }
        else{
            System.out.println("Student is not enrolled in this course "+course);
        }
    }
    public void viewStudentInformation(){
        System.out.println("Student Roll No : "+getRollno());
        System.out.println("Student Enrolled course : "+course);
    }
}
public class Question_2 {
    public static void main(String[] args) {
        Student s=new Student("Rohit",21);
        s.setRollno(1000);
        s.enrollInCourse("BCA");
        s.dropCourse("BCA");
        s.viewStudentInformation();
    }
}
