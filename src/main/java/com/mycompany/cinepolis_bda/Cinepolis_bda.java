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
import negocio.ISucursalNegocio;
import negocio.PeliculaNegocio;
import negocio.SucursalNegocio;
import persistencia.CiudadDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
import persistencia.IFuncionDAO;
import persistencia.IPeliculasDAO;
import persistencia.ISucursalDAO;
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
        
        ICiudadDAO ciudadDAO = new CiudadDAO(conexionBD);
        ICiudadNegocio ciudadNegocio = new CiudadNegocio(ciudadDAO);
        
        ISucursalDAO sucursalDAO = new SucursalDAO(conexionBD);
        ISucursalNegocio sucursalNegocio = new SucursalNegocio(sucursalDAO);       
        
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        
        IPeliculasDAO peliculaDAO = new peliculasDAO(conexionBD);
        IPeliculaNegocio peliculaNegocio = new PeliculaNegocio(peliculaDAO);       
               
        IFuncionDAO funcionDAO = new funcionDAO(conexionBD);
        IFuncionNegocio funcionNegocio = new FuncionNegocio(funcionDAO);               
        
        frmLogin frmcrud = new frmLogin(clienteDAO, ciudadNegocio, sucursalNegocio, peliculaNegocio, funcionNegocio);
        frmcrud.show();
        
        System.out.println("Termina la ejecución");
    }
}
