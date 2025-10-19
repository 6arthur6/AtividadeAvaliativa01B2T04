package atv;

public class Fucionario {
    private String nome;
    private double salario;

    public Fucionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public void aumento(double percentual){
        if (percentual > 0){
            salario += salario * (percentual / 100);
        }
    }

    public String getNome() { 
        return nome;
    }
     public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) this.nome = nome;
        else System.out.println("Nome invalido");
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        if (salario >= 0) this.salario = salario;
        else System.out.println("salario invalido");
    }


}
