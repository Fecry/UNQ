/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases;

/**
 *
 * @author julia
 */
@SuppressWarnings("unchecked")
class DynamicArray<T> {
    T[] arr;
    int size;
    int capacity;
    final int FACTOR_RESIZE =2;
    public DynamicArray(){
        this.arr=(T[]) new Object[this.FACTOR_RESIZE];
        this.size=0;
        this.capacity=this.FACTOR_RESIZE;
        
    }
    
    public T get(int i){
        if(i<size)return this.arr[i];
        return null;
    }
    public void set(int i, T data){
        if(i<size)this.arr[i]=data;
        System.out.println("fuera de rango");
    }
    public void pushBack(T data){
         if(size == capacity){
            T[] aux = (T[]) new Object[capacity*FACTOR_RESIZE];
            for(int i = 0; i < arr.length; i++)
                aux[i] = (T) arr[i];
            this.arr = aux;
            this.capacity *= FACTOR_RESIZE;
        }//O(1)
        arr[size++] = data;
    }
    public void remove(int i){
        T[] aux = (T[]) new Object[capacity];
        int cont=0;
        for(int j = 0; j < arr.length; j++){
            if(cont !=i){
                aux[cont]= (T)arr[j];
                cont++;
            }            
        }
        this.arr=aux;
        this.size--;
    }

    public void print(){
        System.out.print("[");
        for(int i=0; i<this.size-1;i++){
            
            System.out.print(this.arr[i]+", ");
        }
        System.out.print(this.arr[this.size-1]);
        System.out.print("]");

    }
    
    
}

