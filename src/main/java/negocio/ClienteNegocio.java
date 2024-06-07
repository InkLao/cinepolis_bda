/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Cliente;
import persistencia.ClienteDAO;
import persistencia.IClienteDAO;

/**
 *
 * @author eduar
 */
public class ClienteNegocio implements IClienteNegocio{
    private IClienteDAO clienteDAO;

    public ClienteNegocio() {
        this.clienteDAO = new ClienteDAO();
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        clienteDAO.guardar(cliente);
    }

    @Override
    public Cliente buscarClientePorId(int id) {
        return clienteDAO.obtenerPorId(id);
    }

    @Override
    public Cliente buscarClientePorEmail(String email) {
        return clienteDAO.obtenerPorEmail(email);
    }
}
