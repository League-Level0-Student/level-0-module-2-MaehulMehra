package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "How old are you?");
		int ageInt = Integer.parseInt(age);
		if (ageInt >= 18) {
			JOptionPane.showInputDialog(null, "Who do you want the next president to be?");
					}
		else {
			JOptionPane.showMessageDialog(null, "No one cares what you think");
		}
	}

}
