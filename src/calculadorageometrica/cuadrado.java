package calculadorageometrica;
import java.util.Scanner;

public class cuadrado {
    private double lado;
    Scanner leer = new Scanner(System.in);
    cuadrado(double a){
        double p, ar;
        p = 4*a;
        ar = a*a;
        System.out.println("El perimetro del cuadrado es: "  + p);
        System.out.println("El area del cuadrado es: " + ar);
    }
    
    public String metodoPerimetro(){
        double r;        
        System.out.println("Digite uno de los lados del cuadrado: ");
        setLado(leer.nextDouble());
        r = 4*getLado();
        return "El perimetro es: " + r;
    }

    public String metodoArea(){
        double r;
        
        System.out.println("Digite el valor de un lado del cuadrado: ");
        setLado(leer.nextDouble());
        r=getLado()*getLado();
        return "El area del cuadrado es: " + r;
         
    }
    
    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
}
