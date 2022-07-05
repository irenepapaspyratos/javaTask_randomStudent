package model;

import java.util.Objects;

public abstract class Student {
    protected String name;
    protected String id;

    public abstract String getSubject();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Student() {

    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
