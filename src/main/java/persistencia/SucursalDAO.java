/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Sucursal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class SucursalDAO implements ISucursalDAO{

    private List<Sucursal> sucursales = new ArrayList<>();

    @Override
    public void guardar(Sucursal sucursal) {
        sucursales.add(sucursal);
    }
    
}
