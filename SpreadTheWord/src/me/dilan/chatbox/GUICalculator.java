package me.dilan.chatbox;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class GUICalculator {


	public GUICalculator() {

		String op = JOptionPane.showInputDialog(null, "Enter an operation", "CALCULATOR BY DILAN YESSSSS", JOptionPane.INFORMATION_MESSAGE);

		


	}

	public String solve(String s) {
		if (s.contains("+")) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '+') {
					String m1 = solve(s.split("+")[0]);
					String m2 = solve(s.split("+")[1]);
					
					
				}
			}
		}
	}

	public int getAmountOfChar(String s, char c) {
		int r = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (x == c) r++;
		}
		return r;
	}

	public static void main(String[] args) {
		new GUICalculator();
	}

	public void error(String message) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
		new GUICalculator();
	}
}
