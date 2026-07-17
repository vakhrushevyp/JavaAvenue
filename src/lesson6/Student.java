package lesson6;

import java.util.Objects;

public class Student {
    private final String name;
    private int age;
    private int course;
    private double averageMark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(student.averageMark, averageMark) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, averageMark);
    }

    public void toMeet() {
        System.out.println("Привет, меня зовут " +name + ", приятно познакомиться!");
    }

    public Student(String name, int age, int course, double averageMark) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageMark() {
        return averageMark;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


}
