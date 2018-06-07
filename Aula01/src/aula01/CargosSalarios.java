
package aula01;

/**
 *
 * @author user
 */
public class CargosSalarios {
    
    public float buscaSalario(String funcao){
        
        float salario = 0;
        
        switch (funcao) {
            case "diretor": salario = 5000;
                break;
            case "vendedor": salario = 3000;
                break;
            case "secretario": salario = 1000;
                break;
        }
        
        return salario;
    }
}
