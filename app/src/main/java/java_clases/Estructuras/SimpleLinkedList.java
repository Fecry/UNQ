/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases.Estructuras;

/**
 *
 * @author julia
 */
public class SimpleLinkedList<T>{
    private Nodo<T> head;
    private Nodo<T> tail;
    private Integer size;

    public Nodo<T> first() {
        return head;
    }

    public Nodo<T> last() {
        return tail;
    }

    public Integer getSize() {
        return size;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public SimpleLinkedList(){
        this.makeEmpty();
    }    
    
    public SimpleLinkedList(T[] Array){
        if(Array.length==0){
            System.err.println("Error, array vacio");
        }else{
            this.makeEmpty();
            for (T Array1 : Array) {
                this.InsertarFinal(Array1);
            }
        }
        
    }

    public void makeEmpty(){
        size = 0;
        head = null;
        tail = null;
    } 
    
    public void InsertarInicio(T insertar){
        Nodo<T> nuevoNodo = new Nodo<T>(insertar);
        nuevoNodo.siguiente = this.head;
        this.head = nuevoNodo;
        if(size == 0) this.tail = nuevoNodo;
        size++;
    }    
    
    public void BorrarInicio(){
        if(this.head == null){
            System.err.println("Error, lista vacia");
        }else{
            this.head = this.head.siguiente;
            this.size--;
            if(this.head == null)this.makeEmpty();
        }
    }
    
    public void InsertarFinal(T toInsert){
        Nodo<T> newNodo = new Nodo<>(toInsert);
        if(this.tail == null){
           this.InsertarInicio(toInsert);
        }else{
            this.tail.siguiente = newNodo;
            newNodo.anterior = this.tail;
            this.tail = newNodo;
            this.size++;
        }
    }
    
    public void BorrarFinal(){
        if(this.tail == null){
            System.err.println("Error, lista vacia");
        }else{
            this.tail = this.tail.anterior;
            this.tail.siguiente=null;
            this.size--;
            if(this.tail==null)this.makeEmpty();
        }
    }
    
    boolean checkarIndice(int k){
        return k < 0 || k > this.size;
    }
    
    public Integer findFirst(T data){   
        
        if(size==0){
            System.err.println("Error, lista vacia");
            return -1;
        }
        Nodo<T> aux = this.head;
        Integer index = 0;
        while(aux!= null){
            if(data.equals(aux.data)){
                return index;
            }
            index++;
            aux=aux.siguiente;
        }
        System.err.println("Elemento no encontrado");
        return -1;
    }
    
    public int[] findAll(T data){     
        
        if(size==0){
            System.err.println("Error, lista vacia");
            return null;
        }
        int[] indexes = new int[this.getSize()];
        int conteo = 0;        
        Nodo<T> aux = this.head;
        Integer index = 0;
        while(aux!= null){
            if(data.equals(aux.data)){
                //System.out.println(conteo);
                indexes[conteo]=index;
                conteo++;                
            }
            index++;
            aux=aux.siguiente;
        }
        
        if(conteo==0){
            System.err.println("Error, no coinciden elementos");
            return null;
        }
        int[] finalIndexes = new int[conteo];
        for(int i =0; i<conteo; i++){
            finalIndexes[i]=indexes[i];
        }
        return finalIndexes;
    }
    
    private Nodo<T> read(int k){
        if(k < 0 || k >= this.size){
            System.out.println("No es posible realizar la búsqueda");
            return null;
        }
        Nodo<T> aux = this.head;
        for(int i = 0; i < k; i++)
            aux = aux.siguiente;
        return aux;
    }   
    
    public T readData(int k) {
        try{
            return this.read(k).getData();        
        }catch(Exception e){
        }
        return null;
    }
    
    public void insertar(int k, T data){
        if(this.checkarIndice(k)){
            System.out.println("Error, indice invalido");
            return;
        }
        if(k == 0){
            this.InsertarInicio(data);
            return;
        }
        Nodo<T> nuevoNodo = new Nodo<>(data), aux = this.read(k-1);
        nuevoNodo.siguiente = aux.siguiente;
        aux.siguiente = nuevoNodo;
        this.size++;        
    }
    
    public void eliminar(int k){ //orden de big O ==>  O(N)
        if(this.checkarIndice(k)){
            System.out.println("Error, indice invalido");
            return;
        }
        if(k == 0){
            this.BorrarInicio();
            return;
        }
        Nodo<T> previo= this.read(k-1), posterior = this.read(k+1);
        previo.siguiente=posterior;
    }
    
    @Override
    public String toString(){
        StringBuilder strbldr = new StringBuilder();
        strbldr.append("[");
        Nodo<T> auxiliar = this.head;
        while(auxiliar != null){
            strbldr.append(auxiliar.getData());
            strbldr.append(", ");
            auxiliar=auxiliar.siguiente;
        }
        String retornar = strbldr.toString();
        retornar =  retornar.substring(0, strbldr.length() - 2);
        return retornar+"]";
        
    }
    
}
