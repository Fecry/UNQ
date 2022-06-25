package java_clases.Estructuras;

import java.io.*;
import java.util.Scanner;

public class Text_1 {
    
    
    public void write(String B){
        try {
      FileWriter myWriter = new FileWriter("PruebaAVL.txt");
      myWriter.write(B);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
    
    public void read(){

        try {
            FileReader fr = new FileReader("PruebaAVL.txt");
      
            int i;
        // Holds true till there is nothing to read
            while ((i = fr.read()) != -1)
 
            // Print all the content of a file
            System.out.print((char)i);

        }   catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public void writeFile(String s){
        BufferedWriter out = null;
		try {
			File file = new File("PruebaAVL.txt");
			out = new BufferedWriter(new FileWriter(file, true));
			//for (String s : list) {
				out.write(s);
				out.newLine();

			//}
			out.close();
		} catch (IOException e) {
		}
    }
}

