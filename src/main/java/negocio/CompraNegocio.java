/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Compra;
import persistencia.CompraDAO;
import persistencia.ICompraDAO;

/**
 *
 * @author eduar
 */
public class CompraNegocio implements ICompraNegocio{
    private ICompraDAO compraDAO;

    public CompraNegocio() {
        this.compraDAO = new CompraDAO();
    }

    @Override
    public void realizarCompra(Compra compra) {
        compraDAO.guardar(compra);
    }

    @Override
    public Compra buscarCompraPorId(int id) {
        return compraDAO.obtenerPorId(id);
    }
}
