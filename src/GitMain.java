import java.util.Scanner;

public class GitMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("num 1:");
        double num1 = scanner.nextDouble();

        System.out.println("num 2:");
        double num2 = scanner.nextDouble();

        System.out.println(add(num1, num2));

    }

    public static double add(double a, double b) {
        return a + b;

    }


}
