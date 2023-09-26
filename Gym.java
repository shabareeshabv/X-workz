 class Gym {
    int capacity;
    String gymType;
    String facilities;
    String equipment;
    String architecturalStyle;

    public static void main(String args[]) {
        Gym goldsGym = new Gym();
        Gym planetFitness = new Gym();
        
        System.out.println("goldsGym default capacity: " + goldsGym.capacity);
        System.out.println("goldsGym default gym type: " + goldsGym.gymType);
        System.out.println("goldsGym default facilities: " + goldsGym.facilities);
        System.out.println("goldsGym default equipment: " + goldsGym.equipment);
        System.out.println("goldsGym default architectural style: " + goldsGym.architecturalStyle);
        System.out.println();

        System.out.println("planetFitness default capacity: " + planetFitness.capacity);
        System.out.println("planetFitness default gym type: " + planetFitness.gymType);
        System.out.println("planetFitness default facilities: " + planetFitness.facilities);
        System.out.println("planetFitness default equipment: " + planetFitness.equipment);
        System.out.println("planetFitness default architectural style: " + planetFitness.architecturalStyle);
         System.out.println("\n");

        goldsGym.capacity = 100;
        goldsGym.gymType = "Weightlifting";
        goldsGym.facilities = "Locker rooms, showers";
        goldsGym.equipment = "Free weights, machines";
        goldsGym.architecturalStyle = "Modern";

        planetFitness.capacity = 200;
        planetFitness.gymType = "General Fitness";
        planetFitness.facilities = "Cardio area, group exercise rooms";
        planetFitness.equipment = "Treadmills, ellipticals, weight machines";
        planetFitness.architecturalStyle = "Contemporary";

        System.out.println("goldsGym updated capacity: " + goldsGym.capacity);
        System.out.println("goldsGym updated gym type: " + goldsGym.gymType);
        System.out.println("goldsGym updated facilities: " + goldsGym.facilities);
        System.out.println("goldsGym updated equipment: " + goldsGym.equipment);
        System.out.println("goldsGym updated architectural style: " + goldsGym.architecturalStyle);
      System.out.println("\n");

        System.out.println("planetFitness updated capacity: " + planetFitness.capacity);
        System.out.println("planetFitness updated gym type: " + planetFitness.gymType);
        System.out.println("planetFitness updated facilities: " + planetFitness.facilities);
        System.out.println("planetFitness updated equipment: " + planetFitness.equipment);
        System.out.println("planetFitness updated architectural style: " + planetFitness.architecturalStyle);
    }
}
