/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import entidad.Pelicula;
import entidad.Sala;
import java.time.LocalDateTime;

/**
 *
 * @author eduar
 */
public class RegistroFuncionDTO {
    private Pelicula pelicula;
    private LocalDateTime hora;
    private Sala sala;
    private int disponibilidad;

    public RegistroFuncionDTO(Pelicula pelicula, LocalDateTime hora, Sala sala, int disponibilidad) {
        this.pelicula = pelicula;
        this.hora = hora;
        this.sala = sala;
        this.disponibilidad = disponibilidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "DTORegistroFuncion{" +
                "pelicula=" + pelicula +
                ", hora=" + hora +
                ", sala=" + sala +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}