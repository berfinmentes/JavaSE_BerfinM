package week05.lessonexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int sum = 0;
        Random random = new Random();
        List<Student> studentList = new ArrayList<>();


        ;
        for (int i = 0; i < number; i++) {
            Student student = new Student("Name", "surname", random.nextInt(100));
            studentList.add(student);
        }
        for (Student s : studentList) {
            System.out.println(s.getName() + " " + s.getSurname() + " " + s.getGrade());
            sum += s.getGrade();
        }

        int finalSum = sum;
        Stream.of(studentList).map(s -> finalSum / studentList.size()).forEach(System.out::println);
        System.out.println("FİLTERED LİST");
        for (int i = 0; i < number - 1; i++) {
            List<Integer> filteredList = Stream.of(studentList.get(i).getGrade()).filter(a -> a < 50).collect(Collectors.toList());

                System.out.println(filteredList);
            }
        }
    }



