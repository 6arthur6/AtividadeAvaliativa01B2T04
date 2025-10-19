package atv;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial){
        setTitular(titular);
        setSaldo(saldoInicial);
    }

    public void depositar(double valor){
        if (valor > 0 ){
            saldo += valor;
        }else{
            System.out.println("Valor invalido!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo - valor >= 0){
            saldo -= valor;
        }else{
            System.out.println("Saque invalido, saldo insuficiente ou valor incorreto");
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular (String titular){
        if (titular != null && !titular.isEmpty()){
            this.titular = titular;
        }else{
            System.out.println("Titular invalido");
        }
    }
    public double getSaldo () {
        return saldo;
    }

    public void setSaldo (double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }else {
            System.out.println("Saldo negativo");
        }
    }
}