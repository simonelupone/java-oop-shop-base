package org.lessons.java.shop;

public class Prodotto {
    int code;
    String name;
    String description;
    float price;
    float vat;

    public Prodotto(int code, String name, float price) {
        this.code = code;
        this.name = name;
        this.price = price;

        this.description = "This is a description";
        this.vat = 0.22f;
    }

    public void basePrice() {
        System.out.printf("The base price is: %.2f %n", price);
    }

    public void finalPrice() {
        float finalPrice = price * (1 + vat);
        System.out.printf("The final price is: %.2f %n", finalPrice);
    }

    public void extendedName() {
        String dashedName = this.name.replaceAll("\\s", "-");
        System.out.println(code + "-" + dashedName);
    }
}
