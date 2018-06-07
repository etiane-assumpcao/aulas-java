/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author user
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float media = 0;
        int qtd;
        float[] notas;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidades de notas que serão inseridas: ");
        qtd = sc.nextInt();
        notas = new float[qtd];
        
        for(int i=0; i<qtd; i++){
            System.out.println("Digite uma nota");
            notas[i] = sc.nextFloat();
            media += notas[i];
        }
        
        media = media / qtd;
        
        DecimalFormat df = new DecimalFormat("0.##");
        String mediaFormatada = df.format(media);
        System.out.println("Sua média é: " + mediaFormatada);
    }
    
}
