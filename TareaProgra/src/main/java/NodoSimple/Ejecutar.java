package NodoSimple;

public class Ejecutar {
    public static void main (String[] args){
     Lista l = new Lista();
        l.insertarNodo();
        l.insertarNodo();
        l.insertarNodo();
        l.insertarNodo();
        l.insertarNodo();

        System.out.println("Los Nodos Ingresados son");
        l.desplegarLista();
        l.eliminarNodo();
    }




}
