/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Funcion;
import persistencia.FuncionDAO;
import persistencia.IFuncionDAO;

/**
 *
 * @author eduar
 */
public class FuncionNegocio implements IFuncionNegocio{
    private IFuncionDAO funcionDAO;

    public FuncionNegocio() {
        this.funcionDAO = new FuncionDAO();
    }

    @Override
    public void registrarFuncion(Funcion funcion) {
        funcionDAO.guardar(funcion);
    }

    @Override
    public Funcion buscarFuncionPorId(int id) {
        return funcionDAO.obtenerPorId(id);
    }
}
