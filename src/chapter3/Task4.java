package chapter3;

public class Task4 {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("To stop the program enter \'.\'");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.print(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.print(ch);
            }
        } while (ch != '.');
        System.out.println("Number of changes: " + changes);
    }
}
