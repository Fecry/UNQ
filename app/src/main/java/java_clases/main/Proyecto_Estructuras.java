package java_clases.main;

import java_clases.Estructuras.Pilas;
import java_clases.Estructuras.DynamicArray;

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
        

/***
        new Interfaz1(BdD);
        BdD.printDB(BdD);
        xd.writeDB(BdD);
   */

         
       //xd.read();


    }
}