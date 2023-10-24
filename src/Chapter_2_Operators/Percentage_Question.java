package Chapter_2_Operators;

/*
    If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ),
     write a program to calculate his total marks and percentage marks.
 */
public class Percentage_Question {
    public static void main(String[] args) {

        int math=78;
        float chemistry=45.0f;
        int physics=62;

        float percentage=(math+chemistry+physics)/3;

        System.out.println("Total percentage of Robert is : "+percentage);

    }
}
