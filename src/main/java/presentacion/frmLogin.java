/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import negocio.ICiudadNegocio;
import negocio.ISucursalNegocio;
import persistencia.ClienteDAO;
import persistencia.ICiudadDAO;
import persistencia.IClienteDAO;

/**
 *
 * @author santi
 */
public class frmLogin extends javax.swing.JFrame {

    private IClienteDAO cliente;
    private ICiudadNegocio ciudad;
    private ISucursalNegocio sucursal;
    /**
     * Creates new form frmLogin
     */
    public frmLogin(IClienteDAO cliente, ICiudadNegocio ciudad, ISucursalNegocio sucursal) {
        this.cliente = cliente;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarSesión = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciarSesión.setText("Iniciar Sesión");
        btnIniciarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesiónActionPerformed(evt);
            }
        });

        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnRegistro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnIniciarSesión)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(btnIniciarSesión)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesiónActionPerformed
        // TODO add your handling code here:
        IClienteDAO cliente = this.cliente;
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        frmIniciarSesion x = new frmIniciarSesion(cliente, ciudad, sucursal);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnIniciarSesiónActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        IClienteDAO cliente = this.cliente;
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        
        frmRegistroCliente x = new frmRegistroCliente(cliente, ciudad, sucursal);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesión;
    private javax.swing.JButton btnRegistro;
    // End of variables declaration//GEN-END:variables
}
