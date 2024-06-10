
package entidad;

import java.time.Duration;

/**
 *
 * @author eduar
 */
public class Pelicula {

    private int idPelicula;
    private String titulo;
    private String clasificacion;
    private Duration duracion;
    private String paisOrigen;
    private String sinopsis;
    private String linkTrailer;

    public Pelicula(int idPelicula, String titulo, String clasificacion, Duration duracion, String paisOrigen, String sinopsis, String linkTrailer) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.paisOrigen = paisOrigen;
        this.sinopsis = sinopsis;
        this.linkTrailer = linkTrailer;
    }

    public Pelicula(String titulo, String clasificacion, Duration duracion, String paisOrigen, String sinopsis, String linkTrailer) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.paisOrigen = paisOrigen;
        this.sinopsis = sinopsis;
        this.linkTrailer = linkTrailer;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
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
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", titulo='" + titulo + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", duracion=" + duracion +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", sinopsis='" + sinopsis + '\'' +
                ", linkTrailer='" + linkTrailer + '\'' +
                '}';
    }
}
