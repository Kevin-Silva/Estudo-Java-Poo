package entities;

public class Retangulo {

    public double width;
    public double height;

    public double area(){
        return width * height;
    }
    public double perimetro(){
        return 2 * (width + height);
    }
    public double diagonal(){
        return Math.sqrt((Math.pow(2, width)) +  (Math.pow(2, height)));
    }
    public String toString(){
        return "Area = "
                + String.format("%.2f", area())
                + " Perimeter = "
                + String.format("%.2f", perimetro())
                + " Diagonal = "
                + String.format("%.2f", diagonal());
    }
}
