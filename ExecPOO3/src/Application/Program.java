package Application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Student;
public class Program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter the student name: ");
        student.name  = sc.nextLine();

        System.out.println("Enter the first grade: ");
        student.nota1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        student.nota2 = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        student.nota3 = sc.nextDouble();

        System.out.println("Final grade = " + student.finalGrade());

        if(student.finalGrade() < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingGrade());

        }
        else{
            System.out.println("Pass");

        }
        sc.close();
    }
}
