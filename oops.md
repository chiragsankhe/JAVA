import java.util.*;
import java.lang.*;
import java.io.*;

class Pen { // Class names should start with uppercase as per Java conventions
    String name;
    String color;
    int price;

    public void sell() {
        System.out.println("Name: " + name + ", Color: " + color + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking user input
        String name = scn.nextLine();
        String color = scn.nextLine();
        int price = scn.nextInt();

        // Creating an object of Pen class
        Pen pen1 = new Pen();

        // Correctly assigning values
        pen1.name = name;
        pen1.color = color;
        pen1.price = price;

        // Calling the sell method
        pen1.sell();

        scn.close(); // Closing Scanner to prevent resource leak
    }
}
