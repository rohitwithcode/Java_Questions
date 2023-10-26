package Chapter_4_Conditionals;

import java.util.Scanner;

public class Find_maximum_number_using_ternary_operator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int first=scanner.nextInt();

        System.out.println("Enter the second number : ");
        int second= scanner.nextInt();
        
        int maximum=(first>second)?first:second;

        System.out.println("Maximum Number from "+first+" and "+second+" is : "+maximum );
    }
}
