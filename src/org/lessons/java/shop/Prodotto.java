package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    int code;
    String name;
    String description;
    BigDecimal price;
    BigDecimal vat;

    public Prodotto(String name, BigDecimal price, String description, BigDecimal vat) {
        Random rn = new Random();

        this.code = rn.nextInt(9999);
        this.name = name;
        this.price = price;

        this.description = description;
        this.vat = new BigDecimal("0.22");
    }

    public BigDecimal basePrice() {
        return this.price;
    }

    public BigDecimal finalPrice() {
        if (price != null && vat != null) {
            return price.add(price.multiply(vat).setScale(2, RoundingMode.DOWN));
        }
        return null;
    }

    public String extendedName() {
        if (name != null) {
            return code + " - " + name;
        }
        return null;
    }
}
