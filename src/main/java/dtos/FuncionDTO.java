/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class FuncionDTO {
    private int id;
    private int peliculaId;
    private Date fecha;
    private String sala;
    private int asientosDisponibles;

    public FuncionDTO() {
    }

    public FuncionDTO(int peliculaId, Date fecha, String sala, int asientosDisponibles) {
        this.peliculaId = peliculaId;
        this.fecha = fecha;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
    }

    public FuncionDTO(int id, int peliculaId, Date fecha, String sala, int asientosDisponibles) {
        this.id = id;
        this.peliculaId = peliculaId;
        this.fecha = fecha;
        this.sala = sala;
        this.asientosDisponibles = asientosDisponibles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(int peliculaId) {
        this.peliculaId = peliculaId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
}
