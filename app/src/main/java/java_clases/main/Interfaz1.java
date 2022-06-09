/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import estructuras.Colas;
import estructuras.DynamicArray;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class Interfaz1 {
    public static void interfaz1(DynamicArray<Usuario> BdD){
        //do {
        //Inicializamos las colas
        Colas<Integer> central= new Colas<>();
        Colas<Integer> biologia = new Colas<>();
        Colas<Integer> yuTakeuchi = new Colas<>();
        Colas<Integer> medicina = new Colas<>();
        Colas<Integer> agronomia = new Colas<>();
        Colas<Integer> hemeroteca = new Colas<>();
        Colas<Integer> economia = new Colas<>(); 

            try {
                int opcion;
                int opcion2;
                int opcion3;

                String doc="";
                String ctr="";
                String ctrC="";
                boolean seguir=false;

            
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingresar\n\n"
                        + "1. Registrarse\n"
                        + "2. Ingresar\n"
                        + "3. Salir\n"));
                switch (opcion) {
                            case 1:
                                doc=JOptionPane.showInputDialog(null,"Ingrese su documento de identidad");
                                ctr=JOptionPane.showInputDialog(null, "Ingresa tu contraseña");
                                ctrC=JOptionPane.showInputDialog(null, "Confirme tu contraseña");
                                
                                if (ctr.equals(ctrC)){
                                    Usuario temp = new Usuario(doc, ctr);
                                    
                                    if(BdD.isOriginal(temp, BdD)==true){
                                        BdD.pushBack(temp);
                                        //Usuario us1= temp;
                                        JOptionPane.showMessageDialog(null, "Usuario Creado");
                                        seguir=true;
                                        break;
                                    }

                                    else{JOptionPane.showMessageDialog(null, "Usuario ya Existe");
                                    break;}      
                                }
                                
                                else {JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                                break;}
                                
                            case 2:
                                doc=JOptionPane.showInputDialog(null, "Ingresa tu número de documento");
                                ctr=JOptionPane.showInputDialog(null, "Ingresa tu contraseña");
                                Usuario us1 = new Usuario(doc,ctr);
                                if(BdD.registro(us1,BdD)){
                                    JOptionPane.showMessageDialog(null, "Ingresado con Exito");
                                    seguir=true;
                                    break;
                                }
                                else{JOptionPane.showMessageDialog(null, "Usuario o Contraseña son incorrectos");
                                    
                                    break;    
                                }
                            case 3:
                                break;
                            default:
                                if (opcion!=2)
                                JOptionPane.showMessageDialog(null, "Opción no dispobible.");
                                    break;
                        }
                Usuario us1 = new Usuario("","");
                
                    
                    if(seguir){
                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Menú de Opciones\n\n"
                                + "1. Pedir Turno\n"
                                + "2. Salir\n"));
                        if (opcion2==1) {

                            opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Menú de Opciones\n\n"
                                    + "1. central\n"
                                    + "2. Biología\n"
                                    + "3. Yu Takeuchi\n"
                                    + "4. Medicina\n "
                                    + "5. Agronomía\n"
                                    + "6. Hemeroteca\n"
                                    + "7. Economía\n"));
                            switch (opcion3) {
                                case 1:
                                    central.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería Central");
                                    JOptionPane.showMessageDialog(null, central.tiempo());
                                    break;
                                case 2:
                                    biologia.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en biología");
                                    JOptionPane.showMessageDialog(null, biologia.tiempo());
                                    break;
                                case 3:
                                    yuTakeuchi.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería Yu Takeuchi");
                                    //JOptionPane.showMessageDialog(null, yuTakeuchi.tiempo());
                                    break;
                                case 4:
                                    medicina.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en medicina\n\n"
                                    + medicina.tiempo()+"\n");

                                    break;
                                case 5: 
                                    agronomia.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en agronomía");
                                    JOptionPane.showMessageDialog(null, agronomia.tiempo());

                                    break;
                                case 6:
                                    hemeroteca.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en la hemeroteca");
                                    JOptionPane.showMessageDialog(null, hemeroteca.tiempo());

                                    break;
                                case 7:
                                    economia.enqueue(Integer.parseInt(us1.getId()));
                                    JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en economía");
                                    JOptionPane.showMessageDialog(null, economia.tiempo());

                                    break;

                                default:
                                    if (opcion!=2)
                                        JOptionPane.showMessageDialog(null, "Opción no dispobible.");

                                        break;
                                }
                        } else {
                            opcion2=7;
                        }
                
                    }
                    } catch (NumberFormatException e) {
                    }

        //} while (opcion != 7);
    }
    public Interfaz1(DynamicArray<Usuario> a) {
        interfaz1(a);
    }
}

