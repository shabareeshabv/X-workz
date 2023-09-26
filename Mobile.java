class Mobile {
    public static void main(String[] args) {
        String brandName = "Redmi";
        String modelName = "9 Pro Max";
        double screenSize = 6.5;
        int batteryCapacity = 5000;
        String operatingSystem = "Android";
        int ramCapacity = 6;
        int storageCapacity = 64;
        int rearCameraResolution = 13;
        int frontCameraResolution = 64;
        boolean isDualSim = true;
        boolean hasFingerprintSensor = true;
        boolean hasFaceUnlock = true;
        boolean hasNFC = false;
        boolean hasWirelessCharging = false;
        boolean isWaterResistant = false;
        boolean hasExpandableStorage = false;
        boolean has35mmHeadphoneJack = true; // Modified variable name
        boolean supports5G = false;
        String color = "Aurora Blue";
        int weightInGrams = 196;
        String processor = "Qualcomm Snapdragon 720G";

        System.out.println("\nMobile Properties:");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("RAM Capacity: " + ramCapacity + " GB");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
        System.out.println("Rear Camera Resolution: " + rearCameraResolution + " megapixels");
        System.out.println("Front Camera Resolution: " + frontCameraResolution + " megapixels");
        System.out.println("Dual SIM: " + isDualSim);
        System.out.println("Fingerprint Sensor: " + hasFingerprintSensor);
        System.out.println("Face Unlock: " + hasFaceUnlock);
        System.out.println("NFC: " + hasNFC);
        System.out.println("Wireless Charging: " + hasWirelessCharging);
        System.out.println("Water Resistance: " + isWaterResistant);
        System.out.println("Expandable Storage: " + hasExpandableStorage);
        System.out.println("3.5mm Headphone Jack: " + has35mmHeadphoneJack); // Updated variable name
        System.out.println("5G Support: " + supports5G);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weightInGrams + " grams");
        System.out.println("Processor: " + processor);
    }
}
