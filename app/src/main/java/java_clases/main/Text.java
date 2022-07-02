package java_clases.main;

import android.content.Context;

import java_clases.Estructuras.DynamicArray;
import java.io.*;
import java.util.Scanner;

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

    public void populateDB(DynamicArray<Usuario> a, Context context) {
          try {
            Scanner myReader = new Scanner(new InputStreamReader(context.openFileInput("BasedeDatos.txt")));

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
    
    public void writeDB(DynamicArray<Usuario> DB, Context context){
        String id;
        String contrasena;
        for(int i =0; i < DB.size(); i++){

            id=DB.get(i).getId();
            contrasena=DB.get(i).getContrasena();

            writeFile(id, context);
            writeFile(contrasena, context);

        }

    }
    
    public void writeFile(String s, Context context){
		try {
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(context.openFileOutput("BasedeDatos.txt", Context.MODE_PRIVATE)));
            writer.write(s);
            writer.println();
            writer.flush();
			writer.close();
		} catch (IOException e) {
		}
    }


    
}

