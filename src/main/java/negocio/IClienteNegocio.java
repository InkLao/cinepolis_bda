/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import entidad.Cliente;

/**
 *
 * @author eduar
 */
public interface IClienteNegocio {
    void registrarCliente(Cliente cliente);
    Cliente buscarClientePorId(int id);
    Cliente buscarClientePorEmail(String email);
}
