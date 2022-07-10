package calculadorageometrica;
import java.util.Scanner;

public class triangulo {
     private double base, altura, lado1, lado2, lado3;
    
    //Constructor con todos los parametros
    triangulo(double b, double h, double l, double m, double n){
        double p, a;
        p = l+m+n;
        a=(b*h)/2;
        
        System.out.println("El perimetro del triangulo es: " + p);
        System.out.println("El area del triangulo es: " + a);
        
    }
    
    //Constructor sin parametros que inicialice los atributos del objeto
    triangulo(){
        this.base=0;
        this.altura=0;
        this.lado1=0;
        this.lado2=0;
        this.lado3=0;
        System.out.println("Base: " + base);
    }
    
    public String metodoPerimetro(){
        double r;
        r = getLado1() + getLado2() + getLado3();
        return "El perimetro del rectangulo es: " + r;
    }
    
    public double metodoArea(){
        double r;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la base: ");
        setBase(leer.nextDouble());
        System.out.println("Digite la altura");
        setAltura(leer.nextDouble());
        r = (getBase()*getAltura())/2;
        return r;
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

    /**
     * @return the lado1
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * @param lado1 the lado1 to set
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    /**
     * @return the lado2
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * @param lado2 the lado2 to set
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    /**
     * @return the lado3
     */
    public double getLado3() {
        return lado3;
    }

    /**
     * @param lado3 the lado3 to set
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
