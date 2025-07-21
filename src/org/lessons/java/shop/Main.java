package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Prodotto smartphone = new Prodotto("iPhone 17 pro", new BigDecimal("1129.99"), "L'iPhone migliore di sempre",
                new BigDecimal("0.22"));

        System.out.println(smartphone.extendedName());
        System.out.println(smartphone.getPrice());
        System.out.println(smartphone.finalPrice());

        Prodotto sample = new Prodotto();
        System.out.println(sample.getName());
        System.out.println(sample.getCode());

    }
}
