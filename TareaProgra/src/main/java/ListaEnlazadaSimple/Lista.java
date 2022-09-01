package ListaEnlazadaSimple;
import NodoSimple.Nodo;

import java.util.Scanner;

public class Lista {
    NodoSimple.Nodo primero = new NodoSimple.Nodo();
    NodoSimple.Nodo ultimo = new NodoSimple.Nodo();
Scanner teclado= new Scanner(System.in);
    public Lista(){
 primero = null;
 ultimo = null;
    }
    public void insertarNodo(){
        NodoSimple.Nodo nuevo = new NodoSimple.Nodo();
        System.out.print("Ingrese el dato para el nuevo nodo: ");
nuevo.dato = teclado.nextInt();
if (primero==null){
    primero = nuevo;
    primero.siguiente = null;
    ultimo = nuevo;
    }else{
    ultimo.siguiente = nuevo;
    nuevo.siguiente = null;
    ultimo = nuevo;
        }
System.out.println("Nodo Ingresado");
    }
    public void desplegarLista(){
        NodoSimple.Nodo actual = new NodoSimple.Nodo();
        actual = primero;
        if (primero!= null){
        while (actual !=null){
            System.out.println(""+actual.dato);
            actual = actual.siguiente;
        }
        }else{
            System.out.println("La Lista se encuentra vacia");
        }
    }
    public void eliminarNodo(){
        NodoSimple.Nodo actual = new NodoSimple.Nodo();
        NodoSimple.Nodo anterior = new Nodo();
        anterior  = null;

        actual = primero;
        boolean encontrado = false;
        System.out.print("Ingrese el dato del Nodo a Eliminar: ");
        int NodoBuscado = teclado.nextInt();
        if(primero!= null){
            while (actual !=null && encontrado !=true){
                if(actual.dato == NodoBuscado){
                    if(actual==primero){
                      primero = primero.siguiente;
                    }else if(actual == ultimo){
                        anterior.siguiente=null;
                        ultimo=anterior;
                    }else{
                    anterior.siguiente = actual.siguiente;
                    }

                    System.out.println("Nodo Eliminado");
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.siguiente;
            }
            if(!encontrado){
                System.out.println("Nodo no encontrado");
            }
        }
    }
}
