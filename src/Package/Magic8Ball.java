package Package;

// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
		public static void main(String[] args) {
			
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		int random = new Random().nextInt(4);
	// 3. Print out this variable
		System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
		
	// 5. If the random number is 0
		if (random == 0) {
	// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null, "Yes-er-ee!!!");
		}
	// 6. If the random number is 1
		if (random == 1) {
	// -- tell the user "No"
		JOptionPane.showMessageDialog(null, "NO, YOU FOOL!!");
		}
	// 7. If the random number is 2
		if (random == 2) {
	// -- tell the user "Maybe you should ask Google?"
		JOptionPane.showMessageDialog(null, "Ask GOOGLE, you DUM DUM! I DON'T know EVERYTHING!!!");
		}
	// 8. If the random number is 3
		if (random == 3) {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "YOU BROKE THE BALL YOU IDJIT!! ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR ERROR (e.t.c.)");
		}
}

}
