
package ej_resuelto_14;
import java.util.Scanner;
public class Ej_resuelto_14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double VD1, VD2, VD3, SALAR, TOTVEN, PORVEN, SALAR1, SALAR2, SALAR3;
        System.out.print("VENTAD DPT 1: ");
        VD1 = input.nextDouble();
        System.out.print("VENTAS DPT 2:  ");
        VD2 = input.nextDouble();
        System.out.print("VENTAS DPT3:  ");
        VD3 = input.nextDouble();
        System.out.print("SALARIO: ");
        SALAR = input.nextDouble();
        TOTVEN = VD1 + VD2 + VD3; 
        PORVEN = 0.33*TOTVEN;
        
        if(VD1 > PORVEN){
            SALAR1 = SALAR + 0.2*SALAR;
        } else{
            SALAR1 = SALAR;
        }
        if(VD2 > PORVEN){
            SALAR2 = SALAR + 0.2*SALAR;
        }else{
            SALAR2 = SALAR;
        }
         if(VD3 > PORVEN){
            SALAR3 = SALAR + 0.2*SALAR;
        }else{
            SALAR3 = SALAR;
        }
         System.out.println("SALARIO VENDEDORES DEPTO. 1 " + SALAR1 
                 + " | SALARIO VENDEDORES DEPTO. 2" + SALAR2 
                 + " | SALARIO VENDEDORES DEPTO. 3" +  SALAR3);
    }
    
}
