class StreetLight {
    public static void main(String[] args) {
        String manufacturer = "Acme Lighting";
        String model = "LED StreetLight";
        boolean hasPhotocell = true;
        int wattage = 150;
        String color = "Neutral White";
        boolean isDuskToDawn = true;
        boolean hasMotionSensor = false;
        boolean isSolarPowered = false;
        int heightInFeet = 25;
        boolean isDimmable = true;
        boolean hasTimer = true;
        int lifespanInYears = 15;
        String material = "Aluminum";
        String powerSource = "Electricity";
        boolean isWeatherproof = true;
        boolean hasSmartControl = true;
        int brightnessInLumens = 15000;
        String mountingType = "Pole Mounted";
        boolean hasEmergencyBackup = false;
        boolean isEnergyEfficient = true;

        System.out.println("\nStreetLight Properties:");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Photocell: " + hasPhotocell);
        System.out.println("Wattage: " + wattage);
        System.out.println("Color: " + color);
        System.out.println("Dusk to Dawn: " + isDuskToDawn);
        System.out.println("Motion Sensor: " + hasMotionSensor);
        System.out.println("Solar Powered: " + isSolarPowered);
        System.out.println("Height: " + heightInFeet + " feet");
        System.out.println("Dimmable: " + isDimmable);
        System.out.println("Timer: " + hasTimer);
        System.out.println("Lifespan: " + lifespanInYears + " years");
        System.out.println("Material: " + material);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Weatherproof: " + isWeatherproof);
        System.out.println("Smart Control: " + hasSmartControl);
        System.out.println("Brightness: " + brightnessInLumens + " lumens");
        System.out.println("Mounting Type: " + mountingType);
        System.out.println("Emergency Backup: " + hasEmergencyBackup);
        System.out.println("Energy Efficient: " + isEnergyEfficient);
    }
}
