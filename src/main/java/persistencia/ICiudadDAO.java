/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidad.CiudadEntidad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author santi
 */
public interface ICiudadDAO {
    
    List<CiudadEntidad> buscarCiudadTabla() throws PersistenciaException;
    
    CiudadEntidad convertirAEntidad(ResultSet resultado) throws SQLException;    
}
