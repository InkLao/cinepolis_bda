/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.Ciudad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ICiudadDAO {
    
    List<Ciudad> buscarCiudadTabla() throws PersistenciaException;
    
    Ciudad convertirAEntidad(ResultSet resultado) throws SQLException;    
}
