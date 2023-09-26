class Doorbell {
    String sound;
    int volume;
    boolean isWireless;
    String color;
    boolean hasCamera;
    int numberOfBatteries;
    boolean isLit;

    Doorbell() {
        System.out.println("Default Doorbell");
    }

    Doorbell(String sound) {
        this.sound = sound;
        System.out.println("Doorbell sound is " + this.sound);
    }

    Doorbell(String sound, int volume) {
        this.sound = sound;
        this.volume = volume;
        System.out.println("Doorbell sound is " + this.sound + ", volume is " + this.volume);
    }

    Doorbell(String sound, int volume, boolean isWireless) {
        this.sound = sound;
        this.volume = volume;
        this.isWireless = isWireless;
        
    }

    Doorbell(String sound, int volume, boolean isWireless, String color) {
        this.sound = sound;
        this.volume = volume;
        this.isWireless = isWireless;
        this.color = color;
       

    Doorbell(String sound, int volume, boolean isWireless, String color, boolean hasCamera) {
        this.sound = sound;
        this.volume = volume;
        this.isWireless = isWireless;
        this.color = color;
        this.hasCamera = hasCamera;
       
    }

    Doorbell(String sound, int volume, boolean isWireless, String color, boolean hasCamera,
            int numberOfBatteries) {
        this.sound = sound;
        this.volume = volume;
        this.isWireless = isWireless;
        this.color = color;
        this.hasCamera = hasCamera;
        this.numberOfBatteries = numberOfBatteries;
       
    }

    Doorbell(String sound, int volume, boolean isWireless, String color, boolean hasCamera,
            int numberOfBatteries, boolean isLit) {
        this.sound = sound;
        this.volume = volume;
        this.isWireless = isWireless;
        this.color = color;
        this.hasCamera = hasCamera;
        this.numberOfBatteries = numberOfBatteries;
        this.isLit = isLit;
        
    }
}
