package atv;

public class ContaLuz {
    private double consumoKvh;
    private double valorKvh;

    public ContaLuz(double consumoKvh, double valorKvh) {
        setConsumoKvh(consumoKvh);
        setValorKvh(valorKvh);
    }
    public double valorTotal(){
        return consumoKvh * valorKvh;
    }

    public double getConsumoKvh() {return consumoKvh;}
    public void setConsumoKvh (double consumoKvh){
        if (consumoKvh > 0) this.consumoKvh = consumoKvh;
        else System.out.println("Consumo invalido");
    }

    public double getValorKvh() {return valorKvh;}
    public void setValorKvh (double valorKvh){
        if (valorKvh > 0) this.valorKvh = valorKvh;
        else System.out.println("Valor de kvh invalido");
    }
}