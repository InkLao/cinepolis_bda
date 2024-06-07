/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class Funcion {
    private int id;
    private Pelicula pelicula;
    private Date fecha;
    private String sala;
    private int asientosDisponibles;

    public Funcion() {
    }

    public Funcion(int id, Pelicula pelicula, Date fecha, String sala, int asientosDisponibles) {
        this.id = id;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
    }

    public Funcion(Pelicula pelicula, Date fecha, String sala, int asientosDisponibles) {
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
    
     @Override
    public String toString() {
        return "Funcion{" +
                "id=" + id +
                ", pelicula=" + pelicula +
                ", fecha=" + fecha +
                ", sala='" + sala + '\'' +
                ", asientosDisponibles=" + asientosDisponibles +
                '}';
    }
}
