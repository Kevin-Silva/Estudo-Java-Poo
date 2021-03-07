package application;

import entities.Cliente;
import service.Calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter the account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there an initial deposit(y/n)");
        char x = sc.next().charAt(0);

        // Single quotes para comparar variaveis char
        double balance = 0;
        if(x == 'y'){
            System.out.println("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }

        Cliente cliente = new Cliente(name, accountNumber, balance);
        System.out.println(cliente);

        System.out.println("Enter a deposit value: ");
        double deposit = sc.nextDouble();

        cliente.setBalance(Calculadora.deposit(cliente, deposit));
        System.out.println(cliente);

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();

        cliente.setBalance(Calculadora.withdraw(cliente, withdraw));
        System.out.println(cliente);


    }
}
