
package aula3exerc1;

import javax.swing.JOptionPane;
public class Aula3exerc1 {

    
    public static void main(String[] args) {

        //Exercício 1
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        System.out.println("Nome informado: " + nome);
        System.out.println("Numero de caracteres: " + nome.length());
        String letras = nome.replaceAll(" ","");
        System.out.println("Número de letras: " + letras.length());
        String nomeUp = nome.toUpperCase();
        System.out.println("Nome com toUpperCase: " + nomeUp);
        String nomeLow = nome.toLowerCase();
        System.out.println("Nome com toLowerCase: " + nomeLow);
        
        //Exercício 2
        System.out.print("Nome abreviado: ");
        String[] n = nome.split(" ");
        int tam = n.length;
        for(int i = 0; i < tam; i++){
            System.out.print(n[i].charAt(0));
        }
        System.out.println("");
        
        //Exercício 3
        String frase = JOptionPane.showInputDialog("Digite uma frase");
        String palavra = JOptionPane.showInputDialog("Digite uma palavra da frase anterior para substituir");
        String palavraNova = JOptionPane.showInputDialog("Digite uma palavra diferente");
        String fraseNova = frase.replace(palavra,palavraNova);
        System.out.println(frase);
        System.out.println(fraseNova);
    }
    
}
