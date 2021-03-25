import java.util.Scanner;
import java.lang.Math;

public class SumasDeRiemann {

    /**
     * Método para aproximar la integral de orden n = 1000
     * @param a
     * @param b
     * @return la sumatoria total
     */
    public static double aproximarIntegral(double a, double b){
        double temporal, aumentoCi, sumatoria;
        sumatoria = 0;
        
        /*Como se toma el extremo izquierdo como punto muestra, empiezo el contador en 0 para que el aumento Ci principie en el límite
        inferior "a" y le pongo un final en 999 para que no alcance el límite superior "b"*/ 
        for(int i=0; i<=999; i++){

            aumentoCi = (a + i*((b-a)/1000));
            temporal = Math.exp(Math.exp(aumentoCi));
            sumatoria += temporal;

        }

        //Al final se multiplica por la partición regular((b-a)/n) que se puede sacar de la sumatoria como constante
        sumatoria *= ((b-a)/1000);
        return sumatoria;
        
    }
    

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Ingresa el valor del límite inferior(a)");
        double a = Integer.valueOf(scan.nextLine());
        System.out.println("Ingresa el valor del límite superior(b)");
        double b = Integer.valueOf(scan.nextLine());


        resultado = aproximarIntegral(a,b);
        System.out.println(resultado);

    }
}
