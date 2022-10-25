package exercise2;

public class PartTimeGameTester extends GameTester{
	private int numberOfHours;
	final double hourlySalary = 20;
	
	public PartTimeGameTester() {
		System.out.println("Part-time game tester created.");
		this.status = true;
	}
	
	
	public void setHours(int hours) {
		this.numberOfHours = hours;
	}
	
	@Override
	public double getSalary() {
		// part-time testers get a hourly rate
		return numberOfHours * hourlySalary * 4;
	}
	

}
