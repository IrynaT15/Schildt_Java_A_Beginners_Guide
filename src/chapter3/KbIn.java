package chapter3;

public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        System.out.print("Press any key in the keyboard and then press Enter: ");
        ch = (char) System.in.read();
        System.out.println("You pressed " + ch);
    }
}