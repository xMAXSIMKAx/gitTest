import java.util.InputMismatchException;
import java.util.Scanner;

public class GitMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("num 1:");

            double num1 = scanner.nextDouble();

            System.out.println("num 2:");
            double num2 = scanner.nextDouble();
            System.out.println("виберіть дію додавання 1 чи віднімання 2");
            int action = scanner.nextInt();

            switch (action) {
                case 1: {
                    System.out.println(add(num1, num2));

                }
                break;
                case 2: {
                    System.out.println(subtraction(num1, num2));

                }
                break;
                default:
                    System.out.println("error try again");
            }
        } catch (InputMismatchException e) {
            System.out.println("error try again");
        }

    }

    public static double add(double a, double b) {
        return a + b;

    }

    public static double subtraction(double a, double b) {
        return a - b;
    }


}
