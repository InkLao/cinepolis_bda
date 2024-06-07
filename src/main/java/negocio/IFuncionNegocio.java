/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import entidad.Funcion;

/**
 *
 * @author eduar
 */
public interface IFuncionNegocio {
    void registrarFuncion(Funcion funcion);
    Funcion buscarFuncionPorId(int id);
}
