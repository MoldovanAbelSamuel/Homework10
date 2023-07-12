package org.fasttrackit.homework10.Exercises1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Mere");
        basket.add("Pere");
        basket.add("Capsuni");
        basket.add("Mere");
        basket.add("Cirese");
        basket.add("Caise");
        basket.add("Capsuni");
        basket.add("Pepene");
        basket.add("Struguri");
        basket.add("Struguri");

        System.out.println("All fruits in our basket: ");
        allFruits(basket);

        System.out.println("\nFind if mere it's in our basket.");
        System.out.println(basket.find("Mere"));
        System.out.println("Find if prune it's in our basket.");
        System.out.println(basket.find("Prune"));

        System.out.println("\nRemove pepene from basket.");
        System.out.println(basket.remove("Mere"));
        System.out.println("Remove prune from basket");
        System.out.println(basket.remove("Prune"));


        System.out.println("\nPosition of caise in our basket is:");
        System.out.println(basket.position("Caise") + 1);

        System.out.println("\nOur distinct list of basket is:");
        System.out.println(basket.distinct());

        System.out.println("\nIn our basket we have " + basket.count() + " fruits.");

        System.out.println("\nIn our basket we have " + basket.uniqueFruitsCount() + " types of fruits.");

    }

    public static void  allFruits (Basket basket){
        List<String> fruits = basket.getBasket();
        for (int i = 0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }
    }
}
