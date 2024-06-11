/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package negocio;

import dtos.ReporteSucursalDTO;
import entidad.ReporteSucursalEntidad;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IReporteNegocio {
 
        public List<ReporteSucursalDTO> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws NegocioException ;
        public List<ReporteSucursalDTO> convertirReporteSucursalTablaDTO(List<ReporteSucursalEntidad> reportes) throws NegocioException ;
}
