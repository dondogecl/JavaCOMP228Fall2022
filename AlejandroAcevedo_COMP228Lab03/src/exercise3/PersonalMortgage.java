package exercise3;

public class PersonalMortgage extends Mortgage{

	
	public PersonalMortgage(int mortgageNumber, String customerName, double interestRate, double mortgageAmount, String term) {
		this.mortgageNumber = mortgageNumber;
		this.customerName = customerName;
		this.interestRate = (interestRate / 100.0 ) + 0.02;
		this.term = term;
		
		if (term.equals("long")) {
			this.mortgageAmount = MortgageConstants.longTerm * mortgageAmount;
		} else if (term.equals("medium")) {
			this.mortgageAmount = MortgageConstants.mediumTerm * mortgageAmount;
		} else {
			this.mortgageAmount  = MortgageConstants.shortTerm * mortgageAmount;
		}
		
		// debug
		/* System.out.println("*object personal created. " + this.mortgageNumber + " " +
				this.customerName + " " + this.interestRate + " " + this.term + " " +
				this.mortgageAmount + "*");
		*/
	}
}
	

