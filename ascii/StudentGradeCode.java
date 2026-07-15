import java.util.*;

public class StudentGradeCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade:");
        char grade = sc.next().charAt(0);
        int ascii = grade;
        System.out.println("Grade: "+grade);
        System.out.println("ASCII value: "+ascii);
    }
}