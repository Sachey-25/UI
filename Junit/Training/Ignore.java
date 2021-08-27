package Junit.Training;

public class Ignore {
		private String message;
		public Ignore(String message) {
		this.message=message;
	}
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	public String Message() {
		message="Hi!" + message;
		System.out.println(message);
		return message;
	}
}