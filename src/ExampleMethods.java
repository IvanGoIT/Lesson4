public class ExampleMethods {

    public static void hello(String argName) {
        System.out.println("Hello " + argName);
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static float sum(float a, float b) {
        float result = a + b;
        return result;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int[] arr) {
        int result = 0;

        for(int element : arr)
            result += element;

        return result;
    }

    public static void main(String[] args) {
        hello("Agent 007");

        int sumOfIntegers = sum(10, 5);
        float sumOfFloat = sum(10.5f, 5.5f);

        System.out.println("Sum Int " + sumOfIntegers);
        System.out.println("Sum Float " + sumOfFloat);
        System.out.println("Sum Int(3) " + sum(5, 10, 10));
        System.out.println("Sum Arr int " + sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }
}
