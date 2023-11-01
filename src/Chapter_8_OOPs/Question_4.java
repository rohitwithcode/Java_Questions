package Chapter_8_OOPs;
/*
    Create a class Employee with attributes for an employee's name, employee ID, and salary.
    Write a method to calculate and return the yearly salary of the employee.
 */

class Employee{
    String employeeName;
    int employeeId;
    double employeeSalary;

    Employee(){
        employeeName="Rohit Yadav";
        employeeId=1;
        employeeSalary=100000;
    }

    public double yearlySalary(){
        return employeeSalary*12;
    }

}

public class Question_4 {
    public static void main(String[] args) {
        Employee employee=new Employee();

        double yearlysalary=employee.yearlySalary();

        System.out.println("The yearly salary of the "+employee.employeeName+" is : "+yearlysalary);
    }
}
