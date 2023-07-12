package org.fasttrackit.homework10.Exercises3;

public class Person {

    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return  name + ", " +  age + " years, " + position + ".";
    }
}
