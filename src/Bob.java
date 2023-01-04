import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("My name is Bob, let's have a chat.");
        String userInput = keyboard.nextLine();
        if (userInput.endsWith("?")){
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (userInput.contains("t")) {
            System.out.println("you got it Wyatt.");
        } else {
            System.out.println("whateva");
        }
    }
}
