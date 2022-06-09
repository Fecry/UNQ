
package main;

public class Usuario {
    private String id;
    private String contrasena;

    public Usuario(String id, String contrasena) {
        this.id = id;
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public void putId(String a){
        this.id=a;
    }
    
    public void putContrasena(String a){
        this.contrasena=a;
    }
    
    public void clear(){
        this.id=null;
        this.contrasena=null;
    }
}
