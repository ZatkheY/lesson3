package HomeWork19;


 class Student  {
    private String surname;
    private int age;
    private String sex;

     Student(String surname, int age, String sex) {
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

     String getSurname() {
        return surname;
    }

     void setSurname(String surname) {
        this.surname = surname;
    }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }

     String isSex() {
        return sex;
    }

     void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
