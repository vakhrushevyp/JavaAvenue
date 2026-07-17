package practice;

import java.util.Arrays;

public class Student {
    private String firstname;
    private String lastname;
    private String surname;
    private int age;
    private int[] grade;
    private String[] subject;

    public void setGrade(int[] grade) {
        this.grade = grade;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Student(String lastname, String firstname, String surname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int[] getGrade() {
        return grade;
    }

    public String[] getSubject() {
        return subject;
    }

    public Student(String lastname, String firstname, String surname, int age, int[] grade, String[] subject) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.subject = subject;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", grade=" + Arrays.toString(grade) +
                ", subject=" + Arrays.toString(subject) +
                '}';
    }
}
