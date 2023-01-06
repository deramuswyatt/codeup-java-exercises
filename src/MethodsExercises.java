import java.util.Scanner;

public class MethodsExercises {

    public static double Add(int a, int b){
        return a + b;
    }
    public static double Subtract(int a, int b){
        return a - b;
    }
    public static double Multiply(int a, int b){
        return a * b;
    }
    public static double Divide(int a, int b){
        return a / b;
    }
    public static double Modulus(int a, int b){
        return a % b;
    }


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("Invalid input. Enter a number between 1 and 10");
            return getInteger(min, max);
        }
        return userInput;
    }

    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        long factorial = 1;
        if (userInput < 1 || userInput > 10) {
            System.out.println("Invalid input. Enter a number between 1 and 10");
            return factorial();
        }
        for (int i = 1; i <= userInput; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + userInput + " is " + factorial);
        System.out.print("Do you want to continue? [y/n] ");
        String userContinue = scanner.next();
        if (userContinue.equalsIgnoreCase("y")) {
            return factorial();
        }
        return factorial;
    }

    public static int rollDice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides for a pair of dice: ");
        int userInput = scanner.nextInt();
        int dice1 = (int) (Math.random() * userInput) + 1;
        int dice2 = (int) (Math.random() * userInput) + 1;
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        System.out.print("Do you want to roll the dice again? [y/n] ");
        String userContinue = scanner.next();
        if (userContinue.equalsIgnoreCase("y")) {
            return rollDice();
        }
        return dice1 + dice2;
    }

    public static void highLow() {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.print("Guess a number between 1 and 100: ");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 100) {
            System.out.println("Invalid input. Enter a number between 1 and 100");
            highLow();
        }
        if (userInput < randomNumber) {
            System.out.println("HIGHER");
            highLow();
        }
        if (userInput > randomNumber) {
            System.out.println("LOWER");
            highLow();
        }
        if (userInput == randomNumber) {
            System.out.println("GOOD GUESS!");
        }
    }

    public static void main(String[] args) {
//        System.out.println(Add(3, 5));
//        System.out.println(Subtract(8, 4));
//        System.out.println(Multiply(5, 5));
//        System.out.println(Divide(15, 3));
//        System.out.println(Modulus(15, 3));
//        System.out.println(getInteger(3, 5));
        System.out.println(factorial());
        rollDice();
        highLow();
    }
}
