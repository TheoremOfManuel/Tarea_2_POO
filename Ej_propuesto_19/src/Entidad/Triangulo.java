
package Entidad;
import java.util.Scanner;
public class Triangulo {
    Scanner input = new Scanner(System.in);
    //atributos 
    private double lado; 
    private double perimetro;
    private double altura;
    private double area; 
    //constructores
    public Triangulo() {
    }
    public Triangulo(double lado, double perimetro, double altura, double area) {
        this.lado = lado;
        this.perimetro = perimetro;
        this.altura = altura;
        this.area = area;
    }
    //getters y setters
    public double getLado() {
        return lado;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public double getAltura() {
        return altura;
    }
    public double getArea() {
        return area;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setArea(double area) {
        this.area = area;
    }   
    public Triangulo CrearTriangulo(){
        Triangulo t = new Triangulo();
        System.out.print("Ingrese el lado del triángulo equilatero: ");
        double lado = input.nextDouble();
        t.lado = lado;
        t.perimetro = 3*lado;
        t.altura = lado*(Math.sqrt(3)/2);
        t.area = (Math.pow(lado,2) * Math.sqrt(3)/4);
        return t;
    }   
    public static void MostrarTriangulo(Triangulo t){
        System.out.println("El triangulo de lado " + t.lado + " unidades tiene"
                + " una altura de " + t.altura + " unidades, un perímetro de " 
                + t.perimetro +" unidades y finalmente una área de " + t.area + 
                " unidades^2");
    }   
}
