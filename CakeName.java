nclass CakeName {
    static void tasty(String name, String type, String bakeryName, double price, int noOfPieces, String occasion) {
        System.out.println("Name of the bakery: " + bakeryName);

        if (name=="chocolate") {
            System.out.println("Cake name is correct");
        } else 
		{
            System.out.println("Cake name is wrong");
            // return;
        }

        System.out.println("Type of the cake: " + type);

        if (type=="Sponge") {
            System.out.println("Cake type is sponge");
        } else {
            System.out.println("Cake type is not sponge");
            // return;
        }

        System.out.println("Name of the cake: " + name);

        if (bakeryName=="wariyar") {
            System.out.println("Bakery name is wariyar");
        } else {
            System.out.println("Bakery name is not wariyar");
            // return;
        }

        System.out.println("Price of the cake: " + price);

        if (price > 200) {
            System.out.println("Cake is too costly");
        } else {
            System.out.println("Cake is not costly");
            // return;
        }

        System.out.println("Number of pieces: " + noOfPieces);

        if (noOfPieces == 3) {
            System.out.println("You get one gift card");
        } else {
            System.out.println("Please get 3 cakes");
            // return;
        }

        System.out.println("Occasion: " + occasion);

        if (occasion.equals("birthday")) {
            System.out.println("Happy birthday");
        } else {
            System.out.println("Hello");
            // return;
        }
    }
}
