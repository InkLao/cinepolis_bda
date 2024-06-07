/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.Cliente;

/**
 *
 * @author eduar
 */
public interface IClienteDAO {
    void guardar(Cliente cliente);
    Cliente obtenerPorId(int id);
    Cliente obtenerPorEmail(String email);
}
