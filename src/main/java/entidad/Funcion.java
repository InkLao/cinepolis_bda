
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
    private String sala;
    private int asientosDisponibles;

    public Funcion() {
    }

    public Funcion(int id, Pelicula pelicula, LocalDateTime hora, String sala, int asientosDisponibles) {
        this.id = id;
        this.pelicula = pelicula;
        this.hora = hora;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
    }

    public Funcion(Pelicula pelicula, LocalDateTime hora, String sala, int asientosDisponibles) {
        this.pelicula = pelicula;
        this.hora = hora;
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

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime fecha) {
        this.hora = fecha;
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
                ", hora=" + hora +
                ", sala='" + sala + '\'' +
                ", asientosDisponibles=" + asientosDisponibles +
                '}';
    }
}
