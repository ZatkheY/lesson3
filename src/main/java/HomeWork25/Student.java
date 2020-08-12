package HomeWork25;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Student other) {
        return lastName.toUpperCase().compareTo(other.lastName.toUpperCase());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';  
    }

    public static class StudentsNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        }
    }
}
