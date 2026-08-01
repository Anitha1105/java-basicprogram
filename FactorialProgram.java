package basicjavaprogram;

public class FactorialProgram {

	public static void main(String[] args) {
		// Factorial Program--Changes
		int factorialNumber=5;
		long factorialValue=1;
		for(int i=factorialNumber;i>=1;i--) {
			factorialValue=factValue*i;
		}
		System.out.println("Factorial value is "+factorialValue);

	}

}
