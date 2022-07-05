package model;

public class BiologyStudent extends Student{


    private String favoriteAnimal;

    public BiologyStudent(String name, String id, String favoriteAnimal) {
        super(name, id);
        this.favoriteAnimal = favoriteAnimal;
    }
    public BiologyStudent(String name, String id) {
        super(name, id);
        this.favoriteAnimal = "None";
    }



    @Override
    public String getSubject() {
        return "Biology";
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "favoriteAnimal='" + favoriteAnimal + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
