package persistencia;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class PeliculaDAO {
    private List<Pelicula> peliculas = new ArrayList<>();

    public void guardar(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public Pelicula obtenerPorId(int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
}
