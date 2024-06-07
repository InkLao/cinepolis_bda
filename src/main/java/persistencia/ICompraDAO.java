/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.Compra;

/**
 *
 * @author eduar
 */
public interface ICompraDAO {
    void guardar(Compra compra);
    Compra obtenerPorId(int id);
}
