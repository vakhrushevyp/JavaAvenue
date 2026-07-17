package lesson6;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Юрий", 20, 4, 4.9);
        Student student2 = new Student("Олег", 21, 5, 4.3);
        Student student3 = new Student("Юрий", 20, 4, 4.9);
        System.out.println();

        student1.toMeet();
        student2.toMeet();
        System.out.println(student1.getName());
        System.out.println(student1);
        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));

    }
}
