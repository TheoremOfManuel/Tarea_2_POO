
package ej_propuesto_18;
import Entidad.Empleado;
import static Entidad.Empleado.MostrarInformacion;


public class Ej_propuesto_18 {
    public static void main(String[] args) { 

    Empleado e1 = new Empleado();
    e1 = e1.crearEmpleado();
    MostrarInformacion(e1);
    } 
}
