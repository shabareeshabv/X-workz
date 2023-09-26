 class Metro {
    int capacity;
    String line;
    String stations;
    String seatingArrangement;
    String architecturalStyle;

  public static void main(String args[]) {
        Metro redLine = new Metro();
        Metro blueLine = new Metro();
        
        System.out.println("redLine default capacity: " + redLine.capacity);
        System.out.println("redLine default line: " + redLine.line);
        System.out.println("redLine default stations: " + redLine.stations);
        System.out.println("redLine default seating arrangement: " + redLine.seatingArrangement);
        System.out.println("redLine default architectural style: " + redLine.architecturalStyle);
        System.out.println("\n");

        System.out.println("blueLine default capacity: " + blueLine.capacity);
        System.out.println("blueLine default line: " + blueLine.line);
        System.out.println("blueLine default stations: " + blueLine.stations);
        System.out.println("blueLine default seating arrangement: " + blueLine.seatingArrangement);
        System.out.println("blueLine default architectural style: " + blueLine.architecturalStyle);
        System.out.println("\n");

        redLine.capacity = 500;
        redLine.line = "Red Line";
        redLine.stations = "10";
        redLine.seatingArrangement = "Open seating";
        redLine.architecturalStyle = "Modern";

        blueLine.capacity = 350;
        blueLine.line = "Blue Line";
        blueLine.stations = "8";
        blueLine.seatingArrangement = "Reserved seating";
        blueLine.architecturalStyle = "Contemporary";

        System.out.println("redLine updated capacity: " + redLine.capacity);
        System.out.println("redLine updated line: " + redLine.line);
        System.out.println("redLine updated stations: " + redLine.stations);
        System.out.println("redLine updated seating arrangement: " + redLine.seatingArrangement);
        System.out.println("redLine updated architectural style: " + redLine.architecturalStyle);
        System.out.println();

        System.out.println("blueLine updated capacity: " + blueLine.capacity);
        System.out.println("blueLine updated line: " + blueLine.line);
        System.out.println("blueLine updated stations: " + blueLine.stations);
        System.out.println("blueLine updated seating arrangement: " + blueLine.seatingArrangement);
        System.out.println("blueLine updated architectural style: " + blueLine.architecturalStyle);
    }
}
