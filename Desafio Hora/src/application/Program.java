package application;

import Service.Calculadora;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora: (hh:mm)");
        String horario = sc.nextLine();
        String[] horarioDividido = horario.split(":");


        System.out.println("Digite os minutos a serem acrescido: ");
        int minutosAcrescidos = sc.nextInt();

        System.out.println(Calculadora.somaMinutos(horarioDividido, minutosAcrescidos));
        System.out.println(Calculadora.somaHora(horarioDividido, minutosAcrescidos));
    }
}
