package Application;

import java.util.Scanner;
import java.util.Locale;
import Entities.Student;
import Service.Calculos;
public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student name: ");
        String name  = sc.nextLine();

        System.out.println("Enter the first grade: ");
        double nota1 = sc.nextDouble();
        System.out.println("Enter the second grade: ");
        double nota2 = sc.nextDouble();
        System.out.println("Enter the third grade: ");
        double nota3 = sc.nextDouble();

        Student student = new Student(name, nota1, nota2, nota3);

        Calculos.finalGrade(student.getNota1(), student.getNota2(), student.getNota3());

        System.out.println("Final grade = " + Calculos.finalGrade(student.getNota1(), student.getNota2(), student.getNota3()));

        if(Calculos.finalGrade(student.getNota1(), student.getNota2(), student.getNota3()) < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", Calculos.missingGrade(student.getNota1(), student.getNota2(), student.getNota3()));

        }
        else{
            System.out.println("Pass");

        }
        sc.close();
    }
}
