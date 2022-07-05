import model.ComputerScienceStudent;
import model.Student;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student study1 = new ComputerScienceStudent("Helga", "f1");
        Student study2 = new ComputerScienceStudent("Hägar", "m1");
        Student study3 = new ComputerScienceStudent("Moritz", "m2");
        Student study4 = new ComputerScienceStudent("Mia", "u1", "Französisch");

        ComputerScienceStudent study5 = new ComputerScienceStudent("Wicky", "f2", "PHP");


        Student[] studentsArray = {study1, study2, study3, study4};
        StudentDB studentDb = new StudentDB (studentsArray);

        System.out.println(studentDb.randomStudent());
        System.out.println(studentDb);
        System.out.println(Arrays.toString(studentDb.deleteStudent("f1")));
        System.out.println(studentDb);
        System.out.println(Arrays.toString(studentDb.addStudent(new ComputerScienceStudent("Felix", "m3"))));
        System.out.println(studentDb);

    }

}
