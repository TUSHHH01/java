import java.util.*;

public class ArrayStudent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the number of students:");
        n = sc.nextInt();
        sc.nextLine(); // Consume newline

        ArrayList<String> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = sc.nextLine();

            if (!studentList.contains(name)) {
                studentList.add(name);
            } else {
                System.out.println("Duplicate name found. Ignoring...");
            }
        }

        Collections.sort(studentList);

        System.out.println("Student names in ascending order:");
        for (String name : studentList) {
            System.out.println(name);
        }

        sc.close();
    }
}
