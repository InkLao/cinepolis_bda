/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.time.Duration;

/**
 *
 * @author eduar
 */
public class RegistroPeliculasDTO {

    private String titulo;
    private String clasificacion;
    private Duration duracion;
    private String paisOrigen;
    private String sinopsis;
    private String linkTrailer;

    public RegistroPeliculasDTO(String titulo, String clasificacion, Duration duracion, String paisOrigen, String sinopsis, String linkTrailer) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.paisOrigen = paisOrigen;
        this.sinopsis = sinopsis;
        this.linkTrailer = linkTrailer;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getLinkTrailer() {
        return linkTrailer;
    }

    public void setLinkTrailer(String linkTrailer) {
        this.linkTrailer = linkTrailer;
    }

    @Override
    public String toString() {
        return "DTORegistroPeliculas{" +
                "titulo='" + titulo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", duracion=" + duracion +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", linkTrailer='" + linkTrailer + '\'' +
                '}';
    }
}
