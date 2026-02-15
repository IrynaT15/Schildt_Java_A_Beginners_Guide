package chapter1;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons;
        double liters;
        int counter = 0;

        for (gallons = 1; gallons <= 100; gallons ++) {
            liters = gallons * 3.7854;
            System.out.printf("%s gallons is %s liters", gallons, liters);
            System.out.println();
            counter ++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
