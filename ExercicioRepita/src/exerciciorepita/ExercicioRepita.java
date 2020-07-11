/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 1, totalValores = 0, soma = 0, pares = 0, impares = 0, maior100 = 0, media = 0;
        
        while (n != 0){
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Informe um valor \n (0 interrompe)", "Entrada de Dados", JOptionPane.WARNING_MESSAGE));
            
            if (n > 0){
                totalValores++;
                soma += n;

                if (n % 2 == 0){
                    pares++; 
                } else {
                     impares++;
                }

                if (n > 100){
                    maior100++;
                }        
            }
        }
        
        media = soma / totalValores;
        
        JOptionPane.showMessageDialog(null, "Resultado:" + "\n\n"
                + "Total de valores: " + totalValores + "\n"
                + "Total da soma: " + soma + "\n"
                + "Total de pares: " + pares + "\n"
                + "Total de ímpares: " + impares + "\n"
                + "Acima de 100: " + maior100 + "\n"
                + "Média dos valores: " + media + "\n");
        
    }
    
}
