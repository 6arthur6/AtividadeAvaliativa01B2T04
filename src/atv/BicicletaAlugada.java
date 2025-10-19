package atv;
public class BicicletaAlugada {
    private int horas;
    private double valorHora;

    public BicicletaAlugada(int horas, double valorHora) {
        setHoras(horas);
        setValorHora(valorHora);
    }

    public double calcularValor() {
        return horas * valorHora;
    }

    public int getHoras() { return horas; }
    public void setHoras(int horas) {
        if (horas >= 1) this.horas = horas;
        else System.out.println("Horas inválidas!");
    }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) {
        if (valorHora > 0) this.valorHora = valorHora;
        else System.out.println("Valor por hora inválido!");
    }
}