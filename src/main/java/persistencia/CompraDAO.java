/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Compra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class CompraDAO {
    private List<Compra> compras = new ArrayList<>();

    public void guardar(Compra compra) {
        compras.add(compra);
    }

    public Compra obtenerPorId(int id) {
        for (Compra compra : compras) {
            if (compra.getIdCompra()== id) {
                return compra;
            }
        }
        return null;
    }
}
