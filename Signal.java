class Signal {
    public static void main(String[] args) {
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
}
