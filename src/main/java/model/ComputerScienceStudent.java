package model;

public class ComputerScienceStudent extends Student {

    private String favoriteProgrammingLanguage;

    public ComputerScienceStudent(String name, String id, String favoriteProgrammingLanguage) {
        super(name, id);
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public ComputerScienceStudent(String name, String id) {
        super(name, id);
        this.favoriteProgrammingLanguage = "None";
    }

    @Override
    public String getSubject() {
        return "ComputerScience";
    }

    @Override
    public String toString() {
        return (
                "ComputerScienceStudent{" +
                        "favoriteProgrammingLanguage='" +
                        favoriteProgrammingLanguage +
                        '\'' +
                        ", name='" +
                        name +
                        '\'' +
                        ", id='" +
                        id +
                        '\'' +
                        '}'
        );
    }
}
