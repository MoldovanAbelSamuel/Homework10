package org.fasttrackit.homework10.Exercises3;

public class Main {

    public static void main(String[] args) {
        Person e1 = new Person("Ion", 49, "manager");
        Person e2 = new Person("George", 25, "welders");
        Person e3 = new Person("Mihai", 36, "carpenters");
        Person e4 = new Person("Dan", 22, "plumbers");
        Person e5 = new Person("Denis", 29, "welders");
        Person e6 = new Person("Alin", 59, "welders");
        Person e7 = new Person("Claudiu", 43, "plumbers");

        Company company = new Company();
        company.employ(e1);
        company.employ(e2);
        company.employ(e3);
        company.employ(e4);
        company.employ(e5);
        company.employ(e6);
        company.employ(e7);

        System.out.println("The manager of this company is: " + company.getManager());

        System.out.println("\nIn this company the plumbers are: " + company.getPersons("plumbers"));

        System.out.println("\nIn this company the employees older than 30 are: " + company.getPersonsOlder(30));

        System.out.println("\nIn this company the employees that their name contains 'a' are: " + company.getPerson("a"));

    }

}
