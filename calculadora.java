import javax.swing.JOptionPane;

public class calculadora {
    public static void main(String[] args) {
        String h = "a";
        while (h.equals("a")) {
            String n = JOptionPane.showInputDialog("ingrese un numero ");
            int n1 = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("ingrese otro numero ");
            int n2 = Integer.parseInt(n);
            n = JOptionPane.showInputDialog("ingrese un signo aritmetico");
            n = n.toLowerCase();
            if (n.equals("+")) {
                int resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "el total es: " + resultado);
            } else if (n.equals("-")) {
                int resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "el total es: " + resultado);
            } else if (n.equals("*")) {
                int resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "el total es: " + resultado);
            } else if (n.equals("/")) {
                int resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "el total es: " + resultado);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese signo valido");
            }
            int resp = JOptionPane.showConfirmDialog(null, "Desea salir de la calculadora??");
            if (resp == JOptionPane.YES_OPTION || resp == JOptionPane.CANCEL_OPTION) {
                h = "b";
            } else {
                h = "a";
            }
        }
    }
}