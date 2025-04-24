package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

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
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger() - super.itemizeHamburger() + 0;
        // biz kendi yazacağız; üsttekini direkt çağırmak
        // ekranı iki kere basacağından onun yerine alttaki logiği kullanalım:
        totalPrice = getBasePrice();

        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());
        if (hasAddition1()) {
            totalPrice += getAddition1Price();
            System.out.println("Addition1: " + getAddition1Name());
        }
        if (hasAddition2()) {
            totalPrice += getAddition2Price();
            System.out.println("Addition2: " + getAddition2Name());
        }
        // base class addition3,4 de istenirse burada benzer kontrol eklenebilir

        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("HealthyAddition1: " + healthyExtra1Name);
        }
        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("HealthyAddition2: " + healthyExtra2Name);
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }

    // (Aşağıdaki getter’lar private field’ları alabilmek için eklendi)
    private String getAddition1Name() { return super.addition1Name; }
    private double getAddition1Price() { return super.addition1Price; }
    private boolean hasAddition1() { return super.addition1Name != null; }
    private String getAddition2Name() { return super.addition2Name; }
    private double getAddition2Price() { return super.addition2Price; }
    private boolean hasAddition2() { return super.addition2Name != null; }

    // Ana sınıftaki private field’lara erişmek için yardımcı method’lar
    private String getName()          { return super.name; }
    private String getMeat()          { return super.meat; }
    private String getBreadRollType() { return super.breadRollType; }
    private double getBasePrice()     { return super.price; }
}
