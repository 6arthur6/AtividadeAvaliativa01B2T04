package fag.objeto;
public class Filme {
        private String titulo;
        private double avaliacao;

        public Filme(){}
        public Filme(String titulo, double avaliacao){
            setTitulo (titulo);
            setAvaliacao(avaliacao);
        }

        public void exibe(){
            System.out.println("Filme"+ titulo + " Avaliação: " + avaliacao + "");
        }

        public String getTitulo(){ 
            return titulo;
        }
        public void setTitulo(String titulo){
            if (titulo != null && !titulo.isEmpty()) this.titulo = titulo;
            else System.out.println("Titulo invalido");
        }

        public double getAvaliacao(){
            return avaliacao;
        }
        public void setAvaliacao(double avaliacao){
            if (avaliacao >= 0 && avaliacao <= 5) this.avaliacao = avaliacao;
            else System.out.println("Avaliacao deve ser entre 0 e 5");
        }
        
}
