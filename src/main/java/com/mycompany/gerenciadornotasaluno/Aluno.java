/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciadornotasaluno;

import java.util.ArrayList;
/**
 *
 * @author Win
 */
public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome){
        this.nome = nome;
        this.notas = new ArrayList<>();
    }
    
    public void adicionarNota(double nota){
        notas.add(nota);
    }
    
    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        return soma / notas.size();
    }
    
    public String avaliarDesempenho(){
        double media = calcularMedia();
        if (media < 6.0) {
            return "Reprovado!";
        } else if (media <= 9) {
            return "Aprovado!";
        } else {
            return "Ótimo Aproveitamento!";
        }
    }
    
    public String getNome(){
        return nome;
    }
    
    public ArrayList<Double> getNotas(){
        return notas;
    }
}
