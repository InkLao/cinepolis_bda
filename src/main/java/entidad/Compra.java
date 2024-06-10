
package entidad;

import java.util.Date;

/**
 *
 * @author eduar
 */
public class Compra {
    private int idCompra;
    private ClienteEntidad cliente;
    private String pelicula;
    private Date fecha;
    private int numeroAsientos;

    public Compra() {
    }

    public Compra(
            ClienteEntidad cliente, 
            String pelicula, 
            Date fecha, 
            int numeroAsientos) {
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.numeroAsientos = numeroAsientos;
    }

    public Compra(
            int idCompra, 
            ClienteEntidad cliente, 
            String pelicula, 
            Date fecha, 
            int numeroAsientos) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.numeroAsientos = numeroAsientos;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", cliente=" + cliente + ", pelicula=" + pelicula + ", fecha=" + fecha + ", numeroAsientos=" + numeroAsientos + '}';
    }
}
