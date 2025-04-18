// Write a java program which accepts an email address of user.
//  If the email does not contain ‘@’ symbol, then throw an user defined exception ‘Invalid email id’. 
import java.util.Scanner;

class InvalidEmail extends Exception {
    InvalidEmail() {
        super();
    }

    InvalidEmail(String str) {
        super(str);
    }

    @Override
    public String getMessage() {
        return "Invalid email id: " + super.getMessage();
    }
}

public class _18email {
    public static void main(String[] args) {
        try {
            System.out.println("Enter email ID:");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            int count = 0;
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    count++;
                }
            }
            if (count != 1) {
                throw new InvalidEmail("Email must contain exactly one '@' symbol");
            }
            System.out.println("Email is valid");
        } catch (InvalidEmail e) {
            System.out.println("Invalid email: " + e.getMessage());
        }
    }
}
