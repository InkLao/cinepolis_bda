/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinepolis_bda;

import negocio.CiudadNegocio;
import negocio.ClienteNegocio;
import negocio.FuncionNegocio;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.IReporteNegocio;
import negocio.ISucursalNegocio;
import negocio.PeliculaNegocio;
import negocio.ReporteNegocio;
import negocio.SucursalNegocio;
import persistencia.CiudadDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.IFuncionDAO;
import persistencia.IPeliculasDAO;
import persistencia.IReporteDAO;
import persistencia.ISucursalDAO;
import persistencia.ReporteDAO;
import persistencia.SucursalDAO;
import persistencia.funcionDAO;
import persistencia.peliculasDAO;
import presentacion.frmLogin;

/**
 *
 * @author eduar
 * Test commit
 */
public class Cinepolis_bda {

    public static void main(String[] args) {
        IConexionBD conexionBD = new ConexionBD();
        
        IClienteDAO clienteDAO =  new ClienteDAO(conexionBD);
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);        
        
        ICiudadDAO ciudadDAO = new CiudadDAO(conexionBD);
        ICiudadNegocio ciudadNegocio = new CiudadNegocio(ciudadDAO);
        
        ISucursalDAO sucursalDAO = new SucursalDAO(conexionBD);
        ISucursalNegocio sucursalNegocio = new SucursalNegocio(sucursalDAO);
        
        IPeliculasDAO peliculaDAO = new peliculasDAO(conexionBD);
        IPeliculaNegocio peliculaNegocio = new PeliculaNegocio(peliculaDAO);       
               
        IFuncionDAO funcionDAO = new funcionDAO(conexionBD);
        IFuncionNegocio funcionNegocio = new FuncionNegocio(funcionDAO);     
        
        IReporteDAO reporteDAO = new ReporteDAO(conexionBD);
        IReporteNegocio reporteNegocio = new ReporteNegocio(reporteDAO);
        
        frmLogin frmcrud = new frmLogin(clienteNegocio, ciudadNegocio, sucursalNegocio, peliculaNegocio, funcionNegocio, reporteNegocio);
        frmcrud.show();
        
        System.out.println("Termina la ejecución");
    }
}
