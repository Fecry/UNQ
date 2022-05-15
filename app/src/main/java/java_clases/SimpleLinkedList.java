/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases;

/**
 *
 * @author julia
 */
public class SimpleLinkedList<T>{
    Nodo<T> first;
    Nodo<T> last;
    Integer count;

    public Nodo<T> Head() {
        return first;
    }

    public Nodo<T> Tail() {
        return last;
    }

    public Integer getCount() {
        return count;
    }
    
    public boolean IsEmpty(){
        return count==0;
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
        this.count=0;
        this.first=null;
        this.last=null;
    } 
    
    public void InsertarInicio(T insertar){
        Nodo<T> nuevoNodo = new Nodo<T>(insertar);
        nuevoNodo.siguiente= this.first;
        this.first= nuevoNodo;
        if(count==0) this.last=nuevoNodo;
        count++;
    }    
    
    public void BorrarInicio(){
        if(this.first==null){
            System.err.println("Error, lista vacia");
        }else{
            this.first=this.first.siguiente;
            this.count--;
            if(this.first==null)this.makeEmpty();
        }
    }
    
    public void InsertarFinal(T toInsert){
        Nodo<T> newNodo = new Nodo<>(toInsert);
        if(this.last==null){
           this.InsertarInicio(toInsert);
        }else{
            this.last.siguiente = newNodo;
            newNodo.anterior = this.last;
            this.last = newNodo;
            this.count++;
        }
    }
    
    public void BorrarFinal(){
        if(this.last==null){
            System.err.println("Error, lista vacia");
        }else{
            this.last=this.last.anterior;
            this.last.siguiente=null;
            this.count--;
            if(this.last==null)this.makeEmpty();
        }
    }
    
    boolean checkarIndice(int k){
        return k < 0 || k > this.count;
    }
    
    public Integer findFirst(T data){   
        
        if(count==0){
            System.err.println("Error, lista vacia");
            return -1;
        }
        Nodo<T> aux = this.first;
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
        
        if(count==0){
            System.err.println("Error, lista vacia");
            return null;
        }
        int[] indexes = new int[this.getCount()];
        int conteo = 0;        
        Nodo<T> aux = this.first;
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
        if(k < 0 || k >= this.count){
            System.out.println("No es posible realizar la búsqueda");
            return null;
        }
        Nodo<T> aux = this.first;
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
        this.count++;        
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
        Nodo<T> auxiliar = this.first;
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
