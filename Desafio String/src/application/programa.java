package application;

import java.util.Scanner;

public class programa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        String[] frase1 = frase.split(" ");

        for (String fraseSplit : frase1) {
            char x = fraseSplit.charAt(0);
            System.out.print(x);
        }
    }
}
