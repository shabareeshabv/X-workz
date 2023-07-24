class Butterfly {
    static String color;
    String species;
    float wingspan;
    static String habitat;

    Butterfly(String species, float wingspan) {
        this.species = species;
        this.wingspan = wingspan;
    }

    static void staticData() {
        System.out.println("Static value of color: " + color);
        System.out.println("Static value of habitat: " + habitat);
    }

    void instanceData() {
        System.out.println("Instance value of species: " + species);
        System.out.println("Instance value of wingspan: " + wingspan + " inches");
    }

    static {
        color = "orange";
        habitat = "gardens";
    }

    public static void main(String[] args) {
        staticData();

        Butterfly butterfly1 = new Butterfly("Monarch", 4.5f);
        Butterfly butterfly2 = new Butterfly("Swallowtail", 5.2f);

        System.out.println("\nInstance data for butterfly1:");
        butterfly1.instanceData();

        System.out.println("\nInstance data for butterfly2:");
        butterfly2.instanceData();
    }
}
