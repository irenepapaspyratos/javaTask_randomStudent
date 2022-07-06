package model;

import static org.junit.jupiter.api.Assertions.*;

import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBTest {

    Student[] studentDb = {
            new ComputerScienceStudent("Karl", "123"),
            new ComputerScienceStudent("Tina", "345"),
            new BiologyStudent("Bob", "789"),
            new BiologyStudent("Betty", "167"),
    };

    @Test
    void getAllStudents() {
    }

    @Test
    void randomStudent() {
    }

    @Test
    void testToString() {
    }
}
