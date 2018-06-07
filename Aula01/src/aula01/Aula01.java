
package aula01;

/**
 *
 * @author user
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("teste");
        
        Funcionario f1 = new Funcionario("Ana", "Diretora", 5000);
        Funcionario f2 = new Funcionario("Beatriz", "Gerente", 3000);
        Funcionario f3 = new Funcionario("Caio", "Vendedor", 1500);
        
        /* Exercício 2
        System.out.println(f1.nome + " - " + f1.funcao + " - " + f1.salario);
        System.out.println(f2.nome + " - " + f2.funcao + " - " + f2.salario);
        System.out.println(f3.nome + " - " + f3.funcao + " - " + f3.salario);
        */
        
        
        /* Exercício 5*/
        System.out.println(f1.getNome() + " - " + f1.getFuncao() + " - " + f1.getSalario() + " - " + f1.getMat());
        System.out.println(f2.getNome() + " - " + f2.getFuncao() + " - " + f2.getSalario() + " - " + f2.getMat());
        System.out.println(f3.getNome() + " - " + f3.getFuncao() + " - " + f3.getSalario() + " - " + f3.getMat());
        
    }
    
}
