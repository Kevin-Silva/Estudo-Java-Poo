package Service;

public class Calculadora {

    public static int somaMinutos(String[] horario, int minutos){
        int somaHorario = Integer.parseInt(horario[1]) + minutos;
        return somaHorario;
    }
    public static int somaHora(String[] horario, int minutos){
        int horaAtualizado = Integer.parseInt(horario[0]);
        if (Integer.parseInt(horario[1]) >= 60) {
            horaAtualizado = Integer.parseInt(horario[0]) + 1;
        }
        return horaAtualizado;
    }
}
