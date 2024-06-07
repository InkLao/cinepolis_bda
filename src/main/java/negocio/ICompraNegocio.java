/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import entidad.Compra;

/**
 *
 * @author eduar
 */
public interface ICompraNegocio {
    void realizarCompra(Compra compra);
    Compra buscarCompraPorId(int id);
}
