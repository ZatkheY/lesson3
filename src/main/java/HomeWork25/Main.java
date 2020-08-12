package HomeWork25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(
                new Student("Доминика = 4 гл. буквы ", "Иванова".toUpperCase()),
                new Student("Анастасия = 5 гл. букв", "Антипина".toUpperCase()),
                new Student("Ян = 1 гл.буквы", "Варвачук".toUpperCase()),
                new Student("Доналд = 2 гл.буквы", "Трамп".toUpperCase()),
                new Student("Алексей 3 гл.буквы", "Брин".toUpperCase()));

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase("1")) {
            stream.sorted().forEach(student ->
                    System.out.println(student.getLastName() + " " + student.getName()));
            System.out.println("Сортировка Фамилий по алфавиту ");

        } else if (str.equalsIgnoreCase("2")) {
            stream.sorted(new Student.StudentsNameComparator()).forEach(student ->
                    System.out.println(student.getLastName() + " " + student.getName()));
            System.out.println("Сортировка по длине имени");

        } else if (str.equalsIgnoreCase("3")) {
            List<Character> list = Arrays.asList('а', 'о', 'и', 'е', 'ю', 'я', 'у');
            Function<Student, Integer> wordCount = student -> {
                int count = 0;
                for (int i = 0; i < student.getName().length(); i++) {
                    if (list.contains(student.getName().charAt(i))) {
                        count++;
                    }
                }
                return count;
            };
            Comparator<Student> comparator = Comparator.comparingInt(wordCount::apply);
            stream.sorted(comparator).forEach(student
                    -> System.out.println(student.getLastName() + " " + student.getName()));
            System.out.println("Сортировка по количеству гласных букв в имени");
        }
    }
}
