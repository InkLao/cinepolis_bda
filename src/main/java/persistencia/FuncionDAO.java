/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Funcion;
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
public class FuncionDAO implements IFuncionDAO{
    private List<Funcion> funciones = new ArrayList<>();

    private static final String URL = "jdbc:mysql://localhost:3306/cinepolisequipo4";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    @Override
    public void guardar(Funcion funcion) {
        String sql = "INSERT INTO funciones (fecha_hora, idSala, idPelicula, disponibilidad) VALUES (?, ?, ?, ?)";
        
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            
            statement.setTimestamp(1, java.sql.Timestamp.valueOf(funcion.getHora()));
            statement.setInt(2, funcion.getSala().getIdSala()); // Asumiendo que Sala tiene un método getIdSala()
            statement.setInt(3, funcion.getPelicula().getIdPelicula()); // Asumiendo que Pelicula tiene un método getIdPelicula()
            statement.setInt(4, funcion.getDisponibilidad());
            
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Funcion obtenerPorId(int id) {
        for (Funcion funcion : funciones) {
            if (funcion.getId() == id) {
                return funcion;
            }
        }
        return null;
    }
}
