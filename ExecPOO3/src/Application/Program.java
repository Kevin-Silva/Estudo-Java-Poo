package Application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Student;
import Service.Calculos;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Calculos calc = new Calculos();

        System.out.println("Enter the student name: ");
        student.name  = sc.nextLine();

        System.out.println("Enter the first grade: ");
        student.nota1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        student.nota2 = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        student.nota3 = sc.nextDouble();

        calc.finalGrade(student.nota1, student.nota2, student.nota3);

        System.out.println("Final grade = " + calc.finalGrade(student.nota1, student.nota2, student.nota3));

        if(calc.finalGrade(student.nota1, student.nota2, student.nota3) < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", calc.missingGrade(student.nota1, student.nota2, student.nota3));

        }
        else{
            System.out.println("Pass");

        }
        sc.close();
    }
}
