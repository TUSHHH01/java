package Games;

public class Indoor {
    String name;
    int age;

    public Indoor() {
        name = "ABC";
        age = 18;
    }

    public Indoor(String s, int a) {
        name = s;
        age = a;
    }

    public void display() {
        System.out.println("In Indoor games, player details are as follows:");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
