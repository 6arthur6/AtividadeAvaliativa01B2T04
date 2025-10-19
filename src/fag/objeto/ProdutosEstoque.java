package fag.objeto;

public class ProdutosEstoque {
    private String nome;
    private int quantidade;

    public ProdutosEstoque(String nome, int quantidade){
        setNome(nome);
        setQtd(quantidade);
    }

    public void adicionarEstoque(int qtd){
        if (qtd > 0) quantidade += qtd;
    }

    public void removerEstoque(int qtd){
        if (qtd > 0 && quantidade - qtd >= 0) quantidade -= qtd;
        else System.out.println("Remocao invalida");
    }

    public String getNome(){ return nome;}
    public void setNome ( String nome){
        if (nome !=null && !nome.isEmpty()) this.nome = nome;
        else System.out.println("Nome inválido");
    }

    public int getQtd(){return quantidade;}
    public void setQtd(int quantidade){
        if(quantidade >= 0) this.quantidade = quantidade;
        else System.out.println("Quantidade invalida");
    }
    
}
