package Entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax){
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGrossSalary(double grossSalary){
        this.grossSalary = grossSalary;
    }
    public double getGrossSalary(){
        return grossSalary;
    }
    public void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }
}
