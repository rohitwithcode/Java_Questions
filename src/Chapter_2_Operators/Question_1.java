package Chapter_2_Operators;

/*
    Write a program to add 8 to the number 2345 and then divide it by 3.
     Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
 */
public class Question_1 {
    public static void main(String[] args) {

        int number=2345;
        int add=8;

        int numberAfterAdd=number+add;
        System.out.println("The number after add : "+ numberAfterAdd);

        float divide=3.0f;

        float numberAfterDivide=numberAfterAdd/divide;
        System.out.println("Number after divide : "+numberAfterDivide);

        float numberAfterReminder=numberAfterDivide%5;
        System.out.println("Number after Reminder : "+numberAfterReminder);

        float numberAfterMultiply=numberAfterReminder*5;
        System.out.println("Final Result and Number after Multiply 5 is : "+numberAfterMultiply);


    }
}
