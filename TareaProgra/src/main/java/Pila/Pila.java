package Pila;

import java.util.Scanner;

public class Pila {
    Nodo primero;
    Scanner teclado = new Scanner(System.in);
    public Pila(){
        primero = null;
            }
            public void IngresarNodo(){
        Nodo nuevo = new Nodo();
        System.out.print("Ingrese el dato que contendra el nuevo nodo:");
        nuevo.dato= teclado.nextInt();
        nuevo.siguiente = primero;
        primero = nuevo;
        System.out.println("Nodo Ingresado Correctamente");
                    }

                    public void desplegarPila(){
        Nodo actual = new Nodo();
        actual= primero;
        if (primero!=null){
         while(actual!=null){
             System.out.println(" "+actual.dato);
             actual=actual.siguiente;
         }
        }else{
            System.out.println("la Pila se Encuentra Vacia");
        }
                    }

                    public void BuscarNodo(){
                        Nodo actual = new Nodo();
                        actual= primero;
                        boolean encontrado = false;
                        System.out.print("Ingrese el dato del nodo a buscar:");
                        int nodoBuscado = teclado.nextInt();
                        if (primero!=null){
                            while(actual!=null && encontrado!=true){
                                if(actual.dato ==nodoBuscado){
                                    System.out.println("Nodo con el dato "+nodoBuscado+" encontrado");
                                    encontrado = true;
                                }
                                actual=actual.siguiente;
                            }
                            if(!encontrado){
                                System.out.println("Nodo no encontrado");
                            }
                        }else{
                            System.out.println("la Pila se Encuentra Vacia");
                        }
                     }

                     public void EliminarNodo(){
                         Nodo actual = new Nodo();
                         actual= primero;
                         Nodo anterior = new Nodo();
                         anterior = null;
                         boolean encontrado = false;
                         System.out.print("Ingrese el dato del nodo a Eliminar:");
                         int nodoBuscado = teclado.nextInt();
                         if (primero!=null){
                             while(actual!=null && encontrado!=true){
                                 if(actual.dato ==nodoBuscado){
                                     if(actual==primero){
                                         primero = primero.siguiente;
                                     }else{
                                         anterior.siguiente= actual.siguiente;
                                     }
                                     System.out.println("Nodo con el dato "+nodoBuscado+" Eliminado");
                                     encontrado = true;
                                 }
                                 anterior = actual;
                                 actual=actual.siguiente;
                             }
                             if(!encontrado){
                                 System.out.println("Nodo no encontrado");
                             }
                         }else{
                             System.out.println("la Pila se Encuentra Vacia");
                         }
                     }

                    }
