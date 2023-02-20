package HomeTask8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    public String name;
    public int course;
    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }
    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vitalii", 1));
        students.add(new Student("Maksim", 1));
        students.add(new Student("Vladyslav", 1));
        students.add(new Student("Vika", 4));

        removeStudent(students, "Maksim");

        printStudents(students, 1);
    }
    public static void addStudent(List<Student> students, String name, int course) {
        students.add(new Student(name, course));
    }

    public static void removeStudent(List<Student> students, String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
