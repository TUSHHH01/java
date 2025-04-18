// create source and target .txt file 


import java.io.*;

public class FileCopy {

    public static void main(String args[]) {
        String sourceFileName = "source.txt";
        String targetFileName = "target.txt";

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(sourceFileName);
            writer = new FileWriter(targetFileName);

            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                if (Character.isLetter(character)) {
                    writer.write(Character.toLowerCase(character));
                } else if (Character.isDigit(character)) {
                    writer.write('*');
                } else {
                    writer.write(character);
                }
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
