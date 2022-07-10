package calculadorageometrica;
import java.util.Scanner;

public class rombo {
    private double lado, diagMenor, diagMayor;
    
    Scanner leer = new Scanner(System.in);
    
    rombo(double a, double d, double D){
        double P, A;
        P = 4*a;
        A = (D*d)/2;
        
        System.out.println("El perimetro del rombo es: " + P);
        System.out.println("El area del rombo es: " + A);
    }
    
    public String metodoPerimetro(){
        double r;
        System.out.println("Digite el valor de uno de los lados: ");
        setLado(leer.nextDouble());
        r = 4*getLado();
        return "El perimetro del rombo es: " + r;
    }
    
    public String metodoArea(){
        double r;
        System.out.println("Digite el valor del menor: ");
        setDiagMenor(leer.nextDouble());
        System.out.println("Digite el valor del mayor: ");
        setDiagMayor(leer.nextDouble());
        r = (getDiagMenor()*getDiagMayor())/2;
        return "El area del rombo es: " + r;
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

    /**
     * @return the diagMenor
     */
    public double getDiagMenor() {
        return diagMenor;
    }

    /**
     * @param diagMenor the diagMenor to set
     */
    public void setDiagMenor(double diagMenor) {
        this.diagMenor = diagMenor;
    }

    /**
     * @return the diagMayor
     */
    public double getDiagMayor() {
        return diagMayor;
    }

    /**
     * @param diagMayor the diagMayor to set
     */
    public void setDiagMayor(double diagMayor) {
        this.diagMayor = diagMayor;
    }
}
