package basicjavaprogram;

public class FactorialProgram {

	public static void main(String[] args) {
		// Factorial Program
		int factNumber=5;
		long factValue=1;
		for(int i=factNumber;i>=1;i--) {
			factValue=factValue*i;
		}
		System.out.println("Factorial value is "+factValue);

	}

}
