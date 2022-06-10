package java_clases.Estructuras;


public class Nodo<T> {
    T data;
    Nodo<T> siguiente;
    Nodo<T> anterior;
    public Nodo(T i){
        this.data=i;
        this.siguiente=null;
        this.anterior=null;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior) {
        this.anterior = anterior;
    }
    
}
