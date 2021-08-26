import javax.swing.*;

public class Ex10 {

    public static void main(String[] args) {

        //Entrar com o número de habitantes
        int numHabitantes = 4;

        //Declaração dos vetores
        double salario[] = new double[numHabitantes];
        int numFilhos[] = new int[numHabitantes];

        //Informações Saida
        double totalSalario = 0;
        double mediaSalario = 0;
        int totalFilhos = 0;
        int mediaFilhos = 0;
        double maiorSalario = 0;
        int qtdPessoaSalarioMenor150 = 0;
        double porcentagem = 0;

        for (int i = 0; i < numHabitantes; i++){
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Entre com o valor do salário: "));
            numFilhos[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de filhos: "));
            totalSalario = totalSalario + salario[i];
            totalFilhos = totalFilhos + numFilhos[i];

            if (salario[i] > maiorSalario) maiorSalario = salario[i];
            if (salario[i] < 150) qtdPessoaSalarioMenor150++;
        }

        mediaSalario = totalSalario / numHabitantes;
        mediaFilhos = totalFilhos / numHabitantes;
        porcentagem = (qtdPessoaSalarioMenor150 * 100) / numHabitantes;

        String output = "Média Salário: " + mediaSalario +
                      "\nMédia Filhos: " + mediaFilhos +
                      "\nMaior Salário: " + maiorSalario +
                      "\nPercentual < 150: " + porcentagem + "%";

        JOptionPane.showMessageDialog(null,output);
    }
}
