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
    
    public int buscarIdCliente(validarClienteDTO cliente) throws PersistenciaException;
    
    public void comprarBoleto(int id) throws PersistenciaException;
    
}
