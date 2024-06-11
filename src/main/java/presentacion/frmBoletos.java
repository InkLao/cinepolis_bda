    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.FuncionDTO;
import dtos.PeliculaDTO;
import dtos.validarClienteDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import negocio.ICiudadNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import persistencia.IClienteDAO;
import persistencia.PersistenciaException;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author santi
 */
public class frmBoletos extends javax.swing.JFrame {

     ICiudadNegocio ciudad = this.ciudad;
     ISucursalNegocio sucursal = this.sucursal;
     IPeliculaNegocio pelicula = this.pelicula;
     IClienteDAO cliente = this.cliente;
     IFuncionNegocio funcion = this.funcion;
     FuncionDTO row;
     int idFuncion;
    /**
     * Creates new form frmLogin
     */
    public frmBoletos(IClienteDAO cliente, ICiudadNegocio ciudadNegocio, ISucursalNegocio sucursalNegocio, IPeliculaNegocio peliculaNegocio, IFuncionNegocio funcionNegocio, FuncionDTO fila) {
        this.cliente = cliente;
        this.ciudad = ciudadNegocio;
        this.sucursal = sucursalNegocio;
        this.pelicula = peliculaNegocio;        
        this.funcion = funcionNegocio;        
        this.row = fila;
        initComponents();
        llenarTablaBoleto(fila);

    }

    

    private void llenarTablaBoleto(FuncionDTO fila) {

        tblBoleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { fila.getTitulo(), fila.getDuracion(), fila.getAsientosdisponibles(), fila.getSala(), fila.getPrecio()},

            },
            new String [] {
                "Título", "Fecha", "Asientos Disponibles", "Sala", "Precio"
            }
        ));
        
    }

    private void comprarBoletos() throws NegocioException, PersistenciaException{
        
        
        this.cliente.comprarBoleto(row.getIdFuncion());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoleto = new javax.swing.JTable();
        fldTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblBoleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Fecha", "Asientos Disponibles", "Sala", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tblBoleto);

        fldTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnComprar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnComprar)
                    .addComponent(fldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IClienteDAO cliente =this.cliente;
        IFuncionNegocio funcion = this.funcion;
        frmCartelera x = new frmCartelera(cliente, ciudad, sucursal, pelicula, funcion);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IClienteDAO cliente =this.cliente;
        IFuncionNegocio funcion = this.funcion;

        
         try {
             comprarBoletos();
             JOptionPane.showMessageDialog(this, "Boleto comprado correctamente!");
         frmCartelera x = new frmCartelera(cliente, ciudad, sucursal, pelicula, funcion);
        x.setVisible(true);
        setVisible(false);
         } catch (NegocioException ex) {
             Logger.getLogger(frmBoletos.class.getName()).log(Level.SEVERE, null, ex);
         } catch (PersistenciaException ex) {
             Logger.getLogger(frmBoletos.class.getName()).log(Level.SEVERE, null, ex);
         }

      
    }//GEN-LAST:event_btnComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnComprar;
    private javax.swing.JTextField fldTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoleto;
    // End of variables declaration//GEN-END:variables
}
