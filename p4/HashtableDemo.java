import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<String, Double>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, maxKey = "";
        double sal = 0.0, max = 0.0;
        int flag = 1;

        try {
            // Accepting data from user and inserting into the Hashtable
            while (flag == 1) {
                System.out.println("Enter Employee Name:");
                name = br.readLine();
                System.out.println("Enter the Salary:");
                sal = Double.parseDouble(br.readLine());
                hashtable.put(name, sal);
                System.out.println("Enter 1 to enter more details, otherwise enter 2:");
                flag = Integer.parseInt(br.readLine());
                System.out.print("Selected flag " + flag);
            }

            // Retrieving all keys and values from the Hashtable
            System.out.println("\nRetrieving all keys and values from the Hashtable");
            Set<String> s = hashtable.keySet();
            Iterator<String> itr = s.iterator();
            while (itr.hasNext()) {
                name = itr.next();
                sal = hashtable.get(name);
                if (sal > max) {
                    maxKey = name;
                    max = sal;
                }
            }

            System.out.println("Employee having maximum Salary is: " + maxKey + " Salary: " + max);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
