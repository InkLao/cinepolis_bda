/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.RegistroSucursalDTO;
import entidad.Sucursal;
import persistencia.ISucursalDAO;
import persistencia.SucursalDAO;

/**
 *
 * @author eduar
 */
public class SucursalNegocio implements ISucursalNegocio{

    private ISucursalDAO sucursalDAO;

    public SucursalNegocio() {
        this.sucursalDAO = new SucursalDAO();
    }

    @Override
    public void registrarSucursal(RegistroSucursalDTO sucursalDTO) {
        Sucursal sucursal = new Sucursal(
                sucursalDTO.getNombre(),
                sucursalDTO.getCiudad(),
                sucursalDTO.getDireccion()
        );
        sucursalDAO.guardar(sucursal);
    }
    
}
