package HomeWork19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Console {
    void consoleCommand() {
        boolean isTrue = true;
        ReaderAndWriter readerAndWriter = new ReaderAndWriter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please print the command : \"create\" , \"print\" , \"stop\" ");
        while (isTrue) {
            try {
                String input = reader.readLine();
                if (input.equalsIgnoreCase("create")) {
                    readerAndWriter.addStudents();
                } else if (input.equalsIgnoreCase("print")) {
                    readerAndWriter.printStudents();
                } else if (input.equalsIgnoreCase("stop")) {
                    isTrue = false;
                } else {
                    System.err.println("WRONG ENTER");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
