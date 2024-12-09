
package ej_resuelto_10;
import java.util.Scanner;
public class Ej_resuelto_10 {
    public static void main(String[] args) {
     /*
        INICIO
                LEA: NI, NOM, PAT, ES

                 PAGMAT = 50000
                 SI (PAT > 2000000) ∧ (ES > 3) ENTONCES
                            PAGMAT = PAGMAT + 0.03 * PAT
                   FIN_SI
                ESCRIBA: “EL ESTUDIANTE CON NUMERO DE INSCRIPCION”, NI,
                “Y NOMBRE”, NOM, “DEBE PAGAR: $”, PAGMAT
          FIN_INICIO
        */
     Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Codigo: ");
     String NI = input.next();
        System.out.print("Nombre: ");
     String NOM = input.next();
     System.out.print("Patrimonio: ");
     double PAT = input.nextDouble();
     System.out.print("Estrato: ");
     byte EST = input.nextByte();
     double PAGMAT = 50000;
     
     if( PAT >2000000 && EST >3 ){
         PAGMAT = PAGMAT + 0.03*PAT;
     }
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + NI 
                 + " Y NOMBRE " + NOM +  "  DEBE PAGAR " + PAGMAT);
    }
    
}
