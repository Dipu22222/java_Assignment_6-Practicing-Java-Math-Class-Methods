import java.util.Scanner;

public class MathPractice {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

      
        System.out.println("Equation 1: Calculate the height of a right triangle.");
        System.out.print("Enter base (b): ");
        double b = input.nextDouble();
        System.out.print("Enter angle (theta in degrees): ");
        double angle = input.nextDouble();
        double height = b * Math.tan(Math.toRadians(angle));
        System.out.println("Height is: " + height);

       
        System.out.println("\nEquation 2: Compound Interest Calculation.");
        System.out.print("Enter Principal (P): ");
        double P = input.nextDouble();
        System.out.print("Enter Annual Interest Rate (r as a decimal): ");
        double r = input.nextDouble();
        System.out.print("Enter Number of Compounds per Year (n): ");
        double n = input.nextDouble();
        System.out.print("Enter Time in Years (t): ");
        double t = input.nextDouble();
        double A = P * Math.pow(1 + r / n, n * t);
        System.out.println("Total Amount: " + A);

    
        System.out.println("\nEquation 3: Convert Cartesian to Polar Coordinates.");
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter y: ");
        double y = input.nextDouble();
        double rPolar = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double theta = Math.toDegrees(Math.atan(y / x));
        System.out.println("Radius: " + rPolar + ", Angle: " + theta);

       
        System.out.println("\nEquation 4: Calculate Distance Between Two Points.");
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance is: " + dist);

        
        System.out.println("\nEquation 5: Solve Quadratic Equation.");
        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter coefficient b: ");
        double bq = input.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double dis = Math.pow(bq, 2) - 4 * a * c;

        if (dis >= 0) {
            double root1 = (-bq + Math.sqrt(dis)) / (2 * a);
            double root2 = (-bq - Math.sqrt(dis)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);

            if (root1 >= 0 && root2 >= 0) {
                System.out.println("Smallest positive root is: " + Math.min(root1, root2));
            } else if (root1 >= 0) {
                System.out.println("Smallest positive root is: " + root1);
            } else if (root2 >= 0) {
                System.out.println("Smallest positive root is: " + root2);
            } else {
                System.out.println("No positive roots.");
            }
        } else {
            System.out.println("No real roots");
        }

        input.close();
    }
}
