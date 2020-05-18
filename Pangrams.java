package org.capg.programs;

public class Pangrams {

	// Returns true if the string
	// is pangram else false
	public static boolean checkPangramString(String str) {

		boolean[] mark = new boolean[26];

		int index = 0;

		// Traverse all characters
		for (int i = 0; i < str.length(); i++) {
			// If uppercase character, subtract 'A'
			// to find index.
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			// If lowercase character, subtract 'a'
			// to find index.
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';
			else
				continue;
			mark[index] = true;
		}

		// Return false if any character is unmarked
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);

		// If all characters were present
		return (true);
	}

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";

		if (checkPangramString(str) == true)
			System.out.print(str + " is a pangram.");
		else
			System.out.print(str + " is not a pangram.");
	}

}
