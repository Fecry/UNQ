package java_clases.Estructuras;

import android.os.Parcel;
import android.os.Parcelable;

public class Colas <T>{
    Nodo<T> first;
    Nodo<T> last;
    Integer count;
    String nombre;

    public Colas(String nombre) {

        this.first = null;
        this.last = null;
        this.count = 0;
        this.nombre = nombre;
    }

    public Colas(T[] arr) {
        this.makeEmpty();
        for (int i = 0; i < arr.length; i++) {
            this.enqueue(arr[i]);
        }

    }

    void makeEmpty() {
        this.first = null;
        this.last = null;
        this.count = 0;
    }

    public void enqueue(T i) {
        Nodo<T> nuevoNodo = new Nodo<T>(i);
        if (count == 0) this.last = this.first = nuevoNodo;
        this.last.siguiente = nuevoNodo;
        this.last = nuevoNodo;
        this.count++;
        System.out.println(this.count);
    }

    public int getCount() {
        return this.count;
    }

    public T poll() {
        if (count != 0) {
            T a = this.first.getData();
            this.first = this.first.siguiente;
            count--;
            return a;
        }
        System.out.println("cola vacia");
        return null;

    }

    public T peek() {
        if (count != 0) return this.first.getData();
        System.out.println("pila vacia");
        return null;
    }

    public Nodo<T> dequeue() {
        if (count != 0) {
            Nodo<T> remove = this.first;
            this.first = this.first.siguiente;
            count--;
            return remove;
        }
        System.out.println("pila vacia");
        return null;
    }

    public String tiempo() {
        int t = this.count * 300;
        if (t > 59) {
            String ti = String.valueOf(t / 60) + " min";
            return ti;

        } else if (t > 3599) {
            String ti = String.valueOf(t / 3600) + " h";
            return ti;
        } else {
            String ti = String.valueOf(t) + " s";
            return ti;
        }

    }
}
