package oop.Encapsulation;

public class Student {
    private String name;

    public String getName(){ // access private attribute
        return name;
    }

    public void setName(String name) { //modify private attribute
        this.name = name;
    }
}
