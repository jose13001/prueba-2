/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2prueba_2;

import java.io.Serializable;

/**
 *
 * @author josec
 */
public class cancion implements Serializable{
    public int codigo;
    public String nombre;
    public String cantante;
    public double precio;
    public int estrellas;
    public int reviews;

    public cancion(int codigo, String nombre, String cantante, double precio, int estrellas, int reviews) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantante = cantante;
        this.precio = precio;
        this.estrellas = estrellas;
        this.reviews = reviews;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "cancion{" + "codigo=" + codigo + ", nombre=" + nombre + ", cantante=" + cantante + ", precio=" + precio + ", estrellas=" + estrellas + ", reviews=" + reviews + '}';
    }
    
    
    
    
}
