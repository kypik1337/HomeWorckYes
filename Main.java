

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import Model.Student;
import Model.StudentGroup;
import Model.Teacher;
import Model.TeacherComparator;
import Model.TeacherGroup;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of(new Student(3, "String firstName",
                        "String secondName",
                        "String patronymic", LocalDate.now()), new Student(2, "String firstName2",
                        "String secondName",
                        "String patronymic", LocalDate.now()),
                new Student(1, "a",
                        "a",
                        "a", LocalDate.now())));
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println("////////////////////////////////////");
        List<Student> list = students.getStudents().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(list.toString());

        System.out.println("////////////////////////////////////");

        ///////////////////////////////////  HomeWork
        Teacher sensei = new Teacher("Van li", "Gu", "Sai", LocalDate.of(1969, 6, 16));
        Teacher master = new Teacher("Batman", "Brus", "Wain", LocalDate.of(1980, 5, 10));
        Teacher sup = new Teacher("Superman", "Klark", "Kent", LocalDate.of(1988, 1, 1));

        TeacherGroup teachers = new TeacherGroup(Arrays.asList(sensei, master, sup));

        for (Teacher t : teachers) {
            System.out.println(t);
        }

        System.out.println(teachers.getTeacherList().stream().sorted().collect(Collectors.toList()));

        System.out.println("////////////////////////////////////");

        System.out.println(teachers.getTeacherList().stream().sorted(new TeacherComparator()).collect(Collectors.toList()));

    }
}