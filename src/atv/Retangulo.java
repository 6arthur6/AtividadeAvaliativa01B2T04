package atv;

public class Retangulo {
    private double l;
    private double a;

    public Retangulo(double l, double a) {
        setL(l);
        setA(a);
    }

    public double area() {
        return l * a;
    }
    public double perim(){
        return 2 * (l+a);
    }

    public double getL(){
        return l;
    }
    public void setL(double l){
        if (l > 0) this.l = l;
        else System.out.println("Largura invalida");
    }

    public double getA(double a){
        return a;
    }
    public void setA(double a){
        if(a > 0) this.a = a;
        else System.out.println("Altura invalida");
    }
}
