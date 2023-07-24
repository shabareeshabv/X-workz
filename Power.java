class Power {
    static int colorPower;
    int scentPower;
    int heightPower;
    static int materialPower;

    Power(int scentPower, int heightPower) {
        this.scentPower = scentPower;
        this.heightPower = heightPower;
    }

    static void staticData() {
        System.out.println("Static value of colorPower: " + colorPower);
        System.out.println("Static value of materialPower: " + materialPower);
    }

    void instanceData() {
        System.out.println("Instance value of scentPower: " + scentPower);
        System.out.println("Instance value of heightPower: " + heightPower);
    }

    static {
        colorPower = 2;
        materialPower = 4;
    }

    public static void main(String[] args) {
        staticData();

        Power Power1 = new Power(3, 4);  
        Power Power2 = new Power(1, 3); 
        System.out.println("\nInstance data for Power1:");
        Power1.instanceData();

        System.out.println("\nInstance data for Power2:");
        Power2.instanceData();
    }
}
