package entidad;

/**
 *
 * @author eduar
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String fechaNacimiento;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, String ciudad, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.fechaNacimiento = fechaNacimiento;
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

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", ciudad=" + ciudad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
