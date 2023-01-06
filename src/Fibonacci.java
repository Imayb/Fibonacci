import java.util.Scanner;

public class Fibonacci {
    static int recursionCount = 0;

    public static int fibonacciRecursion(int n) {
        recursionCount++;
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static int fibonacciIteration(int n) {
        int first = 0, second = 1, third = 1;
        for (int i = 0; i < n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        return first;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        System.out.println("The nth term in the fibonacci series using recursion is: " + fibonacciRecursion(n));
        System.out.println("Number of recursive calls = " + recursionCount);

        System.out.println("\n");
        System.out.println("The nth term in the fibonacci series using iteration is: " + fibonacciIteration(n));
    }
}
