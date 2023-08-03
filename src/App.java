import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        swCase();

    }

    public static void baskara() {
        Double a, b, c, x1, x2, delta;

        a = Double.parseDouble(
                JOptionPane.showInputDialog("a:"));

        b = Double.parseDouble(
                JOptionPane.showInputDialog("b:"));

        c = Double.parseDouble(
                JOptionPane.showInputDialog("c:"));

        delta = (b * b) - (4 * a * c);

        x1 = ((b * (-1)) + (Math.sqrt(delta))) / 2 * a;

        x2 = ((b * (-1)) - (Math.sqrt(delta))) / 2 * a;

        System.out.printf("XI = %.2f e XII = %.2f", x1, x2);
    }

    public static void idade() {
        Integer a, b, c;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de a: ", null, 0));

        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de b: ", null, 0));

        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de c: ", null, 0));

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            String mensage;
            if ((a.equals(b)) && (b.equals(c))) {
                mensage = "Trinagulo Equilátero";
            } else if ((a.equals(b)) || (b.equals(c)) || (a.equals(c))) {
                mensage = "Triangulo Isósceles";
            } else {
                mensage = "Triangulo Escaleno";
            }

            JOptionPane.showMessageDialog(null, "Esse valores formam um" + mensage);

        } else {
            JOptionPane.showMessageDialog(null, "Esse valores não formam um triangulo");
        }
    }

    public static void placa() {
        Integer vel, placa;

        vel = Integer.parseInt(JOptionPane.showInputDialog("velocidade: "));
        placa = Integer.parseInt(JOptionPane.showInputDialog("final da placa: "));

        if (vel <= 60) {
            if (placa % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Placa final Par", null, 0);
            } else {
                JOptionPane.showMessageDialog(null, "Placa final Impar", null, 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Velocidade acima do permitido", null, 0);

            if (placa % 2 == 0) {
                JOptionPane.showMessageDialog(null, "Placa final Par", null, 0);
            } else {
                JOptionPane.showMessageDialog(null, "Placa final Impar", null, 0);
            }
        }
    }

    public static void swCase() {
        Integer mes;

        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "mês: ", null, 3));

        switch(mes) {
            case 1:
            JOptionPane.showMessageDialog(null, "Janeiro", null, 3);
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Fevereiro", null, 3);
            break;

            default:
            JOptionPane.showMessageDialog(null, "Outro", null, 3);                       
        }

    }
}
