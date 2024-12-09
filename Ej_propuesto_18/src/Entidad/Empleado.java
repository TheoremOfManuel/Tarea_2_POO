package Entidad;
import java.util.Scanner;
public class Empleado {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    //atributos 
    private String id;
    private String nombres;
    private double horas;
    private double valorHora;
    private double porcRetencion;
    private double salarioBruto;
    private double salarioNeto;
    //constructorores
    public Empleado(){}
    public Empleado(String id, String nombres, double horas, double valorHora, double porcRetencion, double salarioBruto, double salarioNeto) {
        this.id = id;
        this.nombres = nombres;
        this.horas = horas;
        this.valorHora = valorHora;
        this.porcRetencion = porcRetencion;
        this.salarioBruto = salarioBruto;
        this.salarioNeto = salarioNeto;
     }
    //getters y setters
    public String getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }
    public double getHoras() {
        return horas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public double getPorcRetencion() {
        return porcRetencion;
    }
    public double getSalarioBruto() {
        return salarioBruto;
    }
    public double getSalarioNeto() {
        return salarioNeto;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public void setPorcRetencion(double porcRetencion) {
        this.porcRetencion = porcRetencion;
    }
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
    //función para instanciar objetos de clase Empleado
    public Empleado crearEmpleado(){
       Empleado empleado1 = new Empleado();
       System.out.println("---- Ingrese su respectiva información ----");
        System.out.print("Código: ");
        String id = input.next();
        empleado1.setId(id);
        System.out.print("Nombre completo: ");
        String nombres = input.next();
        empleado1.setNombres(nombres);
        System.out.print("Horas mensuales trabajadas: ");
        double horas = input.nextDouble();
        empleado1.setHoras(horas);
        System.out.print("Valor de cada hora: ");
        double valorHora = input.nextDouble();
        empleado1.setValorHora(valorHora);
        System.out.print("Porcentaje de la reteción de fuente: ");
        double porcRetencion = input.nextDouble();
        empleado1.setPorcRetencion(porcRetencion);
        
        double salarioBruto = empleado1.getHoras() * empleado1.getValorHora();
        empleado1.setSalarioBruto(salarioBruto);
        double salarioNeto = empleado1.getSalarioBruto() - 
                (empleado1.getSalarioBruto()*empleado1.getPorcRetencion()/100);
        empleado1.setSalarioNeto(salarioNeto);
        return empleado1;
    }
    //funcion para retornar información 
    public static void MostrarInformacion(Empleado empleado){
        System.out.println("");
        System.out.println("---- INFORMACIÓN EMPLEADO ----");
        System.out.println("Código empleado: " + empleado.getId());
        System.out.println("Nombre: " + empleado.getNombres());
        System.out.println("Salario Bruto: " + empleado.getSalarioBruto());
        System.out.println("Salario Neto: " + empleado.getSalarioNeto());  
}

}
