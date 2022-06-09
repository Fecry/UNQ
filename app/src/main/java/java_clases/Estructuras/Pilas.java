/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases.Estructuras;

/**
 *
 * @author julia
 */
public class Pilas<T>{
    Nodo<T> first;
    Integer count;
    
    public Pilas(){
        this.makeEmpty();
    }
    
    public Pilas(T[] arr){
        this.makeEmpty();
        for(int i=0; i<arr.length;i++){
            this.push(arr[i]);
        }
    }
    
    void makeEmpty(){ 
        this.first=null;
        this.count=0;
    }  
    
    public void push(T i){
        Nodo<T> nuevoNodo= new Nodo<T>(i);
        if(count==0)this.first=nuevoNodo;
        nuevoNodo.siguiente=this.first;
        this.first=nuevoNodo;
        count++;
    }
        
    public T peek(){
        if(count!=0)return this.first.getData();
        System.out.println("pila vacia");
        return null;
    }
    
    public Nodo<T> pop(){
        if(count!=0){
            Nodo<T> remove=this.first;
            this.first=this.first.siguiente;
            count--;
            return remove;
        }
        System.out.println("pila vacia");
        return null;
    }
    
    public T poll(){
        if(count!=0){
            T a= this.peek();
            this.pop();
            return a;
        }
        System.out.println("cola vacia");
        return null;
        
    }
    
    public void print(){
        int c = this.count;
        System.out.print("[");
        for(int i=0; i<c-1;i++){
            System.out.print(this.poll()+", ");
        }
        System.out.print(this.poll());
        System.out.print("]");
    }
}