package ArbolBinario;

public class NodoArbol {
    int valor;
    NodoArbol nodoIzqu;
    NodoArbol nodoDerecho;
    public NodoArbol(int valor){
        valor = valor;
        nodoIzqu=null;
        nodoDerecho=null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoArbol getNodoIzqu() {
        return nodoIzqu;
    }
    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
    public void insertar (int valor){
        if(valor<this.valor){
            if(this.nodoIzqu==null){
                this.nodoIzqu = new NodoArbol(valor);

            }else{
                this.nodoIzqu.insertar(valor);
            }
        }else{
            if(this.nodoDerecho==null){
                this.nodoDerecho= new NodoArbol(valor);
            }else{
                this.nodoDerecho.insertar(valor);
            }

                            }
    }
}
