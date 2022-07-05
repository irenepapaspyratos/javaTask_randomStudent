import java.util.Arrays;
import model.Student;

public class StudentDB {

  private Student[] allStudents;

  public StudentDB(Student[] allStudents) {
    this.allStudents = allStudents;
  }

  public Student[] getAllStudents() {
    return allStudents;
  }

  public Student randomStudent() {
    int upperBound = allStudents.length;
    int random = (int) (Math.random() * upperBound);
    return allStudents[random];
  }

  public Student[] deleteStudent(String studentIdToDelete) {
    allStudents =
      Arrays
        .stream(this.getAllStudents())
        .filter(student -> student.getId() != studentIdToDelete)
        .toArray(curry -> new Student[curry]);
    return (allStudents);
  }

  public Student[] addStudent(Student student) {
    Student[] newArray = new Student[allStudents.length + 1];
    int counter = 0;
    for (Student abc : allStudents) {
      newArray[counter] = abc;
      counter++;
    }
    newArray[counter] = student;
    allStudents = newArray;
    return (allStudents);
  }

  @Override
  public String toString() {
    return Arrays.toString(allStudents);
  }
}
