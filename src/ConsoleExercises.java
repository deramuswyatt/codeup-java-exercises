import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + pi + ".");
//        System.out.format("The value of pi is approximately %s.%n", pi);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: \"" + userInput + "\" ");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Write three words:");
//        String first = scan.nextLine();
//        String second = scan.nextLine();
//        String third = scan.nextLine();
//        System.out.format("You wrote: %s, %s, %s.%n", first, second, third);
//
//        Scanner sentence = new Scanner(System.in);
//        System.out.println("Write a sentence for me. ");
//        String userInput2 = sentence.nextLine();
//        System.out.println("You wrote: " + userInput2);

        Scanner area = new Scanner(System.in);
        area.useDelimiter("\n");
        System.out.println("What is the length of your room? ");
        float len = area.nextFloat();
        System.out.println("What is the width of your room? ");
        float wid = area.nextFloat();
        System.out.println("What is the height of your room?");
        float hei = area.nextFloat();
        System.out.println("The area of your room is: " + (len * wid) + "ft.");
        System.out.println("The perimeter of your room  is: " + (2*(len + wid)) + "ft.");
        System.out.println("The volume of your room is: " + (wid * hei * len) + "ft.");

    }
}
