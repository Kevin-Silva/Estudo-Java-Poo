package application;

public class programa {
    public static void main(String[] args){
        String frase = "Computer World Information";
        String[] frase1 = frase.split(" ");

        for(int i = 0; i < frase1.length; i++){
            String fraseSplit = frase1[i];
            System.out.println(fraseSplit.charAt(0));
        }
    }
}
