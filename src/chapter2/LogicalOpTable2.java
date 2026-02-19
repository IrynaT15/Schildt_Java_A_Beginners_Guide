package chapter2;

public class LogicalOpTable2 {
    public static void main(String[] args) {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        boolean[][] combinations = {
                {true, true},
                {true,false},
                {false, true},
                {false,false}
        };

        for (boolean[] pair : combinations) {
            boolean p = pair[0];
            boolean q = pair[1];

            boolean[] table = {p, q, (p&q), (p|q), (p^q), (!p)};

            for (boolean val : table) {
                int tableVal = boolToInt(val);
                System.out.print(tableVal + "\t");
            }
            System.out.println();
        }
    }

    static int boolToInt(boolean val) {
        return val ? 1 : 0;
    }
}
