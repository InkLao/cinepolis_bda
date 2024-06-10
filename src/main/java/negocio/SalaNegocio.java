/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.RegistroSalaDTO;
import entidad.Sala;
import persistencia.ISalaDAO;
import persistencia.SalaDAO;

/**
 *
 * @author eduar
 */
public class SalaNegocio implements ISalaNegocio{

    private ISalaDAO salaDAO;

    public SalaNegocio() {
        this.salaDAO = new SalaDAO();
    }

    @Override
    public void registrarSala(RegistroSalaDTO salaDTO) {
        Sala sala = new Sala(
                salaDTO.getNombre(),
                salaDTO.getCapacidad()
        );
        salaDAO.guardar(sala);
    }
}
