package HomeWork19;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


class ReaderAndWriter {
    private final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private List<Object> list = new ArrayList<>();

    void addStudents() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please indicate how many students you want to add: ");
            int quantity = Integer.parseInt(reader.readLine());
            double start = System.currentTimeMillis();
            for (int i = 0; i < quantity; i++) {
                list.add(new Student("Ivanov", 18 + (int) (Math.random() * 22), "man"));
            }
            writeStudents(list);
            System.out.println("student successfully added");
            double end = System.currentTimeMillis();
            System.out.println("Time = " + ((end - start) / 1000) + " second");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeStudents(List student) {
        try {
            OutputStream outputStream = new FileOutputStream(new File("jsonFormat.json"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            String json = GSON.toJson(student);
            objectOutputStream.writeObject(json);
            outputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void printStudents() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("jsonFormat.json"));
            Object jsonFormat = objectInputStream.readObject();
            System.out.println(jsonFormat);
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
