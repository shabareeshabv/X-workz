class Oil {
    String name;
    double viscosity;
    double quantity;

    Oil() {
        System.out.println("Default Oil");
        System.out.println("Name: " + this.name);
        System.out.println("Viscosity: " + this.viscosity);
        System.out.println("Quantity: " + this.quantity);
    }

    Oil(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);
        System.out.println("Viscosity: " + this.viscosity);
        System.out.println("Quantity: " + this.quantity);
    }

    Oil(String name, double viscosity) {
        this.name = name;
        this.viscosity = viscosity;
        System.out.println("Name: " + this.name);
        System.out.println("Viscosity: " + this.viscosity);
        System.out.println("Quantity: " + this.quantity);
    }

    Oil(String name, double viscosity, double quantity) {
        this.name = name;
        this.viscosity = viscosity;
        this.quantity = quantity;
        System.out.println("Name: " + this.name);
        System.out.println("Viscosity: " + this.viscosity);
        System.out.println("Quantity: " + this.quantity);
    }
}