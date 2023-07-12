package org.fasttrackit.homework10.Exercises2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Buquet {

    private Set<String> buquet;


    public Buquet() {
        this.buquet = new HashSet<>();
    }

    public Collection<String> getAll() {
        return this.buquet;
    }

    public void add(String newFlower){
        this.buquet.add(newFlower);
    }

    public void remove(String removeFlower){
        this.buquet.remove(removeFlower);
    }
}
