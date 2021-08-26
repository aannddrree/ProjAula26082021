import javax.swing.*;

public class Ex11pedi {
    public static void main(String[] args) {
        int numDiasDoAno = 5;
        double temperatura[] = new double[numDiasDoAno];
        for (int i = 0; i<numDiasDoAno; i++){
            temperatura[i] = Double.parseDouble
                    (JOptionPane.showInputDialog(null,
                            "Entre com a temperatura: "));
        }
    }
}
