package Package;

import javax.swing.JOptionPane;

public class TestScorer {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("Hi there! Please don't lie about this ('cause I know if you do) but what was your most recent test score. Don't worry, I totally won't put it on the internet for everyone to see!! hee hee hee");
	int score2 = Integer.parseInt(score);
	JOptionPane.showMessageDialog(null, "Wait a moment...");
	JOptionPane.showMessageDialog(null, "Keep waiting...");
	if (score2 <= 100 && score2 >=97) {
		JOptionPane.showMessageDialog(null, " You got an A+! Bravo! Fantastic! Don't let it go to your head!! " );
	}
	if (score2 <= 96 && score2 >=93) {
		JOptionPane.showMessageDialog(null, " You got an A. Wonderful! " );
	}
	if (score2 <= 92 && score2 >=90) {
		JOptionPane.showMessageDialog(null, " You got an A-. Great Job! " );
	}
	if (score2 <= 89 && score2 >=87) {
		JOptionPane.showMessageDialog(null, " You got a B+! Good Job! " );
	}
	if (score2 <= 86 && score2 >=83) {
		JOptionPane.showMessageDialog(null, " You got a B. Nice! " );
	}
	if (score2 <= 82 && score2 >=80) {
		JOptionPane.showMessageDialog(null, " You got a B-. Cool! " );
	}
	if (score2 <= 79 && score2 >=77) {
		JOptionPane.showMessageDialog(null, " You got a C+! Could Be Better! " );
	}
	if (score2 <= 76 && score2 >=73) {
		JOptionPane.showMessageDialog(null, " You got a C. OK " );
	}
	if (score2 <= 72 && score2 >=70) {
		JOptionPane.showMessageDialog(null, " You got a C-. Try Harder Next time. " );
	}
	if (score2 <= 69 && score2 >=67) {
		JOptionPane.showMessageDialog(null, " You got a D+. WHAT IS WRONG WITH YOU! THAT TEST WAS SOOO EASY!!!!!!!! " );
	}
	if (score2 <= 66 && score2 >=63) {
		JOptionPane.showMessageDialog(null, " You got a D. STOP WATCHING TV AND STUDDY PEOPLE!!! " );
	}
	if (score2 <= 62 && score2 >=60) {
		JOptionPane.showMessageDialog(null, " You got a D-. HONESTLY! WHAT DO YOU DO ALL DAY? SNOOZE? " );
	}
	if (score2 <= 59 && score2 >=0) {
		JOptionPane.showMessageDialog(null, " You got an F. OK. THAT'S IT. I'M DONE. GOODBYE. AND DON'T SAY I DIDN'T WARN YOU WHEN YOU PLUMMET INTO DESPAIR!!!!! " );
	}
}
}
