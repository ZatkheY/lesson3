package StudentsJournal;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        System.out.println("\"Добро пожаловать в Журнал\"");
        System.out.println("Введите команду!!!\nprint = распечатать журнал!\nadd = Добавить студента!\nmark = поставить оценку!\nremove = Удалить студента!\ncontains = найти студента!\nclear = удалить всех студентов!\nsort = отсортировать студентов!\nexit = выйти из журнала!");
        students.add(new Student("Tramp", new int[32]));
        students.add(new Student("Bush", new int[32]));
        students.add(new Student("Clinton", new int[32]));
        students.add(new Student("Arnold", new int[32]));
        students.add(new Student("Donald", new int[32]));
        students.add(new Student("Jobs", new int[32]));
        Reader.reader(students, student.marks);
    }
}
