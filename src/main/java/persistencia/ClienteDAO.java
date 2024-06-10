/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidad.ClienteEntidad;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.NegocioException;

/**
 *
 * @author eduar, ssanchez
 */
public class ClienteDAO implements IClienteDAO{
    
    private List<ClienteEntidad> clientes = new ArrayList<>();

    private IConexionBD conexionBD;

    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public void registrarCliente(registrarClienteDTO cliente) throws PersistenciaException {
        try{
                        
            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "insert into clientes (nombre,apellido,email, contraseña, fecha_nacimiento, idCiudad) values (?,?,?,?,?,?);";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, cliente.getNombre());
            preparedStatement.setString(2, cliente.getApellido());
            preparedStatement.setString(3, cliente.getEmail());
            preparedStatement.setString(4, cliente.getContraseña());
            preparedStatement.setDate(5, cliente.getFechaNacimiento());
            preparedStatement.setInt(6, cliente.getIdCiudad());
            preparedStatement.execute();
            conexion.close();
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al Insertar la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema."); 
        };
    }
    
        @Override
        public int buscarIdCliente(validarClienteDTO cliente) throws PersistenciaException {
        try {

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "select idCliente from clientes where ? = email and ? = contraseña";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setString(1, cliente.getEmail());
            preparedStatement.setString(2, cliente.getContraseña());
            ResultSet resultado = preparedStatement.executeQuery();
            int idCliente = resultado.getInt("idCliente");
            conexion.close();
            return idCliente;
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }
    
    public boolean validarCliente(validarClienteDTO cliente) throws PersistenciaException{
    try{
        
        Connection conexion = this.conexionBD.crearConexion();
        String codigoSQL = "CALL validarUsuario(?,?,?);";
            try (CallableStatement callableStatement = conexion.prepareCall(codigoSQL)) {
                // Set the input parameter
                callableStatement.setString(1, cliente.getEmail());
                callableStatement.setString(2, cliente.getContraseña());
                // Register the output parameters
                callableStatement.registerOutParameter(3, java.sql.Types.BOOLEAN);

                // Execute the stored procedure 
                callableStatement.execute();


                boolean validado = callableStatement.getBoolean(3);
                return validado;
            }

    }catch(SQLException ex) {
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al Validar en la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");   
    }
    }

        @Override
        public void comprarBoleto(int id) throws PersistenciaException {
        try {

            Connection conexion = this.conexionBD.crearConexion();
            String codigoSQL = "insert into boletos (idCliente, idFuncion) values (?, 1)";
            PreparedStatement preparedStatement = conexion.prepareStatement(codigoSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            conexion.close();
        } catch (SQLException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new PersistenciaException("Ocurrió un error al leer la base de datos, inténtelo de nuevo y si el error persiste comuníquese con el encargado del sistema.");
        }
    }
    
}
