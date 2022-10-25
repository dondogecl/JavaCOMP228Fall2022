package exercise2;

public class FullTimeGameTester extends GameTester{

	public FullTimeGameTester() {
		System.out.println("Full-time game tester created.");
		this.status = false; 
	}
	
	@Override
	public double getSalary() {
		// fixed salary
		return 3000.0;
	}

}
