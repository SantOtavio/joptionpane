import javax.swing.*;

public class pergunta7 {
    public static void main(String[] args) {
        int numForMultiply;
        int startMultiply , endMultiply;
        int multiply;

       String numForMultiplyLOL = JOptionPane.showInputDialog(null , "Insira o número para multiplicação:");
        numForMultiplyLOL = numForMultiplyLOL.replace(',', '.');
        numForMultiply = Integer.parseInt(numForMultiplyLOL);

        String startMultiplyLOL = JOptionPane.showInputDialog(null , "Insira o número para começar a multiplicação:");
        startMultiplyLOL = startMultiplyLOL. replace(',', '.');
        startMultiply = Integer.parseInt(startMultiplyLOL);

        String endMultiplyLOL = JOptionPane.showInputDialog(null , "Insira o número para terminar a multiplicação:");
        endMultiplyLOL = endMultiplyLOL. replace(',', '.');
        endMultiply = Integer.parseInt(endMultiplyLOL);

        if(startMultiply < endMultiply){
            String joptionitems = "Número para multiplicar: " + numForMultiply + "\n" + "Começando por: " + startMultiply + "\n" + "Terminando por: " + endMultiply;
            JOptionPane.showMessageDialog(null , joptionitems);
            for (int i = startMultiply ; i <= endMultiply ; i++){
                multiply = numForMultiply * i;
                JOptionPane.showMessageDialog(null , numForMultiply + "X" + i + "=" + multiply);
            }
        }
    }
}
