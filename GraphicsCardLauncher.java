class GraphicsCardLauncher {
    public static void main(String[] args) {
        GraphicsCard card1 = new GraphicsCard();
        System.out.println("\n");
        System.out.println("Invoking main in GraphicsCardLauncher");
        System.out.println("Brand: " + card1.brand);
        System.out.println("Model: " + card1.model);
        System.out.println("Memory: " + card1.memory);

        System.out.println("\n");

        GraphicsCard card2 = new GraphicsCard("Nvidia", "GTX 1080", 8);
        System.out.println("Brand: " + card2.brand);
        System.out.println("Model: " + card2.model);
        System.out.println("Memory: " + card2.memory);
    }
}