package Package;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	int Pusheen = 0;
	int HelloKitty = 0;
	int FlatCat = 0;
	
	
	for (int i = 0; i < 10; i++) {
		String vote = JOptionPane.showInputDialog("Who would you like to be Ruler of Earth!!(dum dum daaaaaaaaaaaaa) Your choices are Pusheen, Hello Kitty, or Flat Cat.");
		if (vote.equals("Pusheen")) {
			Pusheen++;
		}
		else if (vote.equals("Hello Kitty")) {
			HelloKitty++;
		}
		else if (vote.equals("Flat Cat")) {
			FlatCat++;
		}
		if (Pusheen > HelloKitty && Pusheen > FlatCat) {
			JOptionPane.showMessageDialog(null, "Pusheen wins! She'll fill the world with happiness!");
		}
		if (HelloKitty > Pusheen && HelloKitty > FlatCat) {
			JOptionPane.showMessageDialog(null, "Hello Kitty wins! She'll fill the world with love!");
		}
		if (FlatCat > Pusheen && FlatCat > HelloKitty) {
			JOptionPane.showMessageDialog(null, "Flat Cat wins! Everyone will finally know who she is! (Your Welcome Kaavia!;) ");
		}
		
	}
}
}
