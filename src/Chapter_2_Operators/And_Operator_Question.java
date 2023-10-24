package Chapter_2_Operators;

/*
    Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if both the conditions 'a < 50' and 'a < b' are true
 */
public class And_Operator_Question {
    public static void main(String[] args) {

        int a=55;
        int b=70;

        System.out.println("First Condition (a<50) and Second Condition (a<b) :- Are both Conditions are true or false : "+(a<50 && a<b));
    }
}
