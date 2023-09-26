class CarromMain {
    public static void main(String[] args) {
        Carrom carrom1 = new Carrom();
        System.out.println("Start from here");
      
System.out.println("\n");
        Carrom carrom2 = new Carrom(2);
        System.out.println("Board size is " + carrom2.boardSize);
System.out.println("\n");
        Carrom carrom3 = new Carrom(2, 10);
        System.out.println("Board size is " + carrom3.boardSize);
        System.out.println("Player turn is " + carrom3.playerTurn);
System.out.println("\n");
        Carrom carrom4 = new Carrom(2, 10, 15);
        System.out.println("Board size is " + carrom4.boardSize);
        System.out.println("Player turn is " + carrom4.playerTurn);
        System.out.println("Striker position X is " + carrom4.strikerPositionX);
System.out.println("\n");
        Carrom carrom5 = new Carrom(2, 10, 15, 20);
        System.out.println("Board size is " + carrom5.boardSize);
        System.out.println("Player turn is " + carrom5.playerTurn);
        System.out.println("Striker position X is " + carrom5.strikerPositionX);
        System.out.println("Striker position Y is " + carrom5.strikerPositionY);
System.out.println("\n");
        Carrom carrom6 = new Carrom(2, 10, 15, 20, true);
        System.out.println("Board size is " + carrom6.boardSize);
        System.out.println("Player turn is " + carrom6.playerTurn);
        System.out.println("Striker position X is " + carrom6.strikerPositionX);
        System.out.println("Striker position Y is " + carrom6.strikerPositionY);
        System.out.println("Is the game finished? " + carrom6.isGameFinished);
    }
}
