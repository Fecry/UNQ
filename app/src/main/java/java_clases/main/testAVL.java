/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad_nacional_de_colombia.proyecto_estructuras;

/**
 *
 * @author user
 */
public class testAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
       
	{
		AVLTree tree = new AVLTree();
                 Text_1 pruebaAVL = new Text_1();
    	        pruebaAVL.writeFile ("TEST DE COMPLEJIDAD PARA ARBOL AVL");
                pruebaAVL.writeFile("------------------------------------------------------------");
                pruebaAVL.writeFile(" TEST PARA INSERCION DE DATOS ");          
                long i,k,x,h=0;
                for (k=8000; k<8000001; k=k*10){
                long startTime = System.currentTimeMillis();
              
                for ( i = 0; i <k; i++){
                
                 
                tree.root = tree.insert(tree.root,i);
              
                
     }
     long endTime = (System.currentTimeMillis()- startTime);
       h= tree.height(tree.root);
    //imprime tiempo transcurrido en ms
    System.out.println("Duración " + endTime + " milisegundos. para insertar: "+ i + " datos.");
    System.out.println("Altura del arbol para: "+ i + " datos =  " + h +".");
    
       
       pruebaAVL.writeFile("Duración " + endTime + " milisegundos. para insertar: "+i+"datos.");
        pruebaAVL.writeFile("Altura del arbol para: "+ i + " datos =  " +h+".");
     

		
		//System.out.println("Preorder traversal" +" of constructed tree is : ");
                
		//tree.preOrder(tree.root);
            } 
   pruebaAVL.writeFile("------------------------------------------------------------");
   pruebaAVL.writeFile(" TEST PARA BORRADO DE DATOS ");
    
  for (k=8000; k<8000001; k=k*10){
                long startTime = System.currentTimeMillis();
              
                for ( i = 0; i <k; i++){
                
                 
                tree.root = tree.deleteNode(tree.root,i);
                h= tree.height(tree.root);
                
     }
     long endTime = (System.currentTimeMillis()- startTime);
     
    //imprime tiempo transcurrido en ms
    System.out.println("Duración " + endTime + " milisegundos. para borrar: "+ i + " datos.");
        
       pruebaAVL.writeFile("Duración " + endTime + " milisegundos. para borrar: "+i+"datos.");
         
              
        }
 } // TODO code application logic here
    }
    
