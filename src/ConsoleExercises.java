import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
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
//        System.out.format("You wrote: %n %s%n %s%n %s%n", first, second, third);
//
//        Scanner sentence = new Scanner(System.in);
//        System.out.println("Write a sentence for me. ");
//        String userInput2 = sentence.nextLine();
//        System.out.println("You wrote: " + userInput2);

        Scanner area = new Scanner(System.in);
//        area.useDelimiter("\n");
        System.out.println("What is the length of your room? ");
        String userLength = area.nextLine();
        float len = Float.parseFloat(userLength);
        System.out.println("What is the width of your room? ");
        float wid = Float.parseFloat(area.nextLine());
        System.out.println("What is the height of your room?");
        float hei = Float.parseFloat(area.nextLine());

        System.out.println("The area of your room is: " + (len * wid) + "ft.");
        System.out.println("The perimeter of your room  is: " + (2*(len + wid)) + "ft.");
        System.out.println("The volume of your room is: " + (wid * hei * len) + "ft.");
    }
}
