package chapter3;

public class Help3 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        char ignore;

        for (;;) {
            do {
                System.out.println("Help:");
                System.out.println("  1. if");
                System.out.println("  2. switch");
                System.out.println("  3. for");
                System.out.println("  4. while");
                System.out.println("  5. do-while");
                System.out.println("  6. break");
                System.out.println("  7. continue");
                System.out.print("Select (q - exit): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;

            System.out.println();

            switch (choice) {
                case '1':
                    System.out.println("Instruction if:");
                    System.out.println("if (condition) instruction");
                    System.out.println("else instruction");
                    break;
                case '2':
                    System.out.println("Instruction switch:");
                    System.out.println("switch (expression) {");
                    System.out.println("case constant:");
                    System.out.println("sequence of expressions");
                    System.out.println("break;");
                    System.out.println("// ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Loop for:");
                    System.out.println("for (initialization; condition; iterator)");
                    System.out.println(" instruction");
                    break;
                case '4':
                    System.out.println("Loop while:");
                    System.out.println("while (condition) instruction");
                    break;
                case '5':
                    System.out.println("Loop do-while:");
                    System.out.println("do {");
                    System.out.println("instruction;");
                    System.out.println("} while (condition)");
                    break;
                case '6':
                    System.out.println("Instruction break:");
                    System.out.println("break; or break mark;");
                    break;
                case '7':
                    System.out.println("Instruction continue:");
                    System.out.println("continue; or continue mark;");
                    break;
            }
        }
    }
}
