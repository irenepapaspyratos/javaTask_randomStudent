package model;

import static org.junit.jupiter.api.Assertions.*;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBTest {

  Student[] studentDb = {
    new Student("Karl", "123"),
    new Student("Tina", "345"),
    new Student("Bob", "789"),
    new Student("Betty", "167"),
  };

  @Test
  void getAllStudents() {}

  @Test
  void randomStudent() {}

  @Test
  void testToString() {}
}
