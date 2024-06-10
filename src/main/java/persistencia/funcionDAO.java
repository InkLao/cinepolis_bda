/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.FuncionEntidad;
import entidad.PeliculaEntidad;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class funcionDAO implements IFuncionDAO{
    
    private IConexionBD conexionBD;

    public funcionDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    
        @Override
        public List<FuncionEntidad> buscarFuncionesTabla(String pelicula1) throws PersistenciaException {
        try {
            List<FuncionEntidad> sucursalLista = null;

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select p.titulo, f.fecha_hora, f.disponibilidad, s.nombre, p.costo from peliculas p\n" +
                               "inner join funciones f on p.idPelicula = f.idPelicula\n" +
                               "inner join salas s on s.idSala = f.idSala\n" +
                               "where ? = p.titulo;";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, pelicula1);
            ResultSet resultado = preparedStatement.executeQuery();
            while (resultado.next()) {
                if (sucursalLista == null) {
                    sucursalLista = new ArrayList<>();
                }
                FuncionEntidad funciones = this.convertirAEntidad(resultado);
                sucursalLista.add(funciones);
            }
            conexion.close();
            return sucursalLista;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }

    @Override
    public FuncionEntidad convertirAEntidad(ResultSet resultado) throws SQLException {
        String titulo = resultado.getString("titulo");
        Timestamp duracion = resultado.getTimestamp("fecha_hora");
        String sala = resultado.getString("nombre");
        int disponibilidad = resultado.getInt("disponibilidad");
        int costo = resultado.getInt("costo");
        return new FuncionEntidad(titulo, duracion, disponibilidad, sala, costo);
    }    
    
}
