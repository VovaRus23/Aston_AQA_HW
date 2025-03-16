import java.util.Arrays;

public class Student {

    private String name;
    private String group;
    private int course;
    private double[] grades;

    public Student(String name, String group, int course, double... grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double[] getGrades() {
        return grades;
    }

    public double calcAverageGrade() {
        if (grades.length == 0) {
            return 0;
        } else {
            return Arrays.stream(grades).sum() / grades.length;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + " " +
                "Группа: " + group + " " +
                "Курс: " + course + " " +
                "Средний балл: " + calcAverageGrade();
    }
}