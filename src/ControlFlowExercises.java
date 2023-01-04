import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        int x = 0;
//        do {
//            System.out.println(x);
//            x += 2;
//
//        }while (x <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= 0);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i <= 1000000);

//        int i = 5;
//        for (i = 0 ; i <= 15; i++){
//            System.out.println(i);
//        }

//        long i = 2;
//        for(i = 2; i <= 1000000; i *= i) {
//            System.out.println(i);
//        }

//        int i = 1;
//        for (i = 1; i <= 100; i++){
//            if (i % 15 == 0){
//                System.out.println("FIZZBUZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            }else {
//                System.out.println(i);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        boolean confirmation;
//        do{
//        System.out.println("What number would you like to go up to? ");
//        int userInput = sc.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        int i;
//        for (i = 1; i <= userInput; i++) {
//            System.out.printf("%-6d | %-7d | %d\n", i, i * i, i * i * i);
//        }
//        System.out.println("would you like to continue [y,n]");
//        String userInput2 = sc.next();
//        confirmation = userInput2.equalsIgnoreCase("y");
//    }while(confirmation);
//        System.out.println("See you next time.");

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your numerical grade from 0 to 100? ");
        int userGrade = Integer.parseInt(sc.nextLine());
        if (userGrade >= 88) {
            System.out.println("Your letter grade is an A.");
        } else if (userGrade >= 80) {
            System.out.println("Your letter grade is a B.");
        } else if (userGrade >= 67) {
            System.out.println("Your letter grade is a C.");
        } else if (userGrade >= 60) {
            System.out.println("Your letter grade is a D.");
        } else {
            System.out.println("Your letter grade is an F.");
        }

    }
}
