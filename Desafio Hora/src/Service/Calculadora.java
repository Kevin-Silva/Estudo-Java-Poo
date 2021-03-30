package Service;

public class Calculadora {

    public static String minutosAtualizados(String[] horario, int minutos){
        int somaMinutos = Integer.parseInt(horario[1]) + minutos;

        if(somaMinutos >= 60){
            for(int i = somaMinutos; i >= 60; i = i){
                i -= 60;
                somaMinutos = i;
                horario[1] = String.valueOf(somaMinutos);
            }
            if(Integer.parseInt(horario[1]) < 10){
                return "0" + horario[1];
            }
        }
        if(Integer.parseInt(horario[1]) < 10){
            return "0" + horario[1];
        }

        return horario[1] = String.valueOf(somaMinutos);

    }
    public static String horarioAtualizado(String[] horario, int minutos){
        int somaHorario = Integer.parseInt(horario[1]) + minutos;

        if(somaHorario >= 60){
            for(int i = somaHorario; i >= 60; i++){
                i -= 60;
                int somaHora = Integer.parseInt(horario[0]) + 1;
                horario[0] = String.valueOf(somaHora);
            }

            if(Integer.parseInt(horario[0]) >= 24){
                int horarioNoturno = Integer.parseInt(horario[0]) - 24;
                return horario[0] = String.valueOf(horarioNoturno);
            }
        }

        return horario[0];
    }
}
