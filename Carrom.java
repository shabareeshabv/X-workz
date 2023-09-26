class Carrom {
    int boardSize;
    int playerTurn;
    int strikerPositionX;
    int strikerPositionY;
    boolean isGameFinished;

    Carrom() {
    
        System.out.println("Board size is " + this.boardSize);
        System.out.println("Player turn is " + this.playerTurn);
        System.out.println("Striker position X is " + this.strikerPositionX);
        System.out.println("Striker position Y is " + this.strikerPositionY);
        System.out.println("Is the game finished? " + this.isGameFinished);
    }

    Carrom(int boardSize) {
		System.out.println("value of the boardSize");
        this.boardSize = boardSize;
      
    }

    Carrom(int playerTurn, int boardSize) {
		System.out.println("value of the playerTurn,boardSize is");
        this.playerTurn = playerTurn;
        this.boardSize = boardSize;
       
    }

    Carrom(int playerTurn, int boardSize, int strikerPositionX) {
		System.out.println("value of the playerTurn,boardSize,strikerPositionX  is");
        this.playerTurn = playerTurn;
        this.boardSize = boardSize;
        this.strikerPositionX = strikerPositionX;
       
    }

    Carrom(int playerTurn, int boardSize, int strikerPositionX, int strikerPositionY) {
		System.out.println("value of the playerTurn,boardSize,strikerPositionX , strikerPositionY is");
        this.playerTurn = playerTurn;
        this.boardSize = boardSize;
        this.strikerPositionX = strikerPositionX;
        this.strikerPositionY = strikerPositionY;
	}

    Carrom(int playerTurn, int boardSize, int strikerPositionX, int strikerPositionY, boolean isGameFinished) {
       
		System.out.println("value of the playerTurn,boardSize,strikerPositionX , strikerPositionY ,isGameFinished is");	 
		this.playerTurn = playerTurn;
        this.boardSize = boardSize;
        this.strikerPositionX = strikerPositionX;
        this.strikerPositionY = strikerPositionY;
        this.isGameFinished = isGameFinished;
       
    }
}
