import model.Student;

import java.util.Map;

public class StudentDB {

    private Map<String, Student> allStudents;

    public StudentDB(Map<String, Student> allStudents) {
        this.allStudents = allStudents;
    }

    public Map<String, Student> getAllStudents() {
        return allStudents;
    }

    public Student randomStudent() {
        int upperBound = allStudents.size();
        int random = (int) (Math.random() * upperBound);
        int counter = 0;
        for (Student student : allStudents.values()) {
            if (counter == random) return student;
            counter++;
        }
        return null;
    }

    public Map<String, Student> deleteStudent(String studentIdToDelete) {
        Student deletedStudent = allStudents.remove(studentIdToDelete);
        System.out.println("Successfully deleted: " + deletedStudent);
        return (allStudents);
    }

    public Map<String, Student> addStudent(Student student) {
        allStudents.put(student.getId(), student);
        System.out.println("Successfully added: " + student);
        return (allStudents);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + allStudents +
                '}';
    }
}
