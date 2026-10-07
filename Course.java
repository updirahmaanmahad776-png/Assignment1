import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[2];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {

        if (numberOfStudents == students.length) {
            String[] larger = new String[students.length * 2];
            System.arraycopy(students, 0, larger, 0, numberOfStudents);
            students = larger;
        }
        students[numberOfStudents++] = student;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Shift the remaining students one position to the left
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }


    public String[] getStudents() {
        return Arrays.copyOf(students, numberOfStudents);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }


    public static void main(String[] args) {
        Course course = new Course("Data Structures");
        course.addStudent("Ali");
        course.addStudent("Hodan");
        course.addStudent("Mohamed");
        course.addStudent("Fadumo");
        course.addStudent("Abdi");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Students: " + course.getNumberOfStudents());

        course.dropStudent("Hodan");
        System.out.println("After dropping Hodan: " + course.getNumberOfStudents());
        for (String s : course.getStudents()) {
            System.out.println(" - " + s);
        }
    }
}