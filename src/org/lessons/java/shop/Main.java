package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rn = new Random();

        int generatedCode = rn.nextInt(9999) + 1;

        Prodotto smartphone = new Prodotto(generatedCode, "iPhone 17 pro", 1129.99f);

        smartphone.extendedName();
        smartphone.basePrice();
        smartphone.finalPrice();
    }
}
