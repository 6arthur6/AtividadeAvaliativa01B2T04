package fag.objeto;
public class Musica {
    private String titulo;
    private int duracao;

    public Musica (String titulo, int duracao){
        setTitulo(titulo);
        setDuracao(duracao);
    }

    public String formatarD(){
        int min = duracao / 60;
        int sec = duracao % 60;
        return String.format("%02d:%02d", min, sec);
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isEmpty()) this.titulo = titulo;
        else System.out.println("Titulo invalido");
    }

    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        if (duracao > 0) this.duracao = duracao;
        else System.out.println("Duracao invalida");
    }
}
