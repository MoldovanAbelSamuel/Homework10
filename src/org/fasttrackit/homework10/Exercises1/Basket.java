package org.fasttrackit.homework10.Exercises1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Basket {

    private List<String> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public boolean find (String fruit){
        return this.basket.contains((String) fruit);
    }

    public boolean remove (String fruit){
        boolean found = false;
        while (this.find(fruit)){
            this.basket.remove((String) fruit);
            found = true;
        }
        return found;
    }

    public int position (String fruit){
        return this.basket.indexOf((String) fruit);
    }

    public Collection<String> distinct (){
        return new HashSet<>(this.basket);
    }


    public void add (String fruit){
        this.basket.add(fruit);
    }

    public int count (){
        return this.basket.size();
    }

    public int uniqueFruitsCount () {
        int contor = 0;
        Collection<String> unique = this.distinct();
        for (String fruitContor : unique){
            contor++;
        }
        return contor;
    }

    public List<String> getBasket() {
        return basket;
    }

}
