package Grades;

import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Wyatt", Collections.singletonList(50));
        student1.setName("Wyatt");
        student1.addGrade(50);
//        student1.addName("phil");
        System.out.println(student1.getGradeAverage());
    }
}
