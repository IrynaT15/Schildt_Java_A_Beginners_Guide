package chapter3;

public class Help {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice;
        System.out.println("Help:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Select 1 or 2: ");

        choice = (char) System.in.read();

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
            default:
                System.out.println("The request is not found.");
        }
    }
}
