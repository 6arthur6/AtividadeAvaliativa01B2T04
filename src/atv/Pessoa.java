package atv;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa ( String nome, double peso, double altura){
        setNome (nome);
        setPeso (peso);
        setA (altura);
    }

    public double calcIMC(){
        return peso / (altura * altura);
    }

    public String classIMC(){
        double imc = calcIMC();
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obeso";
    }

    public String getNome(){ return nome;}
    public void setNome(String nome){
        if ( nome != null && !nome.isEmpty()) this.nome = nome;
        else System.out.println("Nome invalido");
    }

    public double getPeso(){ return peso;}
    public void setPeso(double peso){
        if (peso > 0) this.peso = peso;
        else System.out.println("Peso invalido");
    }

    public double getA(){ return altura;}
    public void setA( double altura){
        if (altura > 0) this.altura = altura;
        else System.out.println("Altura invalida");
    }
}
