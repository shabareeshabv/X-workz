class DoorbellMain {
    public static void main(String[] args) {
        Doorbell doorbell1 = new Doorbell();
        System.out.println("Example 1 - Default Doorbell");

        System.out.println();

        Doorbell doorbell2 = new Doorbell("Ding Dong");
        System.out.println("Example 2 - Doorbell sound: " + doorbell2.sound);

        System.out.println();

        Doorbell doorbell3 = new Doorbell("Chime", 75);
        System.out.println("Example 3 - Doorbell sound: " + doorbell3.sound );
		
        System.out.println(" volume: " + doorbell3.volume);

        System.out.println();

        Doorbell doorbell4 = new Doorbell("Ring", 80, true);
        System.out.println("Example 4 - Doorbell sound: " + doorbell4.sound );
		
        System.out.println("volume: " + doorbell4.volume );
	    System.out.println("isWireless: " + doorbell4.isWireless);

        System.out.println();

        Doorbell doorbell5 = new Doorbell("Buzz", 70, true, "Silver");
        System.out.println("Example 5 - Doorbell sound: " + doorbell5.sound );
		
        System.out.println(   "volume: " + doorbell5.volume );
		System.out.println( 	" isWireless: " + doorbell5.isWireless );
        System.out.println(    " color: " + doorbell5.color);

        System.out.println();

        Doorbell doorbell6 = new Doorbell("Jingle", 85, true, "Gold", true);
        System.out.println("Example 6 - Doorbell sound: " + doorbell6.sound );
        System.out.println(" volume: " + doorbell6.volume );
	    System.out.println(" isWireless: " + doorbell6.isWireless );
		System.out.println(" color: " + doorbell6.color );
	    System.out.println(" hasCamera: " + doorbell6.hasCamera);

        System.out.println();

        Doorbell doorbell7 = new Doorbell("Buzzer", 90, false, "Black", false, 2, true);
                 System.out.println("Example 7 - Doorbell sound: " + doorbell7.sound );
                 System.out.println(", volume: " + doorbell7.volume );
				 System.out.println(", isWireless: " + doorbell7.isWireless); 
                 System.out.println( ", color: " + doorbell7.color);
				 System.out.println(", hasCamera: " + doorbell7.hasCamera); 
                 System.out.println(", numberOfBatteries: " +doorbell7.numberOfBatteries );
				 System.out.println("isLit: " + doorbell7.isLit);
    }
}
