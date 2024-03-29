import java.util.Scanner;
public class MyQuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("=================================================");
        System.out.println("Welcome to QUADRATIC EQUATION SOLVER PROGRAM!"); System.out.println("====================================================");

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        calculateAndPrintRoots(a, b, c, discriminant);

        System.out.println("\nThank you for using MY QUADRATIC EQUATION SOLVER PROGRAM!");
    }

    private static void calculateAndPrintRoots(double a, double b, double c, double discriminant) {
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("\nThe equation has two real solutions:");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("\nThe equation has one real solution:");
            System.out.printf("Root: %.2f\n", root);
        } else {
            System.out.println("\nThe equation has no real solutions.");
        }
    }
}
