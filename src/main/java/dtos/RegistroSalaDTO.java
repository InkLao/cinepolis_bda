/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author eduar
 */
public class RegistroSalaDTO {
    private String nombreSala;
    private int numeroAsientos;

    public RegistroSalaDTO(String nombreSala, int numeroAsientos) {
        this.nombreSala = nombreSala;
        this.numeroAsientos = numeroAsientos;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "DTORegistroSala{" +
                "nombreSala='" + nombreSala + '\'' +
                ", numeroAsientos=" + numeroAsientos +
                '}';
    }
}
