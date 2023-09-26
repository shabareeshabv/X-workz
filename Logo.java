class Logo {
    String image;
    int width;
    int height;
    String color;
    boolean isResizable;
    boolean isAnimated;
    String format;
    boolean isTransparent;
    int numberOfLayers;

    Logo() {
        System.out.println("Default Logo");
    }

    Logo(String image) {
        this.image = image;
        System.out.println("Logo image is " + this.image);
    }

    Logo(String image, int width) {
        this.image = image;
        this.width = width;
    }

    Logo(String image, int width, int height) {
        this.image = image;
        this.width = width;
        this.height = height;
    }

    Logo(String image, int width, int height, String color) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    Logo(String image, int width, int height, String color, boolean isResizable) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
    }

    Logo(String image, int width, int height, String color, boolean isResizable, boolean isAnimated) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
    }

    Logo(String image, int width, int height, String color, boolean isResizable, boolean isAnimated, String format) {
        this.image = image;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isResizable = isResizable;
        this.isAnimated = isAnimated;
        this.format = format;
    }

    Logo(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
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

    Logo(String image, int width, int height, String color, boolean isResizable, boolean isAnimated,
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
}
