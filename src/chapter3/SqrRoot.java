package chapter3;

public class SqrRoot {
    public static void main(String[] args) {
        double sqrRoot;
        double roundingError;

        for (double i = 1.0; i < 100.0; i++) {
            sqrRoot = Math.sqrt(i);
            System.out.println("Square root of " + i + " is " + sqrRoot);

            roundingError = i - (sqrRoot * sqrRoot);
            System.out.println("Rounding error: " + roundingError);

            System.out.println();
        }
    }
}
