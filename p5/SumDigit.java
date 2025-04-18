import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class SumDigit {
    static void calc(int n) {
        int first = 0, last = n % 10;
        while (n >= 10) {
            first = n % 10;
            n = n / 10;
        }
        System.out.println("Sum of first and last digit is: " + (first + last));
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        try {
            if (n == 0) {
                throw new MyException("Number is 0");
            } else {
                calc(n);
            }
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Goodbye...");
        }
    }
}
