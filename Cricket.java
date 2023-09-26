class Cricket {
    String team;
    String captain;
    int totalPlayers;

    Cricket() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.team);
        System.out.println("Inside constructor: " + this.captain);
        System.out.println("Inside constructor: " + this.totalPlayers);
    }

    Cricket(String team, String captain, int totalPlayers) {
        System.out.println("Invoking constructor by passing parameters");
        this.team = team;
        this.captain = captain;
        this.totalPlayers = totalPlayers;
    }
}