
package Entidad;

import java.util.Scanner;

public class Empleado {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    //atributos
    private String nombre; 
    private double salario;
    private int horas;
    
    //constructores

    public Empleado() {
    }

    public Empleado(String nombre, double salario, int horas) {
        this.nombre = nombre;
        this.salario = salario;
        this.horas = horas;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getHoras() {
        return horas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    // funcion para instanciar empleado y mostrar info
    public Empleado Crearempleado(){
        Empleado em1 = new Empleado();
        System.out.println("--- INGRESE LA INFORMACION");
        System.out.print("Nombre completo: ");
        em1.nombre = input.next();
        System.out.print("Salario básico por hora: ");
        em1.salario = input.nextDouble();
        System.out.print("Número de horas trabajadas en el mes: ");
        em1.horas = input.nextInt();
        
        return em1;
    }
    
    public static void MostrarEmpleado(Empleado em1){
        System.out.println("");
        System.out.println(" --- INFORMACION ---");
        if(em1.salario > 450000){
            System.out.println("NOMBRE: " + em1.nombre);
            System.out.println("SALARIO MENSUAL: " + (em1.salario *em1.horas));
        } else{
            System.out.println("NOMBRE: " + em1.nombre);
        }
    }
    
    
    
    
    
    
}
