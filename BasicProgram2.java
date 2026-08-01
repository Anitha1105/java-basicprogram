package basicjavaprogram;

public class BasicProgram2 {

	public static void main(String[] args) {
		// Reverse a word
		String word="Communication";
		char[] arr=word.toCharArray();
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]);
		}



	}

}
