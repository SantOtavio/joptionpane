import javax.swing.*;

public class pergunta3 {
    public static void main(String[] args) {
        double valorCompra, dinheiroRecebidoATT, troco, precoProdutoATT;
        String precoProduto , dinheiroRecebido;
        double totalCompra = 0;
        int i , contador = 0;
        String itemsJoption = "";
        for ( i = 0; i != -1; i++) {
            contador++;
            String JoptionItems = "CONVENINENCIA BLABAL";
            //precoProduto = JOptionPane.showInputDialog(null, "Insira o preço do produto");
            //precoProduto = precoProduto.replace(',', '.');
            //precoProdutoATT = Double.parseDouble(precoProduto);

           // dinheiroRecebido = JOptionPane.showInputDialog(null, "Insira o preço do produto");
            //dinheiroRecebido = dinheiroRecebido.replace(',', '.');
            //dinheiroRecebidoATT = Double.parseDouble(dinheiroRecebido);

            //totalCompra = totalCompra + precoProdutoATT;
            //troco = dinheiroRecebidoATT - precoProdutoATT;

            //itemsJoption = itemsJoption + "LOJAS TABAJARA" + "\n" + "Produto: " + contador + "R$ " + precoProdutoATT;
            i = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja continuar?"
            );
            if (i == JOptionPane.YES_OPTION) {
                i = 1;
            } else if (i == JOptionPane.NO_OPTION) {
                i = 2;
            } else if (i == JOptionPane.CANCEL_OPTION) {
                i = -1;
            }
        }


    }
}
