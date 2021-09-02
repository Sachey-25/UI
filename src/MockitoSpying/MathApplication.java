package MockitoSpying;

public class MathApplication {
	private CalculatoreService calcservice;
	
	public void setCalculatoreService(CalculatoreService calcservice) {
		this.calcservice=calcservice;
	}
	public double add(double input_one, double input_two) {
		return calcservice.add(input_one, input_two);
	}
	public double subtract(double input_one, double input_two) {
		return calcservice.add(input_one, input_two);
	}
	public double multiply(double input_one, double input_two) {
		return calcservice.add(input_one, input_two);
	}
	public double divide(double input_one, double input_two) {
		return calcservice.add(input_one, input_two);
	}

}
