import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] allStudents;

    public StudentDB(Student[] allStudents) {
        this.allStudents = allStudents;
    }

    public Student[] getAllStudents() {
        return this.allStudents;
    }

    public Student randomStudent() {
        int upperBound = this.allStudents.length;
        int random = (int) (Math.random() * upperBound);
        return this.allStudents[random];
    }

    public Student[] deleteStudent(String studentIdToDelete) {
        this.allStudents = Arrays.stream(this.getAllStudents()).filter(student ->
                student.getId() != studentIdToDelete).toArray(curry -> new Student[curry]);
        return (this.allStudents);
    }

    public Student[] addStudent(Student student) {
        Student[] newArray = new Student[this.allStudents.length +1];
        int counter = 0;
        for( Student abc : this.allStudents) {
            newArray[counter] = abc;
            counter++;
        }
        newArray[counter] = student;
        this.allStudents = newArray;
        return (this.allStudents);
    }

    @Override
    public String toString() {
        return Arrays.toString(this.allStudents);
    }
}
