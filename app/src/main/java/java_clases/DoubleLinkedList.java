package java_clases;

public class DoubleLinkedList <T>{
    java_clases.Nodo<T> first;
    java_clases.Nodo<T> last;
    Integer count;
    public DoubleLinkedList(){
        makeEmpty();
    }
    public void makeEmpty(){
        this.count=0;
        this.first=this.last=null;
    }
    public void insertarInicio(T e){
        Nodo<T> begin = new Nodo<T>(e);
        begin.siguiente=this.first;
        this.first.anterior=begin;
        if(count==0){
            last=this.first;
        }
        this.first=begin;
        count++;
    }
}
