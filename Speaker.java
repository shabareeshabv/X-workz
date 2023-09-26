class Speaker {
    public static void main(String[] args) {
        String brandName = "Bose";
        String modelName = "SoundLink Revolve+";
        boolean isPortable = true;
        boolean hasBluetooth = true;
        boolean hasWiFi = false;
        boolean isWaterResistant = true;
        boolean hasAuxInput = true;
        boolean hasSDCardSlot = false;
        int powerOutput = 30; // in watts
        double weightInKg = 0.9;
        String color = "Triple Black";
        int batteryCapacity = 3600; // in mAh
        int frequencyRangeLow = 40; // in Hz
        int frequencyRangeHigh = 20000; // in Hz
        boolean hasVoiceAssistantIntegration = true;
        boolean hasMultiroomCapability = false;
        boolean hasStereoPairing = true;
        boolean hasBuiltInMicrophone = true;
        int maxBluetoothRange = 30; // in meters
        String specialFeatures = "360-degree sound";

        System.out.println("\nSpeaker Properties:");
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("Portable: " + isPortable);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("WiFi: " + hasWiFi);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Aux Input: " + hasAuxInput);
        System.out.println("SD Card Slot: " + hasSDCardSlot);
        System.out.println("Power Output: " + powerOutput + " watts");
        System.out.println("Weight: " + weightInKg + " kg");
        System.out.printl	n("Color: " + color);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Frequency Range: " + frequencyRangeLow + "Hz - " + frequencyRangeHigh + "Hz");
        System.out.println("Voice Assistant Integration: " + hasVoiceAssistantIntegration);
        System.out.println("Multiroom Capability: " + hasMultiroomCapability);
        System.out.println("Stereo Pairing: " + hasStereoPairing);
        System.out.println("Built-in Microphone: " + hasBuiltInMicrophone);
        System.out.println("Max Bluetooth Range: " + maxBluetoothRange + " meters");
        System.out.println("Special Features: " + specialFeatures);
    }
}
