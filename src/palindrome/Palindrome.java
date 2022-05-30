package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a word to test if it is a palindrome: ");
		String str = scanner.next();
		if(isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is NOT a palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		StringBuilder reversedString = new StringBuilder(str).reverse();
		return str.equals(reversedString.toString());
	}

}
