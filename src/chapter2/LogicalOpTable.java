package chapter2;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p;
        boolean q;

        System.out.println("P    \tQ    \tAND    \tOR    \tXOR    \tNOT");

        p = true;
        q = true;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s", p, q, (p&q), (p|q), (p^q), (!p));
        System.out.println();

        p = true;
        q = false;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s", p, q, (p&q), (p|q), (p^q), (!p));
        System.out.println();

        p = false;
        q = true;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s", p, q, (p&q), (p|q), (p^q), (!p));
        System.out.println();

        p = false;
        q = false;
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s", p, q, (p&q), (p|q), (p^q), (!p));
    }
}
