/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03poo2;

/**
 *
 * @author Professor
 */
public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa() {

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
     public Pessoa(int idade1, String nome) {
        this.nome = nome;
        this.idade = idade;
        
    }

    public void imprime() {
        System.out.println("Ola");
    }

    public void imprime(String nome) {
        System.out.println("Ola" + nome);
    }

}
