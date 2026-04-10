import java.util.ArrayList;
import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();

        String name = SafeInput.getNonZeroLenString(scanner, "Enter a firend's name or type Quit to quit");

        while (!name.equals("Quit")) {
            friends.add(name);
            name = SafeInput.getNonZeroLenString(scanner, "Enter a friend's first name or type Quit to quit");
        }

        System.out.println("\nHere are your friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
        System.out.println("You have " + friends.size() + " friends.");
    }
}