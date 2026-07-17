package practice;

public class DB {


    public String getStudentFIO(int number) {
        return students[number].getLastname() + " " + students[number].getFirstname()  ;
    }

    private Student[] students = new Student[]     {
            new Student("Иванов",  "Иван", "Иванович", 16, new int[1], new String[1]),
            new Student("Петров",  "Петр", "Петрович", 17, new int[1], new String[1]),
            new Student("Сергеев",  "Сергей", "Сергеевич", 18, new int[1], new String[1]),
            new Student("Александров",  "Александр", "Александрович", 16,new int[1], new String[1]),
    };

    public Student[] getAllStudents(){
        return students;
    }

    public Student[] getStudents() {
        return students;
    }
}
