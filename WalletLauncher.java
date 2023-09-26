class WalletLauncher {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        System.out.println("\n");
        System.out.println("Invoking main in WalletLauncher");
        System.out.println("Owner Name: " + wallet1.ownerName);
        System.out.println("Currency: " + wallet1.currency);
        System.out.println("Balance: " + wallet1.balance);

        System.out.println("\n");

        Wallet wallet2 = new Wallet("John Doe", "USD", 500.0);
        System.out.println("Owner Name: " + wallet2.ownerName);
        System.out.println("Currency: " + wallet2.currency);
        System.out.println("Balance: " + wallet2.balance);
    }
}