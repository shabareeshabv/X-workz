class CricketLauncher {
    public static void main(String[] args) {
        Cricket schedule = new Cricket();
        System.out.println("\n");
        System.out.println("Invoking main in CricketLauncher");
        System.out.println("Team: " + schedule.team);
        System.out.println("Captain: " + schedule.captain);
        System.out.println("Total Players: " + schedule.totalPlayers);

        System.out.println("\n");

        Cricket schedule1 = new Cricket("India", "Virat Kohli", 11);
        System.out.println("Team: " + schedule1.team);
        System.out.println("Captain: " + schedule1.captain);
        System.out.println("Total Players: " + schedule1.totalPlayers);
    }
}