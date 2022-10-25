package exercise1;

public abstract class Insurance {
    // instance variables
    protected String insuranceType;
    protected double monthlyCost;

    // constructors

    // getters and setters
    public String getInsuranceType() {
        return insuranceType;
    }
    public double getMonthlyCost() {
        return monthlyCost;
    }

    // abstract methods
    
    // setInsuranceCost method (abstract)
    public abstract void setInsuranceCost(double monthlyCost);
    
    // displayInfo method (abstract)
    public abstract void displayInfo();

    
}
