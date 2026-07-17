package practice;


import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    DB db = new DB();
    Student[] students = db.getStudents();


    public void setGradeAndSubject(int studentID, int grade, String subject) {
       int[] grade1 = students[studentID].getGrade();
       int[] grade2 = new int[grade1.length+1];
       System.arraycopy(grade1, 0, grade2, 0, grade1.length);
       grade2[grade2.length - 1] = grade;
       String[] subject1 = students[studentID].getSubject();
       String[] subject2 = new String[subject1.length + 1];
       System.arraycopy(subject1,0,subject2,0, subject1.length);
       subject2[subject2.length - 1] = subject;
       Student student = new Student(students[studentID].getLastname(),students[studentID].getFirstname(),
               students[studentID].getSurname(), students[studentID].getAge(), grade2, subject2 );
       students[studentID] = student;
    }

    public void mainMenu() {

        System.out.println("Выберите пункт меню:");
        System.out.println("1 - Внести оценку");
        System.out.println("2 - Посмотреть оценки студентов");

        Scanner scanner = new Scanner(System.in);
        int mainMenuChoice = scanner.nextInt();
        scanner.nextLine();
        if (mainMenuChoice == 1) {
            String input = scanner.nextLine();
           while (!input.equals("0")) {
               String[] values = input.split(" ");
               setGradeAndSubject(Integer.parseInt(values[0]), Integer.parseInt(values[1]), values[2]);
               input = scanner.nextLine();
               System.out.println(Arrays.toString(db.getAllStudents()));
           }
        }
    }


}
