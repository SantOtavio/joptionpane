import javax.swing.*;

public class pergunta9 {
    public static void main(String[] args) {
        int codigoTRUE, codigoClienteAlto = 0, codigoClienteBaixo = 0, codigoClienteGordo = 0, codigoClienteMagro = 0;
        double pesoTRUE, alturaTRUE, clienteAlto = 0, clienteBaixo = 0, clienteGordo = 0, clienteMagro = 0;

        do {
            String codigo = JOptionPane.showInputDialog(null, "Insira o código do cliente");
            codigo = codigo.replace(',', '.');
            codigoTRUE = Integer.parseInt(codigo);

            if (codigoTRUE != 0) {
                String altura = JOptionPane.showInputDialog(null, "Insira a altura do cliente");
                altura = altura.replace(',', '.');
                alturaTRUE = Integer.parseInt(altura);

                if (alturaTRUE > clienteAlto) {
                    clienteAlto = alturaTRUE;
                    codigoClienteAlto = codigoTRUE;
                }

                if (alturaTRUE < clienteAlto) {
                    clienteBaixo = alturaTRUE;
                    codigoClienteBaixo = codigoTRUE;
                }

                String peso = JOptionPane.showInputDialog(null, "Insira o peso do cliente");
                peso = peso.replace(',', '.');
                pesoTRUE = Integer.parseInt(peso);

                if (pesoTRUE > clienteGordo) {
                    clienteGordo = pesoTRUE;
                    codigoClienteGordo = codigoTRUE;
                }

                if (pesoTRUE < clienteGordo) {
                    clienteMagro = pesoTRUE;
                    codigoClienteMagro = codigoTRUE;
                }
            }

        } while (codigoTRUE != 0);

        String joptionitems = "Cliente mais alto: " + clienteAlto + " Codigo: " + codigoClienteAlto + "\n" + "Cliente mais baixo: " + clienteBaixo + " Codigo: " + codigoClienteBaixo + "\n" + "Cliente com mair peso: " + clienteGordo + " Codigo: " + codigoClienteGordo+ "\n" + "Cleinte com menor peso: " + clienteMagro + " Codigo: " + codigoClienteMagro;

        JOptionPane.showMessageDialog(null, joptionitems);
    }
}
