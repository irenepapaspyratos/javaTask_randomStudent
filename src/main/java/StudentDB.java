import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] allStudents;

    public StudentDB (Student[] studentArray) {
        this.allStudents = studentArray;
    }

    public Student[] getAllStudents() {
        return this.allStudents;
    }

    @Override
    public String toString() {
        // macht automatisch eckige Klammern
        return Arrays.toString(allStudents);
    }
}
