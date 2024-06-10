/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author eduar
 */
public class RegistroFuncionDTO {
    private String horario;
    private String fecha;

    public RegistroFuncionDTO(String horario, String fecha) {
        this.horario = horario;
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "DTORegistroFuncion{" +
                "horario='" + horario + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
