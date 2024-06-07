/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    public void guardar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente obtenerPorEmail(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente obtenerPorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente()== id) {
                return cliente;
            }
        }
        return null;
    }

}
