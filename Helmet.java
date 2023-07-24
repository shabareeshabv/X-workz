class Helmet {
    static String brand;
    static String country;
    String color;
    float price;

    Helmet(String color, float price) {
        this.color = color;
        this.price = price;
    }

    public static void staticData() {
        System.out.println("Static value of brand: " + brand);
        System.out.println("Static value of country: " + country);
    }

    public void instanceData() {
        System.out.println("Instance value of price: " + price);
        System.out.println("Instance value of color: " + color);
    }

    static {
        brand = "vega";
        country = "india";
    }

    public static void main(String[] args) {
        staticData(); // Call staticData() only once
        Helmet helmet1 = new Helmet("red", 20.0f);
        Helmet helmet2 = new Helmet("blue", 24.6f);
        helmet1.instanceData();
        helmet2.instanceData();
    }
}
