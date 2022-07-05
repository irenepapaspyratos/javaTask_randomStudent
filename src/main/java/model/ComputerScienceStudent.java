package model;

public class ComputerScienceStudent extends Student{

    private String favoriteProgrammingLanguage;

    public ComputerScienceStudent(String name, String id, String favoriteProgrammingLanguage) {
        super(name, id);
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "favoriteProgrammingLanguage='" + favoriteProgrammingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
