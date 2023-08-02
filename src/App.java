import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        baskara();
       
    }

    public static void baskara(){
         Double a, b, c, x1, x2, delta;

        a = Double.parseDouble(
            JOptionPane.showInputDialog("a:")
        );

        b = Double.parseDouble(
            JOptionPane.showInputDialog("b:")
        );

        c = Double.parseDouble(
            JOptionPane.showInputDialog("c:")
        );

        delta = (b * b ) - (4 * a * c);

        x1 = ((b * (-1)) + (Math.sqrt(delta))) / 2 * a;
        
        x2 = ((b * (-1)) - (Math.sqrt(delta))) / 2 * a; 

        

        System.out.printf("XI = %.2f e XII = %.2f", x1, x2);
    }
}
