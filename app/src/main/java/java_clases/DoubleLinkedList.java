package java_clases;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author julia
 */
public class DoubleLinkedList <T>{
    Nodo<T> first;
    Nodo<T> last;
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
