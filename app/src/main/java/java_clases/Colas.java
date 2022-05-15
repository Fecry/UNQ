/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases;

/**
 *
 * @author julia
 */
public class Colas <T>{
    Nodo<T> first;
    Nodo<T> last;
    Integer count;
    public Colas(){
        this.makeEmpty();
    }
    public Colas(T[] arr){
        this.makeEmpty();
        for(int i=0; i<arr.length;i++){
            this.enqueue(arr[i]);
        }
    }    
    void makeEmpty(){
        this.first=null;
        this.last=null;
        this.count=0;
    }      
    public void enqueue(T i){
        Nodo<T> nuevoNodo= new Nodo<T>(i);
        if(count==0)this.last=this.first=nuevoNodo;
        this.last.siguiente= nuevoNodo;
        this.last=nuevoNodo;
        count++;
    }    
    public T poll(){
        if(count!=0){
            T a= this.first.getData();
            this.first=this.first.siguiente;
            count--;
            return a;
        }
        System.out.println("cola vacia");
        return null;
        
    }
    public T peek(){
        if(count!=0)return this.first.getData();
        System.out.println("pila vacia");
        return null;
    }    
    public Nodo<T> dequeue(){
        if(count!=0){
            Nodo<T> remove=this.first;
            this.first=this.first.siguiente;
            count--;
            return remove;
        }
        System.out.println("pila vacia");
        return null;
    }

    public void tiempo(){
        double t =this.count*10;
        if(t>59){
            System.out.println("Tiempo estimado: "+(t/60)+" min");
        }
        else if (t>3599){
            System.out.println("Tiempo estimado: "+(t/3600)+" h");
        }
        else{
            System.out.println("Tiempo estimado: "+t+" s");
        }

    }
}
