/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.Funcion;

/**
 *
 * @author eduar
 */
public interface IFuncionDAO {
    void guardar(Funcion funcion);
    Funcion obtenerPorId(int id);
}
