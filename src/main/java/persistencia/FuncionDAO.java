/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Funcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class FuncionDAO implements IFuncionDAO{
    private List<Funcion> funciones = new ArrayList<>();

    @Override
    public void guardar(Funcion funcion) {
        funciones.add(funcion);
    }

    @Override
    public Funcion obtenerPorId(int id) {
        for (Funcion funcion : funciones) {
            if (funcion.getId() == id) {
                return funcion;
            }
        }
        return null;
    }
}
