package chapter1;

public class GalToLit {
    public static void main(String[] args) {
        // 1 gallon = 3,7854 liters
        double gallons = 7.98;
        double liters = gallons * 3.7854;

        System.out.printf("%s gallons  correspond to %s liters", gallons, liters);
    }
}
