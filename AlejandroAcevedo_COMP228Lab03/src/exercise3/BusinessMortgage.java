package exercise3;

public class BusinessMortgage extends Mortgage{

	
	public BusinessMortgage(int mortgageNumber, String customerName, double interestRate, double mortgageAmount, String term) {
		this.mortgageNumber = mortgageNumber;
		this.customerName = customerName;
		this.interestRate = (interestRate / 100.0) + 0.01;
		this.term = term;
		
		if (term.equals("long")) {
			this.mortgageAmount = MortgageConstants.longTerm * mortgageAmount;
		} else if (term.equals("medium")) {
			this.mortgageAmount = MortgageConstants.mediumTerm * mortgageAmount;
		} else {
			this.mortgageAmount  = MortgageConstants.shortTerm * mortgageAmount;
		}
		
		// debug
		/*
		System.out.println("*object business created. " + this.mortgageNumber + " " +
				this.customerName + " " + this.interestRate + " " + this.term + " " +
				this.mortgageAmount + "*");
		*/
	}

}
