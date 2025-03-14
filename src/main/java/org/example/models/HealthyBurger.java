package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String name, double price) {

        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {double totalPrice = getPrice();

        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());

        if (getAddition1Name() != null) {
            totalPrice += getAddition1Price();
            System.out.println("Addition1: " + getAddition1Name());
        }
        if (getAddition2Name() != null) {
            totalPrice += getAddition2Price();
            System.out.println("Addition2: " + getAddition2Name());
        }
        if (getAddition3Name() != null) {
            totalPrice += getAddition3Price();
            System.out.println("Addition3: " + getAddition3Name());
        }

        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("HealthyAddition1: " + healthyExtra1Name);
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("HealthyAddition2: " + healthyExtra2Name);
        }

        System.out.println("Price: " + totalPrice);

        setPrice(totalPrice);

        return totalPrice;
    }
}
