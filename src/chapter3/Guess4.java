package chapter3;

public class Guess4 {
    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        char answer = 'K';
        char ignore;

        do {
            System.out.println("A letter between A and Z has been chosen.");
            System.out.print("Try to guess the letter: ");

            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Correct!");
            } else {
                System.out.print("Sorry, that's not it. The letter is placed ");
                if (ch < answer) {
                    System.out.println("closer to the end of the ABC");
                } else {
                    System.out.println("closer to the beginning of the ABC");
                }
            }
        } while (answer != ch) ;
    }
}
