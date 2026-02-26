package chapter3;

public class Guess {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        char answer = 'G';

        System.out.println("A letter between A and Z has been chosen.");
        System.out.print("Try to guess the letter: ");

        ch = (char) System.in.read();

        if (ch == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, that's not it.");
        }
    }
}
