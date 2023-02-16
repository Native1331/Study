package Lesson45;

import java.io.Serializable;

public class PersonAll implements Serializable {
    private int id;
    private String name;

    public PersonAll(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString() {
        return id + ":"+ name;
    }
}
