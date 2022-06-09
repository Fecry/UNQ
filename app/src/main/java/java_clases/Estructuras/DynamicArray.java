/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases.Estructuras;

import java_clases.main.Usuario;

/**
 *
 * @author julia
 */
@SuppressWarnings("unchecked")
public class DynamicArray<T> {

    T[] arr;
    private int size;
    private int capacity;
    private final int FACTOR_RESIZE = 2;

    public DynamicArray() {
        arr = (T[]) new Object[this.FACTOR_RESIZE];
        size = 0;
        capacity = this.FACTOR_RESIZE;

    }

    public int size() {
        return size;
    }

    public T get(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Indice invalido: " + i);
        }
        return arr[i];
    }

    public void set(int i, T data) {
        if (i < size) {
            this.arr[i] = data;
        } else {
            throw new IndexOutOfBoundsException("Indice invalido: " + i);
        }
    }

    public void pushBack(T data) {
        if (size == capacity) {
            T[] aux = (T[]) new Object[capacity * FACTOR_RESIZE];
            for (int i = 0; i < arr.length; i++) {
                aux[i] = (T) arr[i];
            }
            this.arr = aux;
            this.capacity *= FACTOR_RESIZE;
        }
        arr[size++] = data;
    }

    public void clear() {
    
        this.arr=null;
    }

    public void remove(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Indice invalido:" + i);
        }

        T[] aux = (T[]) new Object[capacity];
        int cont = 0;
        for (int j = 0; j < arr.length; j++) {
            if (cont != i) {
                aux[cont] = (T) arr[j];
                cont++;
            }
        }
        this.arr = aux;
        this.size--;
    }

    public void removeLast() {
        remove(size - 1);
    }

    public void print() {
        System.out.print("[");
        
        for (int i = 0; i < this.size-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        
        System.out.print(arr[this.size]);
        System.out.print("]");

    }

    public void printDB(DynamicArray<Usuario> a) {
        System.out.print("[");
        
        for (int i = 0; i < this.size-1; i++) {
            System.out.print("[" +a.get(i).getId()+" "+a.get(i).getContrasena() +"]"+ ", ");
        }
        
        System.out.print("[" +a.get(this.size-1).getId()+" "+a.get(this.size-1).getContrasena() +"]");
        System.out.print("]");

    }

    public boolean isOriginal(Usuario temp, DynamicArray<Usuario> a) {
        for(int i=0; i<a.size;i++){
            
            if(temp.getId().equals(a.get(i).getId())){
                return false;
            }
        }
        return true;
        
    }
    
    public boolean registro(Usuario temp, DynamicArray<Usuario> a) {
        for(int i=0; i<a.size;i++){
            
            if(temp.getId().equals(a.get(i).getId()) &&temp.getContrasena().equals(a.get(i).getContrasena())){
                return true;
            }
        }
        return false;
        
    }
}
