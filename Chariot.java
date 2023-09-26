class Chariot {
    String image;
    int width;
    int height;
    String color;
    boolean isResizable;
    boolean isAnimated;
    String format;
    boolean isTransparent;
    int numberOfLayers;
    boolean hasWheels;
    String material;

    Chariot() {
        System.out.println("Default Chariot");
    }

    Chariot(String image) {
        this.image = image;
    }

    Chariot(String image, int width) {
        this.image = image;
        this.width = width;
    }

    Chariot(String image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    Chariot(String image, int width, int height, String color) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated, String format) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
            String format, boolean isTransparent) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
        this.isTransparent = isTransparent;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
            String format, boolean isTransparent, int numberOfLayers) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
        this.isTransparent = isTransparent;
        this.numberOfLayers = numberOfLayers;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
            String format, boolean isTransparent, int numberOfLayers, boolean hasWheels) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
        this.isTransparent = isTransparent;
        this.numberOfLayers = numberOfLayers;
        this.hasWheels = hasWheels;
    }

    Chariot(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
            String format, boolean isTransparent, int numberOfLayers, boolean hasWheels, String material) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
        this.isTransparent = isTransparent;
        this.numberOfLayers = numberOfLayers;
        this.hasWheels = hasWheels;
        this.material = material;
    }
}