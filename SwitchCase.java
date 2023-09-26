import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a category (mobile, speaker, streetlight, signal, sticker):");
        String category = scanner.nextLine();

        switch (category) {
            case "mobile":
                MobileProperties();
                break;
            case "speaker":
                printSpeakerProperties();
                break;
            case "streetlight":
                printStreetLightProperties();
                break;
            case "signal":
                printSignalProperties();
                break;
            case "sticker":
                printStickerProperties();
                break;
            default:
                System.out.println("Invalid category.");
                break;
        }

        scanner.close();
    }

    public static void MobileProperties() {
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

    public static void printSpeakerProperties() {
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
        System.out.println("Color: " + color);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Frequency Range: " + frequencyRangeLow + "Hz - " + frequencyRangeHigh + "Hz");
        System.out.println("Voice Assistant Integration: " + hasVoiceAssistantIntegration);
        System.out.println("Multiroom Capability: " + hasMultiroomCapability);
        System.out.println("Stereo Pairing: " + hasStereoPairing);
        System.out.println("Built-in Microphone: " + hasBuiltInMicrophone);
        System.out.println("Max Bluetooth Range: " + maxBluetoothRange + " meters");
        System.out.println("Special Features: " + specialFeatures);
    }

    public static void printStreetLightProperties() {
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

    public static void printSignalProperties() {
         String signalType = "Traffic Light";
        String location = "Intersection";
        boolean isRedOn = true;
        boolean isYellowOn = false;
        boolean isGreenOn = false;
        boolean isFlashing = false;
        boolean isPedestrianSignal = true;
        boolean isBicycleSignal = false;
        boolean isCountdownTimer = true;
        boolean isAudioEnabled = false;
        int countdownTimeInSeconds = 30;
        boolean isSolarPowered = false;
        String controllerType = "Digital";
        int heightInFeet = 15;
        boolean isWeatherproof = true;
        boolean hasEmergencyOverride = true;
        boolean hasIndicatorArrows = false;
        String displayTechnology = "LED";
        boolean isFaulty = false;
        String manufacturer = "Siemens";
        int warrantyPeriodInYears = 5;

        System.out.println("\nSignal Properties:");
        System.out.println("Signal Type: " + signalType);
        System.out.println("Location: " + location);
        System.out.println("Red Light: " + isRedOn);
        System.out.println("Yellow Light: " + isYellowOn);
        System.out.println("Green Light: " + isGreenOn);
        System.out.println("Flashing: " + isFlashing);
        System.out.println("Pedestrian Signal: " + isPedestrianSignal);
        System.out.println("Bicycle Signal: " + isBicycleSignal);
        System.out.println("Countdown Timer: " + isCountdownTimer);
        System.out.println("Audio Enabled: " + isAudioEnabled);
        System.out.println("Countdown Time: " + countdownTimeInSeconds + " seconds");
        System.out.println("Solar Powered: " + isSolarPowered);
        System.out.println("Controller Type: " + controllerType);
        System.out.println("Height: " + heightInFeet + " feet");
        System.out.println("Weatherproof: " + isWeatherproof);
        System.out.println("Emergency Override: " + hasEmergencyOverride);
        System.out.println("Indicator Arrows: " + hasIndicatorArrows);
        System.out.println("Display Technology: " + displayTechnology);
        System.out.println("Faulty: " + isFaulty);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty Period: " + warrantyPeriodInYears + " years");
    }

    public static void printStickerProperties() {
        String designName = "Floral Pattern";
        String material = "Vinyl";
        String shape = "Round";
        double diameterInInches = 3.5;
        String color = "Multicolor";
        boolean isWaterproof = true;
        boolean isRemovable = true;
        boolean isGlossy = false;
        boolean isDieCut = true;
        boolean hasUVResistance = true;
        boolean isReusable = false;
        boolean isTransparent = false;
        String adhesiveType = "Permanent";
        int packSize = 10;
        int durabilityInYears = 3;
        boolean isWritable = false;
        boolean isCustomizable = true;
        boolean isEcoFriendly = true;
        boolean hasLamination = false;
        boolean isScratchResistant = true;
        boolean isFadeResistant = true;

        System.out.println("\nSticker Properties:");
        System.out.println("Design Name: " + designName);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Diameter: " + diameterInInches + " inches");
        System.out.println("Color: " + color);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Removable: " + isRemovable);
        System.out.println("Glossy: " + isGlossy);
        System.out.println("Die-cut: " + isDieCut);
        System.out.println("UV Resistance: " + hasUVResistance);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Transparent: " + isTransparent);
        System.out.println("Adhesive Type: " + adhesiveType);
        System.out.println("Pack Size: " + packSize);
        System.out.println("Durability: " + durabilityInYears + " years");
        System.out.println("Writable: " + isWritable);
        System.out.println("Customizable: " + isCustomizable);
        System.out.println("Eco-friendly: " + isEcoFriendly);
        System.out.println("Lamination: " + hasLamination);
        System.out.println("Scratch Resistant: " + isScratchResistant);
        System.out.println("Fade Resistant: " + isFadeResistant);
    }
}
