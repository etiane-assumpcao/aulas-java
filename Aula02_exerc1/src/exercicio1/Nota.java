
package exercicio1;
import java.util.Scanner;

public class Nota {
    public float valor;
    
    public float inserirNota(){
        System.out.println("Digite a nota");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextFloat();
        return valor;
    }
}
