package persistencia;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class PeliculaDAO implements IPeliculaDAO {

    private List<Pelicula> peliculas = new ArrayList<>();

    @Override
    public void guardar(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    @Override
    public Pelicula obtenerPorId(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }

    @Override
    public Pelicula obtenerPorTitulo(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }
}
