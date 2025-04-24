package org.example;

import org.example.models.Hamburger;
import org.example.models.HealthyBurger;
import org.example.models.DeluxeBurger;

public class Main {
    public static void main(String[] args) {
        // --- Basic Hamburger ---
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.itemizeHamburger();
        System.out.println();

        // --- Healthy Burger ---
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        healthyBurger.itemizeHamburger();
        System.out.println();

        // --- Deluxe Burger ---
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();
    }
}
