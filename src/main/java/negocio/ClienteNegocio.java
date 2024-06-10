/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidad.ClienteEntidad;
import java.util.List;
import persistencia.ClienteDAO;
import persistencia.IClienteDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author eduar
 */
public class ClienteNegocio implements IClienteNegocio{
    
    private IClienteDAO clienteDAO;

    public ClienteNegocio(IClienteDAO Cliente) {
        this.clienteDAO = Cliente;
    }

    @Override
    public void registrarCliente(registrarClienteDTO cliente) throws NegocioException{
            try {
            this.clienteDAO.registrarCliente(cliente);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    @Override
    public boolean validarCliente(validarClienteDTO cliente) throws NegocioException{
            try {
            return this.clienteDAO.validarCliente(cliente);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }

    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException {
                try {
            return this.clienteDAO.buscarIdCliente(cliente);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    
    public void comprarBoleto(int id) throws NegocioException {
                try {
            this.clienteDAO.comprarBoleto(id);            
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }   
    
}
