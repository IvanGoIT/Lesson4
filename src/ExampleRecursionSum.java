public class ExampleRecursionSum {
    public static void printString(int length) {
        if (length > 0) {
            System.out.print("0");
            printString(length - 1);
        }
    }

    public static void main(String[] args) {
        printString(3);
    }
}
