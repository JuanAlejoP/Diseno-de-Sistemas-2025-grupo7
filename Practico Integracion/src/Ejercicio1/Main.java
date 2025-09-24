package Ejercicio1;
import Ejercicio1.figuras.*;
import Ejercicio1.figuras.elipses.*;
import Ejercicio1.figuras.poligonos.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 1 ---");
        // Crear puntos
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        Lado lado = new Lado();
        // Crear figuras básicas
        Triangulo t = new Triangulo();
        Cuadrado c = new Cuadrado();
        Circulo circ = new Circulo();
        // Crear figura compuesta
        FiguraCompuesta fc = new FiguraCompuesta();
        System.out.println("Figuras creadas: Triángulo, Cuadrado, Círculo, FiguraCompuesta");
        System.out.println("El diseño permite instanciar y relacionar figuras básicas y compuestas.");
    }
}

