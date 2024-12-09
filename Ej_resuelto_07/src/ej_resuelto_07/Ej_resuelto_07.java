
package ej_resuelto_07;
import java.util.Scanner;
public class Ej_resuelto_07 {
    public static void main(String[] args) {
        /*
        INICIO
        LEA: A, B
        SI A > B ENTONCES
                ESCRIBA: «A ES MAYOR QUE B»
                SINO
                SI A = B ENTONCES
                ESCRIBA: «A ES IGUAL A B»
                SINO
                ESCRIBA: «A ES MENOR QUE B»
            FIN_SI
          FIN_SI
FIN_INICIO
        */
        Scanner input = new Scanner(System.in);
        Double A,B;
        A = input.nextDouble();
        B = input.nextDouble();
        if(A > B){
            System.out.println("A ES MAYOR QUE B");
        } else if( A == B){
            System.out.println("A ES IGUAL A B");
        }else {
            System.out.println("A ES MENOR QUE B");
        }                                                                          
    }

}
