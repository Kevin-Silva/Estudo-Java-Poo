package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;
public class program {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height:");
        retangulo.height = sc.nextDouble();
        retangulo.width = sc.nextDouble();

        retangulo.area();
        retangulo.perimetro();
        retangulo.diagonal();

        System.out.println(retangulo);
    }
}
