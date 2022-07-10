package calculadorageometrica;
import java.util.Scanner;

public class romboide {
     private double base, altura;
    
    Scanner leer = new Scanner(System.in);
    
    romboide(double b, double h){
        double P, A;
        P = (2*b)+(2*h);
        A = b*h;
        System.out.println("El perimetro del romboide es: " + P);
        System.out.println("El area del romboide es: " + A);
    }
    
    public String metodoPerimetro(){
        double r;
        System.out.println("Digite el valor de la base: ");
        setBase(leer.nextDouble());
        System.out.println("Digite el valor de la altura: ");
        setAltura(leer.nextDouble());
        r = (2*getBase())+(2*getAltura());
        return "El perimetro del romboide es: " + r;
    }
    
    public String metodoArea(){
        double r;
        System.out.println("Digite el valor de la base: ");
        setBase(leer.nextDouble());
        System.out.println("Digite el valor de la altura: ");
        setAltura(leer.nextDouble());
        r = getBase()*getAltura();
        return "El area del romboide es: " + r;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
