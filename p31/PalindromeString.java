import java.io.*;
import java.util.Scanner;

class PalindromeString {

	public static boolean isPalindrome(String str)
	{
		String rev = "";

		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}
	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		str = str.toLowerCase();
		boolean isPalindrome= isPalindrome(str);
		
		if(isPalindrome==true)
		{
		System.out.println("Given string is palindrome");
		}else
		{
			System.out.println("Given string is not palindrome");
		}
	}
}
