class ATMCardLauncher {
    public static void main(String[] args) {
        ATMCard card1 = new ATMCard();
        System.out.println("\n");
        System.out.println("Invoking main in ATMCardLauncher");
        System.out.println("Bank Name: " + card1.bankName);
        System.out.println("Card Number: " + card1.cardNumber);
        System.out.println("PIN: " + card1.pin);

        System.out.println("\n");

        ATMCard card2 = new ATMCard("XYZ Bank", "1234 5678 9012 3456", 1234);
        System.out.println("Bank Name: " + card2.bankName);
        System.out.println("Card Number: " + card2.cardNumber);
        System.out.println("PIN: " + card2.pin);
    }
}