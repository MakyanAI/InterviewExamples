package streamTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Anton", "M", 21, 3);
        Student st2 = new Student("Ivan", "M", 22, 4);
        Student st3 = new Student("Elena", "F", 23, 4);
        Student st4 = new Student("Maria", "F", 20, 3);
        Student st5 = new Student("Misha", "M", 18, 1);
        Student st6 = new Student("Masha", "F", 19, 2);

        Faculty f1 = new Faculty("Informatics");
        Faculty f2 = new Faculty("Economics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st5);
        f1.addStudentToFaculty(st6);

        f2.addStudentToFaculty(st2);
        f2.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);

        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);


        facultyList.stream()
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(e -> System.out.println(e.getName()));

    }
}
