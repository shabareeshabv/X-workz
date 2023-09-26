class OilMain {
    public static void main(String[] args) {
        Oil oil1 = new Oil();
        System.out.println();

        Oil oil2 = new Oil("Motor Oil");
        System.out.println();

        Oil oil3 = new Oil("Engine Oil", 50.0);
        System.out.println();

        Oil oil4 = new Oil("Transmission Fluid", 25.0, 2.5);
        System.out.println();
    }
}