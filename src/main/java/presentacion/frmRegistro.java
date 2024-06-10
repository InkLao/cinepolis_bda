/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.registrarClienteDTO;
import dtos.validarClienteDTO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.ICiudadNegocio;
import negocio.NegocioException;
import persistencia.ClienteDAO;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;
import persistencia.PersistenciaException;

/**
 *
 * @author santi
 */
public class frmRegistro extends javax.swing.JFrame {
    
    IClienteDAO cliente;
    ICiudadNegocio ciudad;

    /**
     * Creates new form frmLogin
     */
    public frmRegistro(IClienteDAO cliente, ICiudadNegocio ciudad) {
        this.cliente = cliente;
        this.ciudad = ciudad;
        initComponents();
    }

    private void registrarCliente(registrarClienteDTO cliente) throws PersistenciaException{
        try{
        this.cliente.registrarCliente(cliente);
        } catch (PersistenciaException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }
    }  
    
    private boolean validarCliente(validarClienteDTO cliente) throws PersistenciaException{

        return this.cliente.validarCliente(cliente);

    }        
    
    private static java.sql.Date getSQLDate(String dateText) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false); // To ensure strict date parsing
        try {
            // Parse the date string to a java.util.Date
            java.util.Date parsedDate = format.parse(dateText);
            // Convert java.util.Date to java.sql.Date
            return new java.sql.Date(parsedDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    
    }  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        fldCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fldContraseña = new javax.swing.JTextField();
        fldNombre = new javax.swing.JTextField();
        fldApellido = new javax.swing.JTextField();
        fldFecha = new javax.swing.JTextField();
        cmbCiudad = new javax.swing.JComboBox<>();
        jlLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 424, -1, -1));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 424, -1, -1));
        getContentPane().add(fldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 137, 147, -1));

        jLabel1.setText("Correo Electrónico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 147, 100, -1));

        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 180, 100, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 218, 100, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 256, 100, -1));

        jLabel6.setText("Fecha Nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 294, 100, -1));

        jLabel7.setText("Ciudad de vivencia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 332, -1, -1));
        getContentPane().add(fldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 175, 147, -1));
        getContentPane().add(fldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 213, 147, -1));
        getContentPane().add(fldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 251, 147, -1));

        fldFecha.setText("YYYY-MM-DD");
        getContentPane().add(fldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 289, 147, -1));

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 327, 147, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        IClienteDAO cliente = this.cliente;
        ICiudadNegocio ciudad = this.ciudad;
        frmLogin x = new frmLogin(cliente, ciudad);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try{
        String val1 = fldNombre.getText();
        String val2 = fldApellido.getText();
        String val3 = fldCorreo.getText();
        String val4 = fldContraseña.getText();
        String dateAux = fldFecha.getText();
        Date val5 = getSQLDate(dateAux);
        int val6 = 1;
        validarClienteDTO clienteAV = new validarClienteDTO(val3, val4);
        registrarClienteDTO cliente = new registrarClienteDTO(val1, val2, val3, val4, val5, val6);
        if (validarCliente(clienteAV) != true){
        registrarCliente(cliente);
        JOptionPane.showMessageDialog(this, "Cliente agregado correctamente");
        } else JOptionPane.showMessageDialog(this, "El cliente ya existe!");
        } catch (PersistenciaException ex) {
        JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbCiudad;
    private javax.swing.JTextField fldApellido;
    private javax.swing.JTextField fldContraseña;
    private javax.swing.JTextField fldCorreo;
    private javax.swing.JTextField fldFecha;
    private javax.swing.JTextField fldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlLogo;
    // End of variables declaration//GEN-END:variables
}