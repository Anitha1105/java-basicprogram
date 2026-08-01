package basicjavaprogram;

public class BasicProgram {

	public static void main(String[] args) {
		// reverse String
		String text="Java is a programming language";
		String[] revArr=text.split("\\s+");
		for(int i=revArr.length-1;i>=0;i--) {
			System.out.print(revArr[i]+" ");
		}



	}

}
