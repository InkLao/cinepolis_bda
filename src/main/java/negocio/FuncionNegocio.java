/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Funcion;
import persistencia.FuncionDAO;

/**
 *
 * @author eduar
 */
public class FuncionNegocio {
    private FuncionDAO funcionDAO;

    public FuncionNegocio() {
        this.funcionDAO = new FuncionDAO();
    }

    public void registrarFuncion(Funcion funcion) {
        funcionDAO.guardar(funcion);
    }

    public Funcion buscarFuncionPorId(int id) {
        return funcionDAO.obtenerPorId(id);
    }
}
