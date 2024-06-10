
package entidad;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author eduar
 */
public class Funcion {
    private int id;
    private Pelicula pelicula;
    private LocalDateTime hora;
    private Sala sala;
    private int disponibilidad;

    public Funcion(int id, Pelicula pelicula, LocalDateTime hora, Sala sala, int disponibilidad) {
        this.id = id;
        this.pelicula = pelicula;
        this.hora = hora;
        this.sala = sala;
        this.disponibilidad = disponibilidad;
    }

    public Funcion(Pelicula pelicula, LocalDateTime hora, Sala sala, int disponibilidad) {
        this.pelicula = pelicula;
        this.hora = hora;
        this.sala = sala;
        this.disponibilidad = disponibilidad;
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
        return "Funcion{" +
                "pelicula=" + pelicula +
                ", hora=" + hora +
                ", sala=" + sala +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

}
