/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2prueba_2;

import java.io.File;
import java.io.IOException;
import java .io.RandomAccessFile;

/**
 *
 * @author josec
 */
public class ITunes {
    File playlist;
    RandomAccessFile codigos;
    RandomAccessFile songs;
    RandomAccessFile Downloads;
    
    public ITunes()throws IOException{
        playlist=new File("Mis canciones");
        playlist.mkdir();
        
        codigos = new RandomAccessFile(playlist +"/codigos.itn","rw");
        songs = new RandomAccessFile(playlist+"/songs.itn","rw");
        Downloads = new RandomAccessFile(playlist+"/Downloads.itn","rw");
               
    }
    
    public int getCodigo(long offset)throws IOException{
        codigos.seek(offset);
        
        return ;
    }
    
    public void addSong(String nombre,String cantante,double precio)throws IOException{
        songs.seek(songs.length());
        songs.writeUTF(nombre);
        songs.writeUTF(cantante);
        songs.writeDouble(precio);
        
    }
   
    
    
    
    
}
