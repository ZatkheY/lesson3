package HomeWork9;

class Student {
    private String surname;

    public Student(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student surname: " + getSurname();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Student)) {
            return false;
        }
        Student student = (Student) object;
        return getSurname().equals(student.getSurname());
    }
}