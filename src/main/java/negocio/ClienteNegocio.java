/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Cliente;
import persistencia.ClienteDAO;

/**
 *
 * @author eduar
 */
public class ClienteNegocio {
    private ClienteDAO clienteDAO;

    public ClienteNegocio() {
        this.clienteDAO = new ClienteDAO();
    }

    public void registrarCliente(Cliente cliente) {
        clienteDAO.guardar(cliente);
    }

    public Cliente buscarClientePorEmail(String email) {
        return clienteDAO.obtenerPorEmail(email);
    }

    public Cliente buscarClientePorId(int id) {
        return clienteDAO.obtenerPorId(id);
    }
}
