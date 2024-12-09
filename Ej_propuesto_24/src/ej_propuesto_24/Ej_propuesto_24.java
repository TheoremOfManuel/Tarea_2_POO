
package ej_propuesto_24;
import java.util.HashMap;
import java.util.Scanner;
public class Ej_propuesto_24 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double A,B,C, mayor;
        System.out.print("Peso esfera 1: ");
        A = input.nextDouble();
        System.out.print("Peso esfera 2: ");
        B = input.nextDouble();
        System.out.print("Peso esfera 3: ");
        C = input.nextDouble();
        HashMap<Double, String> esferas = new HashMap();
        esferas.put(A, "A");
        esferas.put(B, "B");
        esferas.put(C, "C");
        mayor = A;
        if(B > mayor ){
           mayor = B;
        } 
        if(C > mayor){
            mayor = C;
        }
        
        System.out.println("La esfera de mayor peso es la esfera: " + esferas.get(mayor));
    }
}
