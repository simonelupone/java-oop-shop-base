package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    public Prodotto(String name, BigDecimal price, String description, BigDecimal vat) {
        Random rn = new Random();

        this.code = rn.nextInt(9999);
        this.name = name;
        this.price = price;

        this.description = description;
        this.vat = vat;
    }

    // getters
    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public BigDecimal getVat() {
        return this.vat;
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
