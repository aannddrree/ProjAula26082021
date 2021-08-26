import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex11 {

    public static void main(String[] args) {

        //Get data/hora do sistema:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        int numDiasDoAno = 5;

        double temperatura[] = new double[numDiasDoAno];
        double somaTemperatura = 0;
        double mediaTemperatura = 0;

        for (int i = 0; i<numDiasDoAno; i++){
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com a temperatura: "));
            somaTemperatura = somaTemperatura + temperatura[i];
        }

        mediaTemperatura = somaTemperatura / numDiasDoAno;

        //Gerar String de Saida:
        String output = dtf.format(now) + " - ";
        for (double temp:temperatura) {
            output = output + " [" + temp + "] ";
        }
        output = output + " - Média: " + mediaTemperatura;

        JOptionPane.showMessageDialog(null, output);
    }
}
