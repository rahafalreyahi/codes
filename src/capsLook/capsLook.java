package capsLook;

import java.util.Scanner;

public class capsLook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.next();
		String  word2 = word.substring(1);
		String firstLetter = (String.valueOf(word.charAt(0)));
		if (word.matches("[A-Z]"))
			System.out.println(word.toLowerCase());
		
		else if (word.matches("[a-z][A-Z]*"))
			System.out.println(firstLetter.toUpperCase()+word2.toLowerCase());
			
		else 
			System.out.println(word);

		
		
		
	}
		
	


}
	


