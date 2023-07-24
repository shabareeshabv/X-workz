class GodrejMain {
    static String brandName;
    String productType;
    float price;
    static String originCountry;

    GodrejMain(String productType, float price) {
        this.productType = productType;
        this.price = price;
    }

    static void staticData() {
        System.out.println("Static value of brandName: " + brandName);
        System.out.println("Static value of originCountry: " + originCountry);
    }

    void instanceData() {
        System.out.println("Instance value of productType: " + productType);
        System.out.println("Instance value of price: " + price);
    }

    static {
        brandName = "Godrej";
        originCountry = "India";
    }

    public static void main(String[] args) {
        staticData();

        GodrejMain product1 = new GodrejMain("Refrigerator", 20000.0f);
        GodrejMain product2 = new GodrejMain("Washing Machine", 15000.0f);

        System.out.println("\nInstance data for product1:");
        product1.instanceData();

        System.out.println("\nInstance data for product2:");
        product2.instanceData();
    }
}
