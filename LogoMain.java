class LogoMain {
    public static void main(String[] args) {
        Logo logo1 = new Logo();
        System.out.println("Default Logo");
        System.out.println();

        Logo logo2 = new Logo("logo.png");
        System.out.println("Logo image is " + logo2.image);
        System.out.println();

        Logo logo3 = new Logo("logo.png", 200);
        System.out.println("Logo image is " + logo3.image);
        System.out.println("Width is " + logo3.width);
        System.out.println();

        Logo logo4 = new Logo("logo.png", 200, 100);
        System.out.println("Logo image is " + logo4.image);
        System.out.println("Width is " + logo4.width);
        System.out.println("Height is " + logo4.height);
        System.out.println();

        Logo logo5 = new Logo("logo.png", 200, 100, "red");
        System.out.println("Logo image is " + logo5.image);
        System.out.println("Width is " + logo5.width);
        System.out.println("Height is " + logo5.height);
        System.out.println("Color is " + logo5.color);
        System.out.println();

        Logo logo6 = new Logo("logo.png", 200, 100, "red", true);
        System.out.println("Logo image is " + logo6.image);
        System.out.println("Width is " + logo6.width);
        System.out.println("Height is " + logo6.height);
        System.out.println("Color is " + logo6.color);
        System.out.println("Is resizable? " + logo6.isResizable);
        System.out.println();

        Logo logo7 = new Logo("logo.png", 200, 100, "red", true, true);
        System.out.println("Logo image is " + logo7.image);
        System.out.println("Width is " + logo7.width);
        System.out.println("Height is " + logo7.height);
        System.out.println("Color is " + logo7.color);
        System.out.println("Is resizable? " + logo7.isResizable);
        System.out.println("Is animated? " + logo7.isAnimated);
        System.out.println();

        Logo logo8 = new Logo("logo.png", 200, 100, "red", true, true, "PNG");
        System.out.println("Logo image is " + logo8.image);
        System.out.println("Width is " + logo8.width);
        System.out.println("Height is " + logo8.height);
        System.out.println("Color is " + logo8.color);
        System.out.println("Is resizable? " + logo8.isResizable);
        System.out.println("Is animated? " + logo8.isAnimated);
        System.out.println("Format is " + logo8.format);
        System.out.println();

        Logo logo9 = new Logo("logo.png", 200, 100, "red", true, true, "PNG", true);
        System.out.println("Logo image is " + logo9.image);
        System.out.println("Width is " + logo9.width);
        System.out.println("Height is " + logo9.height);
        System.out.println("Color is " + logo9.color);
        System.out.println("Is resizable? " + logo9.isResizable);
        System.out.println("Is animated? " + logo9.isAnimated);
        System.out.println("Format is " + logo9.format);
        System.out.println("Is transparent? " + logo9.isTransparent);
        System.out.println();

        Logo logo10 = new Logo("logo.png", 200, 100, "red", true, true, "PNG", true, 3);
        System.out.println("Logo image is " + logo10.image);
        System.out.println("Width is " + logo10.width);
        System.out.println("Height is " + logo10.height);
        System.out.println("Color is " + logo10.color);
        System.out.println("Is resizable? " + logo10.isResizable);
        System.out.println("Is animated? " + logo10.isAnimated);
        System.out.println("Format is " + logo10.format);
        System.out.println("Is transparent? " + logo10.isTransparent);
        System.out.println("Number of layers is " + logo10.numberOfLayers);
    }
}