import java.util.*;

public class GradeDescription{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade (A to F): ");
        char grade = sc.next().charAt(0);
        
        switch(grade){
        case 'A':
            System.out.print("Excellent");
            break;
        case 'B':
            System.out.print("Very Good");
            break; 
        case 'C':
            System.out.print("Good");
            break; 
        case 'D':
            System.out.print("Not Bad");
            break;
        case 'E':
            System.out.print("Below Average");
            break; 
        case 'F':
            System.out.print("Fail");
            break; 
        default:
            System.out.println("Invalid Grades");
            break;
        }
    }
}