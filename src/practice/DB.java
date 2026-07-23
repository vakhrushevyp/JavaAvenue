package practice;

public class DB {

    private Student[] students = new Student[]{
            new Student("Иванов", "Иван", "Иванович", 16, new int[0], new String[0]),
            new Student("Петров", "Петр", "Петрович", 17, new int[0], new String[0]),
            new Student("Сергеев", "Сергей", "Сергеевич", 18, new int[0], new String[0]),
            new Student("Александров", "Александр", "Александрович", 16, new int[0], new String[0]),
    };

    public Student[] getAllStudents() {
        return students;
    }

}
