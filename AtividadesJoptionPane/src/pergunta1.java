import javax.swing.*;

public class pergunta1 {
    public static void main(String[] args) {
        double valor = 0;
        int contador;
        String JoptionItems = "LOJA TUDO DOIS";

        for (contador = 1; contador <= 50; contador++) {
            valor = valor + 1.99;
            JoptionItems = JoptionItems  + "\n" + contador + " - " + valor;
        }
        JOptionPane.showMessageDialog(null, JoptionItems);
    }
}
