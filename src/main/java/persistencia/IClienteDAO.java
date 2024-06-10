/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidad.ClienteEntidad;
import negocio.NegocioException;

/**
 *
 * @author eduar
 */
public interface IClienteDAO {
    
    void registrarCliente(registrarClienteDTO cliente) throws PersistenciaException;
    
    boolean validarCliente(validarClienteDTO cliente) throws PersistenciaException;
    
    ClienteEntidad obtenerPorId(int id);
    
    ClienteEntidad obtenerPorEmail(String email);
    
}
