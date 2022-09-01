package NodoDosEnlaces;

import java.util.Scanner;

public class Lista {
    Scanner Teclado = new Scanner(System.in);
    Nodo primero;
    Nodo ultimo;

    public Lista() {
        primero = null;
        ultimo = null;
    }

    public void insertarNodo() {
        Nodo Nuevo = new Nodo();
        System.out.println("Ingrese el Dato que contendra el nuevo Nodo");
        Nuevo.dato = Teclado.nextInt();

        if(primero == null){
            primero = Nuevo;
            primero.siguiente = null;
            primero.anterior=null;
            ultimo = Nuevo;
        }else{
            ultimo.siguiente=Nuevo;
            Nuevo.siguiente = null;
            Nuevo.anterior= ultimo;
            ultimo = Nuevo;
        }
        System.out.println("Nodo Ingresado con Exito");


    }

    public void DesplegarListaPU(){
        Nodo Actual = new Nodo();
        Actual = primero;
        if(primero !=null){
            while(Actual!=null){
                System.out.println(" "+Actual.dato);
                Actual = Actual.siguiente;

            }
        }else{
            System.out.println("La lista se encuentra vacia");
        }

    }
    public void DesplegarListaUP(){
        Nodo Actual = new Nodo();
        Actual = ultimo;
        if(ultimo!= null){
            while (Actual!=null){
                System.out.println(" "+Actual.dato);
                Actual = Actual.anterior;
            }

        }else{
            System.out.println("La lista se encuentra vacia");
        }

    }
    public void BuscarNodo(){
        Nodo Actual = new Nodo();
        Actual = primero;
        boolean encontrado = false;
        System.out.println("Ingrese el dato del nodo a buscar: ");
        int nodoBuscar = Teclado.nextInt();

        if(primero!=null){
            while(Actual != null && encontrado !=true){
                if(Actual.dato==nodoBuscar){
                    System.out.println("Nodo con el dato ("+nodoBuscar+")encontrado");
                    encontrado = true;

                }
                Actual = Actual.siguiente;

            }
            if(!encontrado){
                System.out.println("Nodo no Encontrado");


            }else{
                System.out.println("Lista se Encuentra Vacia");

            }
        }

    }
    public void BorrarNodo(){
        Nodo Actual = new Nodo();
        Actual = primero;
        Nodo Anterior = new Nodo();
        Anterior = null;
        boolean encontrado = false;
        System.out.println("Ingrese el dato del nodo a buscar para eliminar: ");
        int nodoBuscar = Teclado.nextInt();

        if(primero!=null){
            while(Actual != null && encontrado !=true){
                if(Actual.dato==nodoBuscar){
                    System.out.println("Nodo con el dato ("+nodoBuscar+")encontrado");

                        if(Actual==primero){
                            primero = primero.siguiente;
                            primero.anterior = null;
                        }else if(Actual == ultimo){
                            Anterior.siguiente=null;
                            ultimo=Anterior;
                        }else{
                            Anterior.siguiente = Actual.siguiente;
                            Actual.siguiente.anterior = Anterior;
                        }
                        System.out.println("Nodo Eliminado con Exito");
                    encontrado = true;
                }
                Anterior= Actual;
                Actual = Actual.siguiente;
            }
            if(!encontrado){
                System.out.println("Nodo no Encontrado");
            }
        }
    }
}