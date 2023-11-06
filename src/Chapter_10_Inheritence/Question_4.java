package Chapter_10_Inheritence;
/*
    Write a Java program that creates a class hierarchy for employees of a company.
     The base class should be Employee, with subclasses Manager, Developer, and Programmer.
     Each subclass should have properties such as name, address, salary, and job title.
     Implement methods for calculating bonuses, generating performance reports, and managing projects.
 */

class Employee{
   private String employeeName;
   private String employeeAddress;
   private double employeeSalary;
   private String employeeJobTitle;

    Employee(String employeeName,String employeeAddress,String employeeJobTitle,double employeeSalary){
        this.employeeName=employeeName;
        this.employeeAddress=employeeAddress;
        this.employeeJobTitle=employeeJobTitle;
        this.employeeSalary=employeeSalary;
    }
   public String getEmployeeName(){
        return employeeName;
   }
   public String getEmployeeAddress(){
        return employeeAddress;
   }
   public String getEmployeeJobTitle(){
        return employeeJobTitle;
   }
   public double getEmployeeSalary(){
        return employeeSalary;
   }
    public double bonuses(){
        System.out.println("This employee have no bonus.");
        return 0;
    }
    public String  performanceReport(){
       return "Employee "+getEmployeeName()+" have no performance report.";
    }
}
class Manager extends Employee{
    int control;
    Manager(String name,String address,String jobTitle,double salary,int control){
        super(name,address,jobTitle,salary);
        this.control=control;
    }
    public void controlOver(){
        System.out.println("Manager "+getEmployeeName()+" hava 3 floors control.");
    }
    @Override
    public double bonuses(){
        return getEmployeeSalary()*0.15;
    }

    @Override
    public String performanceReport() {
        return "Manager "+getEmployeeName()+" have good performance.";
    }
}
class Developer extends Employee{
    String languages;
    Developer(String name,String address,String jobTitle,double salary,String languages){
        super(name,address,jobTitle,salary);
        this.languages=languages;
    }
    public String programmingLanguage(){
        return languages;
    }
    @Override
    public double bonuses(){
        return getEmployeeSalary()*1.5;
    }
    @Override
    public String performanceReport(){
        return "Developer "+getEmployeeName()+" have excellent performance.";
    }
}
class Programmer extends Developer{
    Programmer(String name,String address,String jotTitle,double salary,String language){
        super(name,address,jotTitle,salary,language);
    }
    @Override
    public double bonuses(){
        return getEmployeeSalary()*1.5;
    }
    @Override
    public String performanceReport(){
        return "Programmer "+getEmployeeName()+" have excellent performance.";
    }
    public void writeCode(){
        System.out.println("Programmer "+getEmployeeName()+" write code in "+programmingLanguage());
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Manager manager=new Manager("Rohit Yadav","Kunjalpur","SDE",120000,3);
        manager.controlOver();
        double b=manager.bonuses();
        String pr=manager.performanceReport();
        System.out.println("Manager Bonus "+b);
        System.out.println(pr);

        Developer developer=new Developer("Rohit Yadav","Kunjalpur","SDE",120000,"Java");
        System.out.println("Developer bonus "+developer.bonuses());
        System.out.println(developer.performanceReport());

        Programmer programmer=new Programmer("Rohit Yadav","Kunjalpur","SDE",120000,"C++");
        System.out.println("Programmer bonus : "+programmer.bonuses());
        System.out.println(programmer.performanceReport());
        programmer.writeCode();
    }
}
