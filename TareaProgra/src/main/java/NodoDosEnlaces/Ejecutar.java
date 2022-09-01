package NodoDosEnlaces;

public class Ejecutar {
    public static void main (String[] args){
        Lista l = new Lista();
        l.insertarNodo();
        l.insertarNodo();
        l.insertarNodo();
        l.insertarNodo();

        l.DesplegarListaPU();
        l.DesplegarListaUP();
        l.BuscarNodo();
        l.BorrarNodo();
        l.DesplegarListaPU();

    }
}
