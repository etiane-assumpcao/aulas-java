
package aula01;

/**
 *
 * @author user
 */
public class Funcionario {
    
    private int mat;
    private String nome;
    private String funcao;
    private float salario;
    private static int sequence = 1;

    public int getMat() {
        return mat;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public float getSalario() {
        return salario;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String funcao, float salario) {
        this.mat = sequence++;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public Funcionario(String n, String f) {
        CargosSalarios valor = new CargosSalarios();
        float s = valor.buscaSalario(f);
       Funcionario funcionario = new Funcionario(n, f, s);
            
    }
    
}
