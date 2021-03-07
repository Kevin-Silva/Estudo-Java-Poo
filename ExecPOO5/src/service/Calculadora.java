package service;

import entities.Cliente;

public class Calculadora {

    public static double deposit(Cliente cliente, double deposit){
        double accountUpdated = cliente.getBalance() + deposit;
        return accountUpdated;
    }
    public static double withdraw(Cliente cliente, double withdraw){
        double tax = 5.00;
        double accountUpdated = cliente.getBalance() - withdraw - tax;
        return accountUpdated;
    }
}
