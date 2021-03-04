package Service;

public class Calculos {

    public static double finalGrade(double nota1, double nota2, double nota3){

        return nota1 + nota2 + nota3;
    }

    public static double missingGrade(double nota1, double nota2, double nota3) {
        if (finalGrade(nota1, nota2, nota3) < 60) {
            return 60 - finalGrade(nota1, nota2, nota3);
        } else {
            return 0.0;
        }
        }
    }