/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinepolis_bda;

import negocio.ClienteNegocio;
import negocio.IClienteNegocio;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
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
        
        IClienteNegocio clienteNegocio = new ClienteNegocio(clienteDAO);
        
        frmLogin frmcrud = new frmLogin(clienteDAO);
        frmcrud.show();
        
        System.out.println("Termina la ejecución");
    }
}
