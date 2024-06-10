
package entidad;

/**
 *
 * @author eduar
 */
public class Pelicula {

    private int id;
    private String titulo;
    private String clasificacion;
    private int duracion;
    private String pais;
    private String sinopsis;
    private String trailer;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String clasificacion, int duracion, String pais, String sinopsis, String trailer) {
        this.id = id;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }

    public Pelicula(
            String titulo, 
            String clasificacion, 
            int duracion, 
            String pais, 
            String sinopsis, 
            String trailer) {
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + "id=" + id
                + ", titulo='" + titulo + '\''
                + ", clasificacion='" + clasificacion + '\''
                + ", duracion=" + duracion
                + ", pais='" + pais + '\''
                + ", sinopsis='" + sinopsis + '\''
                + ", trailer='" + trailer + '\''
                + '}';
    }
}
