package Entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade(){
        return nota1 + nota2 + nota3;
    }
    public double missingGrade(){
       if(finalGrade() < 60){
           return 60 - finalGrade();
       }
       else{
           return 0.0;
       }
    }
}
