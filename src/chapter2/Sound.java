package chapter2;

public class Sound {
    public static void main(String[] args) {
        double distance;  //Distance to the sound source.
        double speedFtInSec = 1100; //The speed of sound in air
        double intervalSec = 7.2;  //The time interval between the moment the flash is seen and the sound is heard.

        distance = intervalSec * speedFtInSec;

        System.out.println("Distance to the sound source: " + distance);
    }
}
