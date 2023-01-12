package Grades;

import java.util.ArrayList;
import java.util.*;



public class Student {
//    private properties for the student's name, and grades
    private String name;
//    private List<Integer> grades;

//    setting constructor
public Student(String name, List<Integer> grades){
    this.name = name;
//    this.grades = new ArrayList<Integer>();
}
    public static ArrayList<Integer> grades = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }
    // returns the student's name
    public String getName(){
     return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
        public double getGradeAverage(){
            double total = 0;
                for(int grade:grades){
                    total+=grade;
        }
                    total /= grades.size();
                    return total;
    }
}
