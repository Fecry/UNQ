/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main;

import estructuras.Pilas;
import estructuras.DynamicArray;
/**
 *
 * @author julia
 */
public class Proyecto_Estructuras {

    public static void main(String[] args) {

        //menu
        Pilas<String> menu = new Pilas<>();

        //BasedeDatos
        DynamicArray<Usuario> BdD = new DynamicArray<>();

        //Llenar la base de Datos
        Text xd = new Text();
        xd.populateDB(BdD);

        //menu

        

        //se pone el menú
        menu.push("barquillo");
        menu.push("jugo de guanabana");
        menu.push("sopa de arroz");
        menu.push("carne en goulash");
        menu.push("arroz");
        menu.push("lenteja");
        //menu.print();
        

        
        new Interfaz1(BdD);
        BdD.printDB(BdD);
        xd.writeDB(BdD);
        

         
       //xd.read();


    }
}