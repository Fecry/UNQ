/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_clases.main;

import java_clases.Estructuras.DynamicArray;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Text {
  private File file = new File("BasedeDatos.txt");
    
    public void write(String B){
        try {
      FileWriter myWriter = new FileWriter("BasedeDatos.txt");
      myWriter.write(B);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    public void populateDB(DynamicArray<Usuario> a) {
          try {
            Scanner myReader = new Scanner(file);
            
            while (myReader.hasNextLine()) {
              Usuario Us = new Usuario ("","");
              String id = myReader.nextLine();
              String contrasena = myReader.nextLine();

              Us.putId(id);
              Us.putContrasena(contrasena);
              a.pushBack(Us);
            }

            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
    
    public void clear(){
        try {
            PrintWriter writer = new PrintWriter(this.file);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void writeDB(DynamicArray<Usuario> DB){
        String id;
        String contrasena;
        clear();
        for(int i =0; i < DB.size(); i++){

            id=DB.get(i).getId();
            contrasena=DB.get(i).getContrasena();

            writeFile(id);
            writeFile(contrasena);

        }    

    }
    
    public void writeFile(String s){
        BufferedWriter out = null;
		try {
			
			out = new BufferedWriter(new FileWriter(this.file, true));
			//for (String s : list) {
				out.write(s);
				out.newLine();

			//}
			out.close();
		} catch (IOException e) {
		}
    }


    
}

