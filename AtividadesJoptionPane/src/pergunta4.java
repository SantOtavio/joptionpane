import javax.swing.*;
import java.util.Scanner;

public class pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numSemFatoracao = JOptionPane.showInputDialog(null, "Insira o número para fatorar");

        numSemFatoracao = numSemFatoracao. replace(',', '.');
        double numSemFatoracaoMain = Double.parseDouble(numSemFatoracao);
        double numeroFatorado = numSemFatoracaoMain;
        String joptionitems = "";

        while(numSemFatoracaoMain > 1){
            numeroFatorado = numeroFatorado * (numSemFatoracaoMain - 1);
            numSemFatoracaoMain--;
        }
        JOptionPane.showMessageDialog(null, numeroFatorado);
    }
}
