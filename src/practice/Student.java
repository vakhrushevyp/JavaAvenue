package practice;

public class Student {
    private final String firstname;
    private final String lastname;
    private final String surname;
    private final int age;
    private int[] grade;
    private String[] subject;
    int index;
    static int counter;

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
        this.index = counter;
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
        this.subject = subject;
        counter++;
    }

    public Student(int index, String lastname, String firstname, String surname, int age, int[] grade, String[] subject) {
        this.index = index;
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
        return
                index +
                        ". " + lastname +
                        " " + firstname +
                        " " + surname +
                        ", возраст=" + age +
                        ", предмет и оценка:" + outGradeAndSubject() +
                        "\n";
    }

    private String outGradeAndSubject() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grade.length; i++) {
            sb.append("\n");
            sb.append(subject[i]);
            sb.append(" - ");
            sb.append(grade[i]);
        }
        return sb.toString();
    }
}
