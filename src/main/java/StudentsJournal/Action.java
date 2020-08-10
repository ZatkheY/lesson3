package StudentsJournal;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

 class Action {

    public static void print(ArrayList<Student> students) {
        int id = 1;
        for (Student student : students) {
            student.point = 0;
            for (int j = 0; j < 32; j++) {
                student.point += student.marks[j];
            }
        }
        System.out.println("ID\tName\tMarks");
        for (Student student : students) {
            System.out.println(id++ + "\t" + student.surname + "\t" + student.point + "\t\t\t" + Arrays.toString(student.marks));
        }
    }

     static void mark(ArrayList<Student> students, int[] marks, BufferedReader reader) throws IOException {
        System.out.println("Введите фамилию:");
        boolean check = true;
        String studentSurname = reader.readLine();
        for (Student student : students) {
            if (student.surname.contains(studentSurname)) {
                System.out.println("Выберите номер урока за котрый хотите выставить оценку: ");
                int numberLesson = Integer.parseInt(reader.readLine()) - 1;
                System.out.println("Введите оценку:");
                student.marks[numberLesson] = Integer.parseInt(reader.readLine());
                System.out.println("Оценка выставлена");
                System.out.println("Введите новую команду:");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Такого студента нет в списке!");
        }
    }

     static void removeStudents(ArrayList<Student> students, BufferedReader reader) throws IOException {
        System.out.println("Введите фамилию студента которого хотите удалить :");
        boolean check = true;
        String studentSurname = reader.readLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).surname.contains(studentSurname)) {
                students.remove(i);
                System.out.println("Студент удален из журнала!");
                System.out.println("Введите новую команду:");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Студент не найден!");
            System.out.println("Введите новую команду:");
        }

    }

     static void containsStudent(ArrayList<Student> students, BufferedReader reader) throws IOException {
        System.out.println("Введите фамилию студента:");
        boolean check = true;
        String studentSurname = reader.readLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).surname.contains(studentSurname)) {
                i++;
                System.out.println("Студент есть в списке под номером = " + i);
                System.out.println("Введите новую команду:");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Такого студента нет в списке!");
            System.out.println("Введите новую команду:");
        }
    }

     static void addStudents(ArrayList<Student> students, BufferedReader reader) throws IOException {
        System.out.println("Введите фамилию:");
        students.add(new Student(reader.readLine(), new int[32]));
        System.out.println("Студент добавлен!");
        System.out.println("Введите новую команду:");
    }

     static void clearAllStudents(ArrayList<Student> students, BufferedReader reader) throws IOException {
        System.out.println("Вы уверены ?\nyes = Удалить весь список!!!\nno = отменить удаление!!!");
        String choose = reader.readLine();
        if (choose.contains("yes")) {
            students.clear();
            System.out.println("Все студенты удалены!");
            System.out.println("Введите новую команду:");
        } else if (choose.contains("no")) {
            System.out.println("Удаление отменено!");
            System.out.println("Введите новую команду:");
        }

    }

     static void sortStudentsSurnames(ArrayList<Student> students) {
        students.sort(new SortStudents());
        System.out.println("Список отсортирован по алфавиту!");
        System.out.println("Введите новую команду:");

    }

     static class SortStudents implements Comparator<Student> {
        @Override
        public int compare(Student a, Student b) {
            return a.surname.compareTo(b.surname);
        }
    }
}
