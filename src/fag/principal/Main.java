package fag.principal;

import fag.objeto.BicicletaAlugada;
import fag.objeto.ContaBancaria;
import fag.objeto.ContaLuz;
import fag.objeto.Filme;
import fag.objeto.Fucionario;
import fag.objeto.Musica;
import fag.objeto.Pessoa;
import fag.objeto.ProdutosEstoque;
import fag.objeto.Retangulo;
import fag.objeto.Temperatura;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n##### 1. CONTA BANCÁRIA #####");
        ContaBancaria conta = new ContaBancaria("Arthur", 500.0);
        conta.depositar(200);
        conta.sacar(100);
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo final R$: " + conta.getSaldo());

        System.out.println("\n##### 2. FILME #####");
        Filme f1 = new Filme(" Interestelar", 4.8);
        Filme f2 = new Filme(" RRR", 3.0);
        f1.exibe();
        f2.exibe();

        System.out.println("\n##### 3. FUNCIONÁRIO #####");
        Fucionario f = new Fucionario("Arthur", 3000);
        System.out.println("Salário inicial: " + f.getSalario());
        f.aumento(30);
        System.out.println("Salário após aumento: " + f.getSalario());

        System.out.println("\n##### 4. RETÂNGULO #####");
        Retangulo r = new Retangulo(5, 3);
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perim());

        System.out.println("\n##### 5. MÚSICA #####");
        Musica m1 = new Musica("Ratamahatta", 213);
        Musica m2 = new Musica("Ambush", 112);
        System.out.println(m1.getTitulo() + " - " + m1.formatarD());
        System.out.println(m2.getTitulo() + " - " + m2.formatarD());

        System.out.println("\n##### 6. PESSOA (IMC) #####");
        Pessoa p = new Pessoa("João", 90, 1.80);
        System.out.println("IMC: " + p.calcIMC());
        System.out.println("Classificação: " + p.classIMC());

        System.out.println("\n##### 7. CONTA DE LUZ #####");
        ContaLuz c = new ContaLuz(350, 0.75);
        System.out.println("Valor total da conta: R$ " + c.valorTotal());

        System.out.println("\n##### 8. ALUGUEL DE BICICLETA #####");
        BicicletaAlugada aluguel = new BicicletaAlugada(4, 10);
        System.out.println("Valor total do aluguel: R$ " + aluguel.calcularValor());

        System.out.println("\n##### 9. PRODUTO ESTOCADO #####");
        ProdutosEstoque prod = new ProdutosEstoque("Teclado Dell", 10);
        prod.adicionarEstoque(5);
        prod.removerEstoque(2);
        System.out.println("Quantidade final: " + prod.getQtd());

        System.out.println("\n##### 10. TEMPERATURA #####");
        Temperatura t = new Temperatura(32);
        System.out.println("Fahrenheit: " + t.paraF());
        System.out.println("Kelvin: " + t.paraK());
    }
}
