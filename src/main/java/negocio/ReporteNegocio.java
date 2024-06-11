/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dtos.ReporteSucursalDTO;
import dtos.SucursalDTO;
import dtos.ciudadDTO;
import entidad.CiudadEntidad;
import entidad.ReporteSucursalEntidad;
import entidad.SucursalEntidad;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import persistencia.IReporteDAO;
import persistencia.ISucursalDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class ReporteNegocio implements IReporteNegocio{
    
    private IReporteDAO reporteDAO;

    public ReporteNegocio(IReporteDAO reporteDAO) {
        this.reporteDAO = reporteDAO;
    }
    
    @Override
    public List<ReporteSucursalDTO> buscarReporteSucursalTabla(Timestamp desde, Timestamp hasta) throws NegocioException {
         try {
            List<ReporteSucursalEntidad> reportes = this.reporteDAO.buscarReporteSucursalTabla(desde, hasta);            
            return this.convertirReporteSucursalTablaDTO(reportes);
        } catch (PersistenciaException ex) {
            // hacer uso de Logger
            System.out.println(ex.getMessage());
            throw new NegocioException(ex.getMessage());
        }
    }
    
    public List<ReporteSucursalDTO> convertirReporteSucursalTablaDTO(List<ReporteSucursalEntidad> reportes) throws NegocioException {
        if (reportes == null) {
            throw new NegocioException("No se pudieron obtener las sucursales");
        }

        List<ReporteSucursalDTO> reporteDTO = new ArrayList<>();
        for (ReporteSucursalEntidad reporte : reportes) {
            ReporteSucursalDTO dto = new ReporteSucursalDTO();
            dto.setCosto(reporte.getCosto());
            dto.setNombreSucursal(reporte.getNombreSucursal());
            dto.setCantidadBoletos(reporte.getCantidadBoletos());
            reporteDTO.add(dto);
        }
        return reporteDTO;
    }    
    
}