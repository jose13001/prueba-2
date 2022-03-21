/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2prueba_2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author josec
 */
public class P2prueba_2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        ITunes it=  new ITunes();
        
        
        int opcion=0;
        do{
            System.out.println("\nMenu\n---------");
            System.out.println("1-addSong");
            System.out.println("2-reviewsSong");
            System.out.println("3-downloadSong");
            System.out.println("4-Songs");
            System.out.println("5-infoSong");
            System.out.println("6-salir");
           
            
            try{
                opcion=lea.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("***add song***");
                        System.out.println("ingrese el nombre de la cancion: ");
                        String nombre = lea.next();
                        System.out.println("ingrese al cantante: ");
                        String cantante =lea.next();
                        System.out.println("ingrese el precio: ");
                        double precio =lea.nextDouble();
                        it.addSong(nombre, cantante, precio);
                        break;
                    case 2:
                        System.out.println("***Review Song");
                        System.out.println("Ingrese el codigo de la cancion: ");
                        int codigo=lea.nextInt();
                        System.out.println("cuantas estrellas desea dar: ");
                        int estrellas=lea.nextInt();
                        it.reviewSong(codigo, estrellas);
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    case 5:
                        System.out.println("ingrese el codigo: ");
                        int cod=lea.nextInt();
                        it.infoSong(cod);
                        break;
                   
                        
                }
            }catch(IOException e){
                
            }
        }while(opcion!=6);
    
        
        
        
        
        
    }
    
}
