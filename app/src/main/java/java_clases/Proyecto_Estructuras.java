package java_clases;

import java_clases.Pilas;
import java_clases.DynamicArray;

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
        

        
        //Usuario us1 = new Usuario("1568715678","admin58");
        //BdD.pushBack(us1);
        //System.out.println("[" +BdD.get(1).getId()+" "+BdD.get(1).getContrasena() +"]");
        //Interfaz1 a = new Interfaz1(BdD);
        BdD.printDB(BdD);
        xd.writeDB(BdD);
        

         
       //xd.read();


    }
}