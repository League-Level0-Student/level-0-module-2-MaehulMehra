package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryTickets {
	public static void main(String[] args) {
		String message = "Lottery Numbers:";
		for (int i = 0; i < 6; i++) {
			Random randomMaker = new Random ();
			int randomNumber = randomMaker.nextInt (50);
			message = message +  " " + randomNumber + " ";
		}
		JOptionPane.showMessageDialog(null, message);
	}

}
