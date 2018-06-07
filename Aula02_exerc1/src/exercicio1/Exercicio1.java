
package exercicio1;
import java.util.Scanner;
public class Exercicio1 {

    
    public static void main(String[] args) {
        Nota nota1 = new Nota();
        nota1.valor = nota1.inserirNota();
        
        Nota nota2 = new Nota();
        nota2.valor = nota2.inserirNota();
        
        Nota nota3 = new Nota();
        nota3.valor = nota3.inserirNota();
        
        float media = (nota1.valor + nota2.valor + nota3.valor)/3;
        
        System.out.println("Média:" + media);
    }
    
}
