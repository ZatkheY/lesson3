package HomeWork8;

 class Student {
    private String surname;

     Student(String surname) {
        this.surname = surname;
    }

     String getSurname() {
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
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Student)){
            return false;
        }
        Student student = (Student)o;
        return getSurname().equals(student.getSurname());
    }
}
