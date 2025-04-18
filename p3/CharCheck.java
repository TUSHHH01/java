// program no 3
// create abc and abe file .
import java.io.*;

public class CharCheck {
    public static void main(String args[]) {
        int i;
        try {
            FileReader fr = new FileReader("C:/Users/TUSHAR/Videos/java/Programs/P3/abc.txt");
            FileWriter fw = new FileWriter("C:/Users/TUSHAR/Videos/java/Programs/P3/abe.txt");

            while ((i = fr.read()) != -1) {
                char ch = (char) i;
                if (Character.isLetter(ch)) {
                    if (Character.isLowerCase(ch)) {
                        System.out.println(ch + " is a letter and lower case");
                        ch = Character.toUpperCase(ch);
                    } else {
                        System.out.println(ch + " is a letter and upper case");
                        ch = Character.toLowerCase(ch);
                    }
                } else if (Character.isDigit(ch)) {
                    System.out.println(ch + " is a digit");
                } else if (Character.isWhitespace(ch)) {
                    System.out.println(ch + " is a white space");
                }

                fw.write(ch);
            }

            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Successfully processed");
        }
    }
}
