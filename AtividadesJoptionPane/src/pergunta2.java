import javax.swing.*;

public class pergunta2 {
    public static void main(String[] args) {
        double valor = 0;
        int contador;
        double precoPaoNum;

        String JoptionItems = "PANIFICADORA ALFA";

        String precoPao = JOptionPane.showInputDialog(null, "Insira o preço do pão");

        precoPao = precoPao. replace(',', '.');
        precoPaoNum = Double.parseDouble(precoPao);

        for (contador = 1; contador <= 50; contador++) {
            valor = valor + precoPaoNum;
            JoptionItems = JoptionItems + "\n" + contador + " - " + valor;
        }

        JOptionPane.showMessageDialog(null, JoptionItems);
    }
}
