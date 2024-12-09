
package ej_propuesto_23;
import java.util.Scanner;
public class Ej_propuesto_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     double a,b,c,x1,x2,determinante;
        System.out.println(" Para resolver la ecuación de la forma a^2 + bx+c= 0, ingrese ");
        System.out.print("valor de a: ");
        a = input.nextDouble();
        System.out.print("valor de b: ");
         b = input.nextDouble();
        System.out.print("valor de c: ");
        c = input.nextDouble();
        determinante = Math.pow(b, 2)- 4*a*c;
        
        if(determinante == 0){
            x1 = -b /(2*a);
            x2 = x1;
            System.out.println("Hay 2 soluciones reales iguales x1 = " + x1 + " y x2 = "+ x2);
        } else if(determinante >0){
            x1 =( -b - Math.sqrt(determinante))/(2*a);
            x2 =( -b + Math.sqrt(determinante))/(2*a);
             System.out.println("Hay 2 soluciones reales diferentes x1 = " + x1 + " y x2 = "+ x2);
        } else{
            System.out.println("NO HAY SOLUCIONES REALES");
        } 
    }
}
