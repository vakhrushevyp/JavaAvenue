package practice;


import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    DB db = new DB();
    Student[] students = db.getAllStudents();

    public void setGradeAndSubject(int studentID, String subject, int grade) {
        int[] grade1 = students[studentID].getGrade();
        int[] grade2 = new int[grade1.length + 1];
        System.arraycopy(grade1, 0, grade2, 0, grade1.length);
        grade2[grade2.length - 1] = grade;
        String[] subject1 = students[studentID].getSubject();
        String[] subject2 = new String[subject1.length + 1];
        System.arraycopy(subject1, 0, subject2, 0, subject1.length);
        subject2[subject2.length - 1] = subject;
        Student student = new Student(studentID, students[studentID].getLastname(), students[studentID].getFirstname(),
                students[studentID].getSurname(), students[studentID].getAge(), grade2, subject2);
        students[studentID] = student;
    }

    public void mainMenu() {
        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Внести оценку");
        System.out.println("2 - Посмотреть оценки студентов");
        System.out.println("3 - Вывести средний балл по всем студентам");
        System.out.println("0 - Выйти назад или сохранить результат");
        Scanner scanner = new Scanner(System.in);
        int mainMenuChoice = scanner.nextInt();
        scanner.nextLine();

        if (mainMenuChoice == 1) {
            System.out.println(Arrays.toString(db.getAllStudents()));
            System.out.println("Введите через пробелы: Номер студента, предмет, оценку, например: 1 География 5, " +
                    "после чего нажмите ENTER, чтобы ввести следующие данные. Для выхода из режима ввода введите 0 и ENTER");
            String input = scanner.nextLine();
            while (!input.equals("0")) {
                String[] values = input.split(" ");
                setGradeAndSubject(Integer.parseInt(values[0]), values[1], Integer.parseInt(values[2]));
                input = scanner.nextLine();
            }
            mainMenu();
        } else if (mainMenuChoice == 2) {
            System.out.println(Arrays.toString(db.getAllStudents()));
            mainMenu();
        } else if (mainMenuChoice == 3) {
            double average = 0;
            long counter = 0;
            for (Student student : students) {
                average = average + Arrays.stream(student.getGrade()).sum();
                counter = counter + Arrays.stream(student.getGrade()).count();
            }
            average = average / counter;
            System.out.println("Средняя оценка по всем студентам: " + average);
            System.out.println();
            mainMenu();
        }
    }
}
