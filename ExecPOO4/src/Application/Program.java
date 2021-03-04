package Application;

import java.util.Scanner;
import java.util.Locale;
import Service.Calculator;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price: ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarToBeBought = sc.nextDouble();

        double result = Calculator.currenceConverter(dollarPrice, dollarToBeBought);
        System.out.printf("Amount to be paid in reais = %.2f\n", result);

    }
}
