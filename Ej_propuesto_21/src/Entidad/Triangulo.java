
package Entidad;

import java.util.Scanner;
import java.util.logging.Logger;

public class Triangulo {
    Scanner input = new Scanner(System.in);
    //atribuos
    private double lado1;
    private double lado2;
    private double lado3;
    private double perimetro;
    private double semiPerimetro;
    private double area;
    
    //constructores

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3, double perimetro, double semiPerimetro, double area) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.perimetro = perimetro;
        this.semiPerimetro = semiPerimetro;
        this.area = area;
    }
    
    //getters y setters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getSemiPerimetro() {
        return semiPerimetro;
    }

    public double getArea() {
        return area;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void setSemiPerimetro(double semiPerimetro) {
        this.semiPerimetro = semiPerimetro;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public Triangulo CrearTriangulo(){
        Triangulo t = new Triangulo();
        System.out.print("Ingres lado 1: ");
        double l1 = input.nextDouble();
        System.out.print("Ingres lado 2: ");
        double l2 = input.nextDouble();
        System.out.print("Ingres lado 3: ");
        double l3 = input.nextDouble();
        t.lado1 = l1;
        t.lado2 = l2;
        t.lado3 = l3;
        CalcularPerimetro(t);
        CalcularSemiPerimetro(t);
        Area(t);
        return t;
    }
    
    public void CalcularPerimetro(Triangulo t){
        double p = t.lado1 + t.lado2 + t.lado3;
        t.perimetro = p;
    }
    
    public void CalcularSemiPerimetro(Triangulo t){
        double sp = (t.lado1 + t.lado2 + t.lado3)/2;
        t.semiPerimetro = sp;
    }
    
    public void Area(Triangulo t){
        double a = Math.sqrt(t.semiPerimetro*(t.semiPerimetro-t.lado1)*(t.semiPerimetro-t.lado2)*(t.semiPerimetro-t.lado3));
        t.area = a;
    }
    
    public static void MostrarInfo(Triangulo t){
        System.out.println("El tiengrulo de lados " + t.lado1 + ", " + t.lado2 + " y  " + t.lado3 + ", tiene un "
                + "perimetro de  "+ t.perimetro + " un semiperimetro de " + t.semiPerimetro + " y "
                        + "finalmente un area de " + t.area);
    }
    
}