package entities;

public class Cliente {

    private String name;
    private int accountNumber;
    private double balance;

    public Cliente(String name, int accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }

    public String toString() {
        return  "Account data: \n"
                + "Account "
                + accountNumber
                + ", "
                + "Holder: "
                + name
                + ", $ "
                + String.format("%.2f", balance);
    }

}
