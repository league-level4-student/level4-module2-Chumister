package StringMethods;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
		if (s1.length()>s2.length()) {
			return s1;
		}
		return s2;
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		if (s.contains("underscores")) {
			s.replaceAll("underscores", "spaces");
		}
		return null;
	}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
			String[] arr1 = s1.split(" ", 0);
			String[] arr2 = s2.split(" ", 0);
			String[] arr3 = s3.split(" ", 0);
			int count = 0;
			String temp;
	        String str[] = new String[count];
		for (int i = 0; i < s1.length(); i++) {
			 for (int j = i + 1; j < s2.length(); j++) { 
	                if (str[i].compareTo(arr1[j])>0) 
	                {
	                    temp = arr1[i];
	                    arr1[i] = arr1[j];
	                    arr1[j] = temp;
	                }
	            }
		}
		return null;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		
		return 0;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		int count = 0;
		int lastIndex=0;
		while (lastIndex != -1) {
		    lastIndex = s.indexOf(substring,lastIndex);

		    if( lastIndex != -1)
		        count++;

		    lastIndex += substring.length();
		}

		System.out.println(count);
		return 0;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		
		Utilities.encrypt(s, key);
		return null;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		Utilities.decrypt(s, key);
		return null;
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		
		return 0;
	}
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		String reverse = new String(s);
		if (s.equals(reverse)) {
			return true;
		}
		return false;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static void decrypt(String s, char key) {
		// TODO Auto-generated method stub
		
	}

	public static void encrypt(String s, char key) {
		// TODO Auto-generated method stub
		
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}
