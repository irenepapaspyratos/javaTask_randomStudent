import model.ComputerScienceStudent;
import model.Student;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Student study1 = new Student("Helga", "f1");
        Student study2 = new Student("Hägar", "m1");
        Student study3 = new Student("Moritz", "m2");
        Student study4 = new Student("Mia", "u1");

        ComputerScienceStudent study5 = new ComputerScienceStudent("Wicky", "f2", "PHP");


        Student[] studentsArray = {study1, study2, study3, study4};
        StudentDB studentDb = new StudentDB (studentsArray);

        System.out.println(studentDb.randomStudent());
        System.out.println(studentDb);
        System.out.println(Arrays.toString(studentDb.deleteStudent("f1")));
        System.out.println(studentDb);
        System.out.println(Arrays.toString(studentDb.addStudent(new Student("Felix", "m3"))));
        System.out.println(studentDb);
        System.out.println(study5);

    }

}
