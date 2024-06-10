/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinepolis_bda;

import negocio.CiudadNegocio;
import negocio.ClienteNegocio;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import persistencia.CiudadDAO;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;
import persistencia.IConexionBD;
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
        
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        
        frmLogin frmcrud = new frmLogin(clienteDAO, ciudadNegocio);
        frmcrud.show();
        
        System.out.println("Termina la ejecución");
    }
}
