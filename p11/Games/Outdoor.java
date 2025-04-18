package Games;

public class Outdoor {
    String name;
    int age;
    int teamSize;

    public Outdoor() {
        name = "ABC";
        age = 18;
        teamSize = 11;
    }

    public Outdoor(String s, int a, int t) {
        name = s;
        age = a;
        teamSize = t;
    }

    public void display() {
        System.out.println("In Outdoor games, player details are as follows:");
        System.out.println("Name: " + name + ", Age: " + age + ", Team Size: " + teamSize);
    }
}
