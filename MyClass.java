public class MyClass {
    public static void main(String[] args) {
        // Calling a function with no arguments
        sayHello();

        // Calling a function with arguments
        int sum = addNumbers(5, 3);
        System.out.println("Sum: " + sum);
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static int  addNumbers(int a, int b) {
        //System.out.println( a + b);
		return  a+b;
    }
}