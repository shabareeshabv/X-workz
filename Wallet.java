class Wallet {
    String ownerName;
    String currency;
    double balance;

    Wallet() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.ownerName);
        System.out.println("Inside constructor: " + this.currency);
        System.out.println("Inside constructor: " + this.balance);
    }

    Wallet(String ownerName, String currency, double balance) {
        System.out.println("Invoking constructor by passing parameters");
        this.ownerName = ownerName;
        this.currency = currency;
        this.balance = balance;
    }
}