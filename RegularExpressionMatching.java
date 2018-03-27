import java.io.*;
import java.util.*;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("Manasi", "Manasi"));
		System.out.println(isMatch("Manas", "Manasi*a*b*"));
		System.out.println(isMatch("", "a*b*"));
		System.out.println(isMatch("abbbbccc", "a*ab*bbbbc*"));
		System.out.println(isMatch("abbbbccc", "aa*bbb*bbbc*"));
		System.out.println(isMatch("abbbbccc", ".*bcc"));
		System.out.println(isMatch("abbbbccc", ".*bcc*"));
		System.out.println(isMatch("abbbbccc", ".*bcc*"));
		System.out.println(isMatch("aaa", "ab*a*c*a"));
	}

	public static boolean isMatch(String txt, String pat) {
		char[] text = txt.toCharArray();
		char[] pattern = pat.toCharArray();
		boolean[][] T = new boolean[text.length + 1][pattern.length + 1];

		T[0][0] = true;

		for (int i = 1; i < T[0].length; i++) {
			if (pattern[i - 1] == '*')
				T[0][i] = T[0][i - 2];
		}

		for (int i = 1; i < T.length; i++) {
			for (int j = 1; j < T[0].length; j++) {
				if (pattern[j - 1] == '.' || pattern[j - 1] == text[i - 1]) {
					T[i][j] = T[i - 1][j - 1];
				} else if (pattern[j - 1] == '*') {
					T[i][j] = T[i][j - 2];
					if (pattern[j - 2] == '.' || pattern[j - 2] == text[i - 1]) {
						T[i][j] = T[i][j] | T[i - 1][j];
					}
				} else {
					T[i][j] = false;
				}
			}
		}
		return T[text.length][pattern.length];
	}
}