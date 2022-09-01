package ArbolBinario;

public class Arbol {
    NodoArbol inicial;
    public Arbol(){
        this.inicial=null;
    }
    public void insertar (int valor){
        if(this.inicial==null){
            this.inicial= new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
    }
    public void dispararPreorden(){
     this.preorden(this.inicial);
    }
    public void preorden(NodoArbol nodo){
 if(nodo ==null){
     return;
 }else{
     System.out.print(nodo.getValor()+", ");
     preorden(nodo.getNodoIzqu());
     preorden(nodo.getNodoDerecho());
      }
    }
    public void dispararInOrden(){
        this.InOrden(inicial);
    }
    public void InOrden(NodoArbol nodo){
        if(nodo ==null){
            return;
        }else{
            InOrden(nodo.getNodoIzqu());
            System.out.print(nodo.getValor()+", ");
            InOrden(nodo.getNodoDerecho());

        }
    }
    public void dispararPostOrden(){
        this.postOrden(inicial);
    }
    public void postOrden(NodoArbol nodo){
        if(nodo ==null){
            return;
        }else{
            postOrden(nodo.getNodoIzqu());
            postOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+", ");

        }
    }

}
