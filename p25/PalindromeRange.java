// Java Program to print all palindromes in a given range

class PalindromeRange
{
	
	// A function to check if n is palindrome
		
	static int isPalindrome(int n) {

//converting int to string
		String str = String.valueOf(n);

//reversing string uaing StringBuffer
		StringBuilder reverse = new StringBuilder(str).reverse();

		int palnumber = n;
		//reconverting String to Integer for checking palindrome numbers
		palnumber = Integer.valueOf(reverse.toString());
		return (n == palnumber) ? 1 : 0;
	}
	
	// prints palindrome between min and max
	static void countPal(int min, int max)
	{
		for (int i = min; i <= max; i++)
			if (isPalindrome(i)==1)
				System.out.print(i + " ");
	}
	
	// Driver Code
	public static void main(String args[])
	{
		countPal(1, 200);
	}
}