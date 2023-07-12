package org.fasttrackit.homework10.Exercises3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> company;

    public Company() {
        this.company = new ArrayList<>();
    }

    public void employ(Person newEmployee) {
        this.company.add(newEmployee);
    }

    public Person getManager() {
        for (int i = 0; i < this.company.size(); i++) {
            if (this.company.get(i).getPosition() == "manager") {
                return this.company.get(i);
            }
        }
        return null;
    }

    public List<Person> getPersons (String position){
        List<Person> auxiliarList = new ArrayList<>();
        for (int i=0; i<this.company.size(); i++){
            if (this.company.get(i).getPosition() == position)
                auxiliarList.add(this.company.get(i));
        }
        return auxiliarList;
    }

    public List<Person> getPersonsOlder (int age){
        List<Person> auxiliarList = new ArrayList<>();
        for (int i=0; i<this.company.size(); i++){
            if (this.company.get(i).getAge() > age)
                auxiliarList.add(this.company.get(i));
        }
        return auxiliarList;
    }

    public List<Person> getPerson (String filterName){
        List<Person> auxiliarList = new ArrayList<>();
        for (int i=0; i<this.company.size(); i++){
            if (this.company.get(i).getName().contains(filterName))
                auxiliarList.add(this.company.get(i));
        }
        return auxiliarList;
    }
}
