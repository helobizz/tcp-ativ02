/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadornotasaluno;
import javax.swing.JOptionPane;

/**
 *
 * @author Win
 */
public class GerenciadorNotasAluno {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome completo do aluno: ", "Cadastro de Aluno", JOptionPane.QUESTION_MESSAGE);
        
        Aluno a1 = new Aluno(nome);
        
        for (int i = 1; i <= 3; i++){
            String notas = JOptionPane.showInputDialog(null, "Digite a nota " + i + " (0 a 10):", "Lançamento de Notas", JOptionPane.QUESTION_MESSAGE);
            
            double nota = Double.parseDouble(notas);
            a1.adicionarNota(nota);
        }
        
        double media = a1.calcularMedia();
        String situacao = a1.avaliarDesempenho();
        
        String mensagem = String.format("Aluno: %s\nMédia: %.2f\nSituação: %s", a1.getNome(), media, situacao);
        
        JOptionPane.showMessageDialog(null, mensagem, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
