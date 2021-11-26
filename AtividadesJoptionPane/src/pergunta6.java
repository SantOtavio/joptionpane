import javax.swing.*;

public class pergunta6 {
    public static void main(String[] args) {
        int numCERTO;
        int numeroTrue = 0;
        String num = JOptionPane.showInputDialog(null, "Insira o número:");

        num = num.replace(',', '.');
        numCERTO = Integer.parseInt(num);

        for (int j = 2; j < numCERTO; j++) {
            if (numCERTO % j == 0) {
                numeroTrue += 1;
            } else {
                numeroTrue += 0;
            }

        }
        if (numeroTrue != 1) {
            JOptionPane.showMessageDialog(null, "O número digitado é primo!");
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado é composto!");
        }

    }
}
