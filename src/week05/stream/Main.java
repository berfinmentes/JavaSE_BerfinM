package week05.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

   /* public static void main(String[] args) {

        List<Student> studentList = Student.generateStudents(30);
        Double averageGrade = Student.calculateAverageGrade(studentList);
        List<Student> studentsBellowBound = studentList.stream()
                .filter(x-> x.getGrade()<50).collect(Collectors.toList());
        System.out.println(averageGrade);
        studentsBellowBound.forEach(System.out::println);
        studentList.forEach(x-> System.out.println(x.getName()+ " "+x.getGrade()));


        Map<String, Integer> studentsAndGrades = new HashMap<>();
        studentsAndGrades = studentList.stream().collect.(Collectors.toMap(k-> k.getName(),Student::getGrade));

        studentsAndGrades.entrySet()
                .forEach( entry -> System.out.println(
                        "Ogrenci Adı : "+ entry.getKey
                ));



    }*/
}
