package week05.stream;

import java.util.Random;

public class Student {

   static Random random = new Random();
    private String name;
    private String surname;
    private Integer grade;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grade = random.nextInt(0,101);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
