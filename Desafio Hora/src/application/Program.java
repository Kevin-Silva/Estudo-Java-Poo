package application;

import Service.Calculadora;
import com.sun.org.apache.xalan.internal.xsltc.dom.CachedNodeListIterator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o horario desejado: (hh:mm) ");
        String horario = sc.nextLine();
        String[] horarioDividido = horario.split(":");

        System.out.println("Digite os minutos a serem acrescidos: ");
        int minutos = sc.nextInt();

        String horaAtual = Calculadora.horarioAtualizado(horarioDividido, minutos);
        String minutosAtual = Calculadora.minutosAtualizados(horarioDividido, minutos);

        System.out.println(horaAtual + ":" + minutosAtual);

    }
}
