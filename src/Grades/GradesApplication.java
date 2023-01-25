package Grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void runApp(HashMap<String, Student> students, Input in) {
        System.out.println("Hello, and welcome to CGA-CLI!\nHere is the list of available students:");
        String usernameList = "";
        for (HashMap.Entry<String, Student> student : students.entrySet()) {
//            usernameList += "|" + student.getKey() + "| ";
            usernameList = String.format("%s| %s | ", usernameList, student.getKey());
        }
        System.out.println(usernameList);
        System.out.println("Which student would you like information about?");
        String studentUN = in.getString();
        try {
            System.out.printf("Student Name: \"%s\";%nStudent GitHub Username: \"%s\";%nStudent Grade Average: %.2f;%n", students.get(studentUN).getName(), studentUN, students.get(studentUN).getGradeAverage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("I'm sorry, but that username is not valid.");
        } catch (Exception e) {
            System.out.println("I'm sorry, but something has gone wrong.");
        } finally {
            System.out.println("Do you wish to continue to use the CGA-CLI?");
            boolean resp = in.yesNo();
            if (resp) {
                runApp(students, in);
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student willie = new Student("willie");
        willie.addGrade(100);
        willie.addGrade(79);
        willie.addGrade(85);
        Student bryan = new Student("bryan");
        bryan.addGrade(98);
        bryan.addGrade(90);
        bryan.addGrade(85);
        Student darna = new Student("darna");
        darna.addGrade(100);
        darna.addGrade(100);
        darna.addGrade(100);
//        System.out.println(adam.getGradeAverage());
//        System.out.println(john.getGradeAverage());
//        System.out.println(jessica.getGradeAverage());
//        System.out.println(javier.getGradeAverage());

        students.put("Willie92", willie);
        students.put("Bryan67", bryan);
        students.put("Darna_we_Here", darna);
        Input input = new Input();
        runApp(students, input);
    }
}




//package Grades;
//
//import util.Input;
//
//import java.util.HashMap;
//
//public class GradesApplication {
////    public static void runApp(HashMap<String, Student> students, Input input) {
//        System.out.println("Hello welcome to BP University!\nHere are the student enrolled: ");
//        String usernameList = "";
//        for (HashMap.Entry<String, Student> student : students.entrySet()) {
//            usernameList += "|" + student.getKey() + "|";
////            System.out.println(entry.getKey() + " | " + entry.getValue().getName());
//            usernameList = String.format("%s| %s | ", usernameList, student.getKey());
//        }
//        System.out.println(usernameList);
//        System.out.println("which student to look up? ");
////        String studentUsername = input.getString();
//        System.out.println("Which student would you like information about?");
//    }
//
//
//
//    public static void main(String[] args) {
//        HashMap<String, Student> students = new HashMap<>();
//
//
//        Student willie = new Student("willie");
//        willie.addGrade(98);
//        willie.addGrade(93);
//        willie.addGrade(97);
//        Student kelly = new Student("kelly");
//        kelly.addGrade(87);
//        kelly.addGrade(90);
//        kelly.addGrade(82);
//        Student lily = new Student("lily");
//        lily.addGrade(100);
//        lily.addGrade(98);
//        lily.addGrade(92);
//        System.out.println(willie.getGradeAverage());
//        System.out.println(kelly.getGradeAverage());
//        System.out.println(lily.getGradeAverage());
//
////puts into hashmap username, +studentname
//        students.put("willie97", willie);
//        students.put("kellyTheGoat", kelly);
//        students.put("Lilith-is-the-name", lily);
////
//        Input input = new Input();
//    }

//        if (students.containsKey(studentUN)){
//            "Student Name: \"%s\":%nStudent Github userName: \"%s\
//        }


//}
