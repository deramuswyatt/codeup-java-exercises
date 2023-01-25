package Grades;

import java.util.ArrayList;



public class Student {
//    private properties for the student's name, and grades
    private String name;
    private ArrayList<Integer> grades;

//    setting constructor
public Student(String name){
    this.name = name;
    this.grades = new ArrayList<>();
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
                for (Integer grade : grades) {
                    total += grade;
        }
//                    total /= grades.size();
                    return total / grades.size();
    }
}

//for(double grade : grades){
//        total += grades.size();
//        }