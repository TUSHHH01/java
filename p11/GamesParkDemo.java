// package Games;

import Games.*;
// import Games.Outdoor;

public class GamesParkDemo {
    public static void main(String[] args) {
        Indoor indoorPlayer = new Indoor();
        Outdoor outdoorPlayer = new Outdoor();

        System.out.println("Displaying Indoor Player Details:");
        indoorPlayer.display();

        System.out.println("\nDisplaying Outdoor Player Details:");
        outdoorPlayer.display();
    }
}
