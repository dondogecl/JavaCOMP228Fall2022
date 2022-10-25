package exercise1;

public class Health extends Insurance  {

    // constructors
	public Health() {
		this.insuranceType = "Health";
        System.out.println("a health insurance has been created");
	}
	
	@Override
    public void setInsuranceCost(double monthlyCost) {
        this.monthlyCost = monthlyCost;
        
    }

    @Override
    public void displayInfo() {
    	System.out.println("Selected type of insurance: "+ getInsuranceType() +" \nMonthly Cost: " + getMonthlyCost());
        
    }
    
}
