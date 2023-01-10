//package util;
//
//import java.util.Objects;
//import java.util.Scanner;
//
//public class Input {
//private Scanner scanner;
//
//    public Input() {
//        scanner = new Scanner(System.in);
//
//    }
//    public static String getString(){
//        System.out.println("Enter a string: ");
//        return scanner.nextLine();
//    }
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static String getString(){
//        System.out.println("Enter a string: ");
//        String string = scanner.nextLine();
//        return string;
//    }
//
//   public static boolean yesNo(){
//       System.out.println("Enter y for yes or n for no");
//       String userInput = scanner.next();
//       return Objects.equals(userInput, "y") || Objects.equals(userInput, "yes");
//   }
//
//    public static int getInt(int min, int max) {
//        int userInput;
//        do {
//            System.out.println("Enter a number 1-10");
//            userInput = scanner.nextInt();
//        } while (userInput < min || userInput > max);
//        System.out.println("Invalid input. Enter a number between 1 and 10");
//        return getInt(min, max);
//    }
//
//    public int getInt(){
//int userInput = scanner.nextInt();
//return userInput;
//    }
////
////    double getDouble(double min, double max){
////
////    }
////
////    double getDouble(){
////
////    }
//    public static void main(String[] args) {
//        yesNo();
//        System.out.println(getInt(1, 10));
//    }
//
//
//
//
//}
