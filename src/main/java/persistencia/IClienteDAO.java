/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidad.ClienteEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import negocio.NegocioException;

/**
 *
 * @author eduar
 */
public interface IClienteDAO {
    
    void registrarCliente(registrarClienteDTO cliente) throws PersistenciaException;
    
    boolean validarCliente(validarClienteDTO cliente) throws PersistenciaException;
    
    public int buscarIdCliente(validarClienteDTO cliente) throws PersistenciaException;
    
    public void comprarBoleto(int id, int cant) throws PersistenciaException;
    
    public List<ClienteEntidad> buscarClientesTabla() throws PersistenciaException;

    public ClienteEntidad convertirAEntidad(ResultSet resultado) throws SQLException ;
    
}
