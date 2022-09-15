package account;

public class Account {
    // fields
    private String name;
    private double balance;

    // constructor
    /**
     *  Default constructor with no parameters
     */
    public Account(){
        this.name = "default";
        this.balance = 0.00;
    }

    public Account(String name){
        this.name = name;
        this.balance = 0.00;
    }

    public Account(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    // getters
    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
