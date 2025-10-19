package atv;

public class Temperatura {
    private double c;

    public Temperatura(double c){
        setC (c);
    }

    public double paraF(){
        return (c * 9 / 5) + 32;
    }

    public double paraK () {
        return c + 273.15;
    }

    public double getC(){return c;}
    public void setC(double c){
        if ( c >= -273.15) this.c = c;
        else System.out.println("Temperatura abaixo de 0 absoluto");
    }
}
