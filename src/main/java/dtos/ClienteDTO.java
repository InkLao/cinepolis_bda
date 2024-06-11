package dtos;

import entidad.*;
import java.sql.Date;
import java.time.LocalTime;

/**
 *
 * @author eduar
 */
public class ClienteDTO {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String contraseña;
    private String fechaNacimiento;
    private Date fechaNacimientoa;

    public ClienteDTO() {
    }

    public ClienteDTO(
            String nombre, 
            String apellido, 
            String email, 
            String ciudad, 
            String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteDTO(int idCliente, String nombre, String apellido, Date fn, String contraseña, String email, String nc) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.email = email;
        this.ciudad = nc;
        this.fechaNacimientoa = fn;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimientoa() {
        return fechaNacimientoa;
    }

    public void setFechaNacimientoa(Date fechaNacimientoa) {
        this.fechaNacimientoa = fechaNacimientoa;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
