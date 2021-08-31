package Junit.Training.Sample;

public class junitmsg {
	
	private String message;
	
	public junitmsg(String message) {
		this.message=message;
	}
	public void printmessage() {
		System.out.println(message);
		int divide = 1/0 ; //Arithmetic Exception.
	}
	public String printHimessage() {
		message = "Hi!" + message;
		System.out.println(message);
		return message;
	}

}
