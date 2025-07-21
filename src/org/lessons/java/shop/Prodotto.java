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

    public Prodotto(String name, String brand, BigDecimal price, String description, BigDecimal vat) {

        this.code = randomNumber(9999);
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;

        this.vat = vat;
    }

    public Prodotto() {
        this("Nome prodotto", "Nome brand", new BigDecimal("1.00"), "Descrizione generica", new BigDecimal("0.22"));
    }

    // method to set a random code
    protected static int randomNumber(int bound) {
        Random rn = new Random();
        return rn.nextInt(bound);
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

    // setters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) > 0) {
            this.price = price;
        }
    }

    public void getVat(BigDecimal vat) {
        if (vat.compareTo(BigDecimal.ZERO) > 0) {
            this.vat = vat;
        }
    }

    // utility methods
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
