/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.RegistroFuncionDTO;
import entidad.Funcion;

/**
 *
 * @author eduar
 */
public interface IFuncionNegocio {
    void registrarFuncion(Funcion funcion);
    void registrarFuncion(RegistroFuncionDTO funcionDTO);
    Funcion buscarFuncionPorId(int id);
}
