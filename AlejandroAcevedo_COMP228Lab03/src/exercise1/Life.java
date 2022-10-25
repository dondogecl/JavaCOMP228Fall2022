package exercise1;

public class Life extends Insurance {
    // instance variables

    // constructors
    public Life() {
        this.insuranceType = "Life";
        System.out.println("a life insurance has been created");
    }

    // implement abstract methods
    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }

    @Override
    public void displayInfo() {
        System.out.println("Selected type of insurance: "+ getInsuranceType() +" \nMonthly Cost: " + getMonthlyCost());
    }

}
