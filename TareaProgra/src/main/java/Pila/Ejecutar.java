package Pila;

public class Ejecutar {
    public static void main (String[] args){
        Pila p = new Pila();
        p.IngresarNodo();
        p.IngresarNodo();
        p.IngresarNodo();
        p.IngresarNodo();
        p.IngresarNodo();
        System.out.println("La Pila Ingresada es:");
        p.desplegarPila();
        p.BuscarNodo();
        p.EliminarNodo();
        p.desplegarPila();

    }
}
