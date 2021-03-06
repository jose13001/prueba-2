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
               
        initCode();
    }
    
    public void initCode()throws IOException{
        if(songs.length()==0){
            songs.writeInt(1);
            songs.writeInt(1);
        }
    }
    
    
    
    public int getCodigo(long offset)throws IOException{
        codigos.seek(0);
        int song=songs.readInt();
        int downloads=songs.readInt();
        if(offset==0){
            songs.seek(0);
            songs.writeInt(song+1);
            return song;
        }else if(offset==4){
            songs.seek(0);
            songs.skipBytes(4);
            songs.writeInt(downloads+1);
            return downloads;
        }else{
            return 0;
        }
       
       
    }
    
    public void addSong(String nombre,String cantante,double precio)throws IOException{
        songs.seek(songs.length());
        int codigo =getCodigo(0);
        songs.writeInt(codigo);
        songs.writeUTF(nombre);
        songs.writeUTF(cantante);
        songs.writeDouble(precio);
        songs.writeInt(0);
        songs.writeInt(0);
    }
    
    public void reviewSong(int code,int stars)throws IOException{
        songs.seek(0);
        while(songs.getFilePointer()<songs.length()){
            long x= songs.getFilePointer();
            if(songs.readInt()==code){
                songs.readUTF();
                songs.readUTF();
                songs.skipBytes(8);
                int estrellas=songs.readInt();
                int reviews=songs.readInt();
                if(estrellas>=0 && estrellas <=5){
                    songs.seek(x);
                    songs.readUTF();
                    songs.readUTF();
                    songs.skipBytes(8);
                    songs.writeInt(stars +estrellas);
                    songs.writeInt(reviews+1);
                }else{
                    throw new IllegalArgumentException();
                }
            }
                
        }
        
    }
    
    public void downloadSong(int codeSong,String cliente){
        
        
    }
    
    public void songs(String txtFile){
        
        
    }
    
    public void infoSong(int codeSong) throws IOException{
        songs.seek(0);
        while(songs.getFilePointer()< songs.length()){
            if(songs.readInt()==codeSong){
                String nombre=songs.readUTF();
                String cantante =songs.readUTF();
                double precio=songs.readInt();
                int estrellas=songs.readInt();
                int reviews=songs.readInt();
                int totalEstrellas= estrellas*reviews;
                int descargas=songs.readInt();
                
                System.out.println("Nombre: "+nombre+" Cantante: "+cantante+" precio: "+precio+" estrellas: "+estrellas+" reviews: "+reviews+" total de estrellas: "+totalEstrellas+" descargas: "+descargas);
            }
        }
        
    }
   
    
    
    
    
}
