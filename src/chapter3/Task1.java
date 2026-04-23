package chapter3;

public class Task1 {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        int space = 0;
        System.out.print("Enter your text: ");

        do {
            ch = (char) System.in.read();
            System.out.print(ch);
            if (ch == ' ') {
                space ++;
            }
        } while (ch != '.');

        System.out.print("\nNumber of spaces: " + space);
    }
}
