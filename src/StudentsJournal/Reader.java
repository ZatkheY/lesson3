package StudentsJournal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reader {

    public static void reader(ArrayList<Student> students, int[] marks) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isTrue = true;
        while (isTrue) {
            String read = reader.readLine();
            switch (read) {
                case "print":
                    Action.print(students);
                    break;
                case "add":
                    Action.addStudents(students, reader);
                    break;
                case "mark":
                    Action.mark(students, marks, reader);
                    break;
                case "remove":
                    Action.removeStudents(students, reader);
                    break;
                case "contains":
                    Action.containsStudent(students, reader);
                    break;
                case "clear":
                    Action.clearAllStudents(students, reader);
                    break;
                case "sort":
                    Action.sortStudentsSurnames(students);
                    break;
                case "exit":
                    System.out.println("Buy - Buy");
                    isTrue = false;
                    break;
            }
        }
    }
}



