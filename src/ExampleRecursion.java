public class ExampleRecursion {

    public static int factorial(int x) {
        if (x == 1) return 1;
        return factorial(x - 1) * x;
    }

    public static void main(String[] args) {
        // AB факториал от 2

        // AB - 1
        // BA - 2


        // 123 факториал от 3

        // 123
        // 132
        // 213
        // 231
        // 312
        // 321 - 6

        // F(3) == F(2) * 3;
        // F(2) == F(1) * 2;
        // F(1) == F(0) * 1;

        System.out.println("Factorial x = 100 --- " + factorial(3));
    }
}
