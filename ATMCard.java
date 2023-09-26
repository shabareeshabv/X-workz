class ATMCard {
    String bankName;
    String cardNumber;
    int pin;

    ATMCard() {
        System.out.println("Invoking no-args constructor");
        System.out.println("Inside constructor: " + this.bankName);
        System.out.println("Inside constructor: " + this.cardNumber);
        System.out.println("Inside constructor: " + this.pin);
    }

    ATMCard(String bankName, String cardNumber, int pin) {
        System.out.println("Invoking constructor by passing parameters");
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }
}