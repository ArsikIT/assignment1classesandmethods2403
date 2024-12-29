package models;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private ArrayList<Integer> grades;
    private static int idGenerator = 1;

    private void generateID(){
        studentID = idGenerator++;
    }

    public Student(String name, String surname, int age, boolean gender){
        super(name, surname, age, gender);
        generateID();
        grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double calculateGPA() {
        double sumGPA = 0.0;
        for (Integer grade : grades) {
            sumGPA += convertGradeToGPA(grade);
        }

        return sumGPA / grades.size();
    }

    private static double convertGradeToGPA(int grade) {
        if (grade >= 95) return 4.0;
        if (grade >= 90) return 3.67;
        if (grade >= 87) return 3.33;
        if (grade >= 83) return 3.00;
        if (grade >= 83) return 3.00;
        if (grade >= 80) return 2.67;
        if (grade >= 77) return 2.33;
        if (grade >= 73) return 2.00;
        if (grade >= 70) return 1.67;
        if (grade >= 60) return 1.00;
        if (grade >= 0) return 0.00;
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() +"I am a student with ID " + studentID + ".";
    }
}
