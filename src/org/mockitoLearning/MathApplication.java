package org.mockitoLearning;

public class MathApplication {
	private CalculatoreService calculatoreService;
	
	public void setCalculatoreService(CalculatoreService calculatoreService) {
		this.calculatoreService=calculatoreService;
	}
	
	//Look for mathmatical opeations -- add, multiply, substract, divide
	public double add(double input_one, double input_two) {
		return calculatoreService.add(input_one, input_two);
	}
	public double substract(double input_one, double input_two) {
		return calculatoreService.add(input_one, input_two);
	}
	public double multiply(double input_one, double input_two) {
		return calculatoreService.add(input_one, input_two);
	}
	public double divide(double input_one, double input_two) {
		return calculatoreService.add(input_one, input_two);
	}
}
