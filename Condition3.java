class Condition3 {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (number > 100) {
            System.out.println("The number is greater than 100.");
        } else if (number > 50) {
            System.out.println("The number is greater than 50 but not greater than 100.");
        } else {
            System.out.println("The number is less than 50");
        }
    }
}
