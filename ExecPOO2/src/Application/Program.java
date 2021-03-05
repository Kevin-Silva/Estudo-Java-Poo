package Application;
import Entities.Employee;
import Service.Calculadora;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Gross Salary: ");
        double grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        double tax = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary, tax);
        
        double calculo1 = Calculadora.netSalary(employee.getGrossSalary(), employee.getTax());
        System.out.printf("Employee: " + employee.getName() + "$ " + "%.2f\n",calculo1);

        System.out.println("Which Percentage to increase salary? ");
        double percentage = sc.nextDouble();

        double calculo2 = Calculadora.increaseSalary(percentage, calculo1);
        System.out.printf("Update data: " + employee.getName() + "$ " + "%.2f\n", calculo2);
        sc.close();
    }
}
