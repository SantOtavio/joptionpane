import javax.swing.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperatura;
        double maior = 0, menor = 0;
        double somatemperatura = 0;
        int i = 0;
        int test;

        do {
            i++;
            test = JOptionPane.showConfirmDialog(null , "Deseja continuar?");
            if (test == 0 || test == 2){

                String temperaturabefore = JOptionPane.showInputDialog(null, "Insira a temperatura:");
                temperaturabefore = temperaturabefore. replace(',', '.');
                temperatura = Double.parseDouble(temperaturabefore);

                somatemperatura += temperatura;

                if (temperatura > maior){
                    maior = temperatura;
                }

                if (temperatura < maior){
                    menor = temperatura;
                }

            }
        }while (test != 1);
        String joptionitems = "Maior temperatura: " + maior + "\n" + "Menor temperatura: " + menor + "\n" + "Média das temperaturas: " + somatemperatura / i;
        JOptionPane.showMessageDialog(null , joptionitems);
    }
}
