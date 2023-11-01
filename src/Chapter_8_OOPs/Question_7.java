package Chapter_8_OOPs;
/*
    Design a class Person with attributes for a person's name, age, and address.
    Implement a method to change the address and display the updated person's information.
 */

class PersonInfo{
    String name;
    int age;
    String address;

    PersonInfo(){
        name="CoderRohit";
        age=20;
        address="Kunjalpur";
    }
    public void changeAddress(){
        address="Kunjalpur Atrauli Aligarh";
    }
    public void updateInformation(){
        System.out.println("The name of the person is : "+name);
        System.out.println("The age of the person  is : "+age);
        System.out.println("The address of the person is : "+address);
    }
}

public class Question_7 {
    public static void main(String[] args) {
        PersonInfo personInfo=new PersonInfo();

        personInfo.changeAddress();
        personInfo.updateInformation();
    }
}
