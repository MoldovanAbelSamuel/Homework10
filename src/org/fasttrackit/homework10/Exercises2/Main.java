package org.fasttrackit.homework10.Exercises2;

public class Main {

    public static void main(String[] args) {
        Buquet newBuquet = new Buquet();
        newBuquet.add("Crizanteme");
        newBuquet.add("Crizanteme");
        newBuquet.add("Trandafir");
        newBuquet.add("Lalele");
        newBuquet.add("Crin");

        System.out.println("In our buquet we have next types of flowers: " + newBuquet.getAll());

        newBuquet.add("Lavanda");
        newBuquet.add("Lavanda");
        System.out.println("\nWe add in our buquet lavanda, now our buquet contains: " + newBuquet.getAll());

        newBuquet.remove("Crins");
        newBuquet.remove("Crin");
        System.out.println("\nWe remove from our buquet crin, now our buquet contains: " + newBuquet.getAll());
    }
}
