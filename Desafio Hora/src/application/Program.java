package application;

import Service.Calculadora;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: (hh:mm)");
        String horario = sc.nextLine();
        String[] horarioCalculo = horario.split(":");

        System.out.println("Digite os minutos a serem acresido: ");
        int minutosAcrescidos = sc.nextInt();

        int soma = Integer.parseInt(horarioCalculo[1]) + minutosAcrescidos;
        System.out.println(soma);
    }
}
