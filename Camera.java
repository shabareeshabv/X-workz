class Camera{ 

   static void click(String name ,String location, String date, int numberOfPeople, 
   String resolution, String cameraMan) 
   {
        System.out.println("Camera: " + name);
		if (name=="Canon EOS 5D Mark IV") {
            System.out.println("Camera name is correct");
        } else {
            System.out.println("Camera name is wrong");
            // return;
        }
        System.out.println("Location: " + location);
		if (name=="mountain") {
            System.out.println("location is correct");
        } else {
            System.out.println("location name is wrong");
            // return;
        }
        System.out.println("Date: " + date);
		if (name=="2023-07-07") {
            System.out.println("date is correct");
        } else {
            System.out.println("date is wrong");
            // return;
        }
        System.out.println("Number of People: " + numberOfPeople);
		if (numberOfPeople>5) {
            System.out.println("too much people is there");
        } else {
            System.out.println("some people is there");
            // return;
        }
        System.out.println("Resolution: " + resolution);
		if (resolution=="1920x1080") {
            System.out.println("clarity is better ");
        } else {
            System.out.println("clarity is  not better");
            // return;
        }
        System.out.println("Camera Man: " + cameraMan);
		
		if (cameraMan==" John Smith") {
            System.out.println(" cameraMan is John Smith ");
        } else {
            System.out.println("cameraMan is dontn know ");
            // return;
        }
        System.out.println("Taking a photo...");
    }
}
