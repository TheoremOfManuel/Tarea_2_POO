
package ej_resuelto_15;
import java.util.Scanner;
public class Ej_resuelto_15 {
    public static void main(String[] args) {
        //resolver este rpoblema mañana, hay que hacerlo con diccionarios(mapas aca)
        Scanner input =  new Scanner(System.in);
        double A, B,C,D;
        System.out.print("Peso esfera A: ");
        A = input.nextDouble();
        System.out.print("Peso esfera B: ");
        B = input.nextDouble();
        System.out.print("Peso esfera C: ");
        C = input.nextDouble();
        System.out.print("Peso esfera D: ");
        D = input.nextDouble();
        
        if(A == B && B == C){
            if(D > B){
                    System.out.println("LA ESFERA DIFERENTE ES LA D Y ES DE MAYOR PES");
            } else{
                    System.out.println("LA ESFERA DIFERENTE ES LA D Y ES DE MENOR PESO");
            }
        } else if( A == B && B ==D){
            if(C > B){
                    System.out.println("LA ESFERA DIFERENTE ES LA C Y ES DE MAYOR PESO");
            } else{
                    System.out.println("LA ESFERA DIFERENTE ES LA C Y ES DE MENOR PESO");
            }
        } else if(A == C && C == D){
            if(B>C){
                System.out.println("LA ESFERA DIFERENTE ES LA B Y ES DE MAYOR PESO");
            } else{
                System.out.println("LA ESFERA DIFERENTE ES LA B Y ES DE MENOR PESO");
            }
        } else{
            if(A>C){
                System.out.println("LA ESFERA DIFERENTE ES LA A Y ES DE MAYOR PESo");
            } else{
                System.out.println("LA ESFERA DIFERENTE ES LA A Y ES DE MENOR PESO");
            }
        }
        }
    }
    

