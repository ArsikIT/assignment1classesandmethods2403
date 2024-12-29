//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import models.School;
import models.Student;
import models.Person;
import models.Teacher;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Harry", "Potter", 21,true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);

        Student student2 = new Student("Ron", "Qeasley", 20,true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        student2.addGrade(82);

        Student student3 = new Student("Hermione", "Granger", 19,false);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        student3.addGrade(100);
        student3.addGrade(96);
        student3.addGrade(97);

        Student student4 = new Student("Luna", "Lovegood", 20,false);
        student4.addGrade(46);
        student4.addGrade(87);
        student4.addGrade(67);
        student4.addGrade(79);
        student4.addGrade(96);
        student4.addGrade(58);
        student4.addGrade(83);

        Student student5 = new Student("Draco", "Malfoy", 19,true);
        student5.addGrade(21);
        student5.addGrade(45);
        student5.addGrade(0);
        student5.addGrade(9);
        student5.addGrade(51);
        student5.addGrade(43);

        Teacher teacher1 = new Teacher("Severus", "Snape", 51,true, "Math", 7, 800000);
        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71,true, "Pholosophy", 25, 1500000);
        Teacher teacher3 = new Teacher("Minerva", "McGonagall", 62,false, "Sociology", 17, 1100000);
        Teacher teacher4 = new Teacher("Bellatrix", "Lestrange", 35,false, "Programming", 3, 570000);
        Teacher teacher5 = new Teacher("Sirius", "Black", 49,true, "Physics", 9, 750000);

        school.addMember(student1);
        school.addMember(student2);
        school.addMember(student3);
        school.addMember(student4);
        school.addMember(student5);


        school.addMember(teacher1);
        school.addMember(teacher2);
        school.addMember(teacher3);
        school.addMember(teacher4);
        school.addMember(teacher5);

        System.out.println("School Members: ");
        school.displayMembers();

        System.out.println("\nGPA of Students:");
        System.out.println(student1.toString() + "GPA: " + student1.calculateGPA());
        System.out.println(student2.toString() + "GPA: " + student2.calculateGPA());
        System.out.println(student3.toString() + "GPA: " + student3.calculateGPA());
        System.out.println(student4.toString() + "GPA: " + student4.calculateGPA());
        System.out.println(student5.toString() + "GPA: " + student5.calculateGPA());

        System.out.println("\nSalary Updates for Teachers with >10 years of Experience:");
        if (teacher2.yearsOfExperience > 10) {
            teacher2.giveRaise(10);
            System.out.println(teacher2.toString() + "New salary: " + teacher2.salary);
        }
        if (teacher3.yearsOfExperience > 10) {
            teacher3.giveRaise(10);
            System.out.println(teacher3.toString() + "New salary: " + teacher3.salary);
        }
     }
}

