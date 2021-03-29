package Service;

public class Calculadora {

    public static int somaHorario(String[] horario, int minutos){
        int somaHorario = Integer.parseInt(horario[1]) + minutos;

        if(somaHorario >= 60){
            Integer.parseInt(horario[1]) = (somaHorario - 60);

        }

    }
}
