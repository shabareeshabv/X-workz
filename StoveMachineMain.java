public class  StoveMachineMain {
    public static void main(String[] args) {
        StoveMachine.measureWeight(0.5, "kg", "Flour");
        StoveMachine.calculatePrice("Salt", 0.2, 2.5);
        StoveMachine.displayWeight("Sugar", 0.3, "lb");
        StoveMachine.turnOff();
    }
}
