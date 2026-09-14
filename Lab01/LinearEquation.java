import javax.swing.JOptionPane;

public class LinearEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(
            JOptionPane.showInputDialog("Enter a:")
        );

        double b = Double.parseDouble(
            JOptionPane.showInputDialog("Enter b:")
        );

        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        } else {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        }
    }
}