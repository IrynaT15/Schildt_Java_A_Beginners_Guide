package chapter2;

public class Echo {
    public static void main(String[] args) {
        double distance;  //Distance to a huge object.
        double time = 10;  //The time it takes to the sound to reach the object and come back.
        double timeToObject = time / 2;
        double speedFtInSec = 1100; //The speed of sound in air

        distance = speedFtInSec * timeToObject;

        System.out.println("Distance to the object: " + distance);
    }
}
