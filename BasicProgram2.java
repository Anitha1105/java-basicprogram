package basicjavaprogram;

public class BasicProgram2 {

	public static void main(String[] args) {
		// reverse String
		String text="Java is a programming language";
		String[] revArr=text.split("\\s+");
		for(int i=revArr.length-1;i>=0;i--) {
			System.out.print(revArr[i]+" ");
		}
		System.out.println();
		// Reverse a word
		String word="Communication";
		char[] arr=word.toCharArray();
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]);
		}



	}

}
