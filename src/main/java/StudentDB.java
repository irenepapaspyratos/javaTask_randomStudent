import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] allStudents;

    public StudentDB (Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public Student[] getAllStudents() {
        return this.allStudents;
    }

    public Student randomStudent() {
        int lowerBound = 0;
        int upperBound = this.allStudents.length;
        int random = (int)(Math.random() * upperBound - lowerBound) + lowerBound;
        return this.allStudents[random];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.allStudents);
    }
}
