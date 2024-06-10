package persistencia;

import entidad.Pelicula;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class PeliculaDAO implements IPeliculaDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/cinepolisequipo4";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @Override
    public void guardar(Pelicula pelicula) {
        String sql = "INSERT INTO peliculas (titulo, clasificacion, duracion, idPais, sinopsis, link_trailer) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setString(1, pelicula.getTitulo());
            statement.setString(2, pelicula.getClasificacion());
            statement.setTime(3, java.sql.Time.valueOf(pelicula.getDuracion().toString()));
            statement.setString(4, pelicula.getPaisOrigen());
            statement.setString(5, pelicula.getSinopsis());
            statement.setString(6, pelicula.getLinkTrailer());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
