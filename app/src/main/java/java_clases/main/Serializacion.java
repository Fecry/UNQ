package java_clases.main;

import android.content.Context;

import com.example.unq.MainActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java_clases.Estructuras.DynamicArray;

public class Serializacion {
    String fileName = "usuarios.ser";
    DynamicArray<Usuario> usuarios = MainActivity.BdD;
    public void deserializar(Context context){
        try{
            FileInputStream file = context.openFileInput(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            usuarios = (DynamicArray<Usuario>) in.readObject();
        }catch (IOException e){
            System.out.println("Hubo un error al leer el archivo");
        }catch (ClassNotFoundException e){
            System.out.println("Hubo un error al leer el objeto");
        }
    }
    public void serializar(Context context){
        try{
            FileOutputStream file = context.openFileOutput(fileName, Context.MODE_PRIVATE);
            ObjectOutputStream outputStream = new ObjectOutputStream(file);
            outputStream.writeObject(usuarios);
            file.getFD().sync();
            outputStream.close();
            file.close();
        }catch (IOException e){
            System.out.println("Ocurrió un error");
        }
    }
}
