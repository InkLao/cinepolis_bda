/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import entidad.ClienteEntidad;

/**
 *
 * @author eduar
 */
public interface IClienteNegocio {
    void registrarCliente(registrarClienteDTO cliente) throws NegocioException;
    public boolean validarCliente(validarClienteDTO cliente) throws NegocioException;
    public int buscarIdCliente(validarClienteDTO cliente) throws NegocioException;
        public void comprarBoleto(int id) throws NegocioException ;
            
}
