/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.SucursalDTO;
import entidad.SucursalEntidad;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ISucursalNegocio {
    
List<SucursalDTO> buscarSucursalTabla() throws NegocioException;    

List<SucursalDTO> convertirSucursalTablaDTO(List<SucursalEntidad> sucursales) throws NegocioException;
    
}
