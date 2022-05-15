/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java_clases;


/**
 *
 * @author julia
 */
public class Proyecto_Estructuras {

    public static void main(String[] args) {
        //menu
        Pilas<String> menu = new Pilas<String>();
         //Base de datos
        SimpleLinkedList<Integer> usuarios = new SimpleLinkedList<>();

        //Cafeterias
        DynamicArray<String> cafeterias = new DynamicArray<>();


        Integer[] prueba = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        //Colas de Cafeterias
        Colas<Integer> central= new Colas<>(prueba);
        Colas<Integer> biologia = new Colas<>();
        Colas<Integer> yuTakeuchi = new Colas<>();
        Colas<Integer> medicina = new Colas<>();
        Colas<Integer> agronomia = new Colas<>();
        Colas<Integer> hemeroteca = new Colas<>();
        Colas<Integer> economia = new Colas<>(); 

        
        
        central.tiempo();
        //se pone el menú
        menu.push("barquillo");
        menu.push("jugo de guanabana");
        menu.push("sopa de arroz");
        menu.push("carne en goulash");
        menu.push("arroz");
        menu.push("lenteja");
        menu.print();
        
        //PRUEBA DE ENCOLAR AL USUARIO
        Usuario us1 = new Usuario(123,"admin");

    }

        


       
    }

