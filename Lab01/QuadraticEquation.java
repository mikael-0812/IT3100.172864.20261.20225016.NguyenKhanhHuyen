import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(
            JOptionPane.showInputDialog("Enter a:")
        );

        double b = Double.parseDouble(
            JOptionPane.showInputDialog("Enter b:")
        );

        double c = Double.parseDouble(
            JOptionPane.showInputDialog("Enter c:")
        );

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println(
                    "This is a linear equation. x = " + x
                );
            } else {
                if (c == 0) {
                    System.out.println(
                        "The equation has infinitely many solutions."
                    );
                } else {
                    System.out.println(
                        "The equation has no solution."
                    );
                }
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 =
                    (-b + Math.sqrt(delta)) / (2 * a);

                double x2 =
                    (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);

            } else if (delta == 0) {
                double x = -b / (2 * a);

                System.out.println(
                    "Double root: x = " + x
                );

            } else {
                System.out.println(
                    "The equation has no real root."
                );
            }
        }
    }
}