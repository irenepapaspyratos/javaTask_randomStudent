import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.BiologyStudent;
import model.ComputerScienceStudent;
import model.Student;

public class Main {

    public static void main(String[] args) {
        Student study1 = new ComputerScienceStudent("Helga", "f1");
        Student study2 = new BiologyStudent("Hägar", "m1");
        Student study3 = new BiologyStudent("Moritz", "m2");
        Student study4 = new ComputerScienceStudent("Mia", "u1", "Französisch");

        ComputerScienceStudent study5 = new ComputerScienceStudent("Wicky", "f2", "PHP");

        List<Student> studentsList = new ArrayList<>(List.of(study1, study2, study3, study4));
        Map<String, Student> studentsMap;
        studentsMap = studentsList.stream().collect(Collectors.toMap(Student::getId, student -> student));
        StudentDB studentDb = new StudentDB(studentsMap);

        System.out.println(studentDb.randomStudent());
        System.out.println(studentDb);
        System.out.println(studentDb.deleteStudent("f1"));
        System.out.println(studentDb);
        System.out.println(studentDb.addStudent(new ComputerScienceStudent("Felix", "m3")));
        System.out.println(studentDb);

        System.out.println(study2);
        study2.setAddress("Buxtehuder Deich");
        System.out.println("Adresse: " + study2.getAddress());

        System.out.println(study5);
        study5.setIdNumber(80677084);
        System.out.println("IdentityCardNumber: " + study5.getIdentityCardNumber());
    }
}
