package models;

public class Teacher extends Person {

    private String subject;
    public int yearsOfExperience;
    public double salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;

    }
    public void giveRaise(double percentage) {
        salary += salary * (percentage / 100);
    }
    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
