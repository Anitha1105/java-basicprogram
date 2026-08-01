package basicjavaprogram;

public class BasicProgram {

	public static void main(String[] args) {
		// reverse String
		String text="Java is a programming language";
		String[] revArr=text.split("\\s+");
		for(int i=revArr.length-1;i>=0;i--) {
			System.out.print(revArr[i]+" ");
		}
			// Another way of reverse string
		String textInput="Selenium is an automation tool";
	    String stringArr[]=textInput.split("\\s+");
	    String reverseString="";
	
	
	for(int j=stringArr.length-1;j>=0;j--)
	{
		reverseString=reverseString+stringArr[j]+" ";
		
	}
	System.out.println();
	System.out.println(reverseString);



	}

}
