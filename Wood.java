class Wood {
    String price;
    String color;
    float weight;
    String quality;
    int length;

    Wood(String price) {
        this.price = price;
		System.out.println("statement 1");
		
        System.out.println("Value of price: " + price);
    }

    Wood(String price, String color) {
        this(price);
        this.color = color;
		System.out.println("statement 2");
		
        System.out.println("Value of price and color: " + price + ", " + color);
    }

    Wood(String price, String color, float weight) {
        this(price, color);
        this.weight = weight;
		System.out.println("statement 3");
		
        System.out.println("Value of price, color, and weight: " + price + ", " + color + ", " + weight);
    }

    Wood(String price, String color, float weight, String quality) {
        this(price, color, weight);
        this.quality = quality;
		System.out.println("statement 4");
        System.out.println("Value of price, color, weight, and quality: " + price + ", " + color + ", " + weight + ", " + quality);
    }

    Wood(String price, String color, float weight, String quality, int length) {
        this(price, color, weight, quality);
        this.length = length;
		System.out.println("statement 5");
        System.out.println("Value of price, color, weight, quality, and length: " + price + ", " + color + ", " + weight + ", " + quality + ", " + length);
    }
}
