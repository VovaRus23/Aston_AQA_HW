import java.util.Set;
import java.util.HashSet;

public class MainClass1 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Михаил", "А", 1, 4.3, 3.1, 2.8, 3.4));
        students.add(new Student("Наталья", "Б", 2, 3.2, 2.8, 2.5, 2.4));
        students.add(new Student("Олег", "В", 3, 3.9, 3.6, 4.8, 4.4));
        students.add(new Student("Елена", "Г", 4, 3.3, 3.9, 2.1, 3.7));
        students.add(new Student("Антон", "Д", 2, 1.3, 2.1, 1.8, 2.9));
        students.add(new Student("Марина", "А", 1, 1.8, 1.5, 2.9, 2.7));

        printStudents(students);
        System.out.println("--------------------------------------------");
        deleteStudents(students);
        moveStudents(students);
        printStudents(students);

    }

    public static void deleteStudents(Set<Student> students) {
        students.removeIf(student -> student.calcAverageGrade() < 3);
    }

    public static void moveStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.calcAverageGrade() >= 3 && student.getCourse() < 6) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
