package Cola;

public class Ejecutar {

        public static void main (String[] args){
            Cola c = new Cola();
            c.InsertarNodo();
            c.InsertarNodo();
            c.InsertarNodo();
            c.InsertarNodo();
            c.InsertarNodo();
            System.out.println("Cola Ingresada es:");
            c.desplegarCola();
            c.eliminarNodo();
            c.desplegarCola();

        }
}
