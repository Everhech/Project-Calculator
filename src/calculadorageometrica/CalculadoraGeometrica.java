package calculadorageometrica;

import java.util.Scanner;

public class CalculadoraGeometrica {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int R;
        
        /*//Instancia de la clase Cuadrado:        
        cuadrado Cuadrado = new cuadrado(4);
        //Instancia de la clase Rectangulo:
        rectangulo rec = new rectangulo(4,5);
        //Instancia de la clase Triangulo
        triangulo Tri = new triangulo(4,5,3,2,10);
        //Instancia de la clase Rombo:
        rombo Rom = new rombo(4,5,12);
        //Instancia de la clase Romboide:
        romboide Romboide = new romboide(4,5);*/
        
        System.out.println("Menu:\n 1.Cuadrado\n 2.Rectangulo\n 3.Triangulo\n 4.Rombo\n 5.Romboide\n Opcion:");
        R = leer.nextInt();
        switch(R){
            case 1:
                cuadrado Cuadrado = new cuadrado(4); break;
            case 2:
                rectangulo rec = new rectangulo(4,5); break;
            case 3:
                triangulo Tri = new triangulo(4,5,3,2,10); 
                System.out.println("Area del triangulo: " + Tri.metodoArea());
                break;
                
            case 4:
                rombo Rom = new rombo(4,5,12); break;
            case 5:
                romboide Romboide = new romboide(4,5); break;
            default: 
                System.out.println("Opcion digitada incorrecta"); break;
        }
    }
}
    

