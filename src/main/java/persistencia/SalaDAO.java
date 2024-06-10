/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Sala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduar
 */
public class SalaDAO implements ISalaDAO{
    
    private List<Sala> salas = new ArrayList<>();

    @Override
    public void guardar(Sala sala) {
        salas.add(sala);
    }
    
}
