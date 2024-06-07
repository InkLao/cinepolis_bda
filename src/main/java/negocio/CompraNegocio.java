/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Compra;
import persistencia.CompraDAO;

/**
 *
 * @author eduar
 */
public class CompraNegocio {
    private CompraDAO compraDAO;

    public CompraNegocio() {
        this.compraDAO = new CompraDAO();
    }

    public void realizarCompra(Compra compra) {
        compraDAO.guardar(compra);
    }
}
