package Chapter4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg =21;

        // Calculation of travel range with a full track of fuel
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("The minivan can carry " + minivan.passengers +
                " passengers over a distance of " + range + " miles.");
    }
}
