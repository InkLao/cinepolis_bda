    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.FuncionDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.IReporteNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;


/**
 *
 * @author santi
 */
public class frmBoletos extends javax.swing.JFrame {

     ICiudadNegocio ciudad = this.ciudad;
     ISucursalNegocio sucursal = this.sucursal;
     IPeliculaNegocio pelicula = this.pelicula;
     IClienteNegocio cliente = this.cliente;
     IFuncionNegocio funcion = this.funcion;
     IReporteNegocio reporte = this.reporte;
     FuncionDTO row;
     int idFuncion;
    /**
     * Creates new form frmLogin
     */
    public frmBoletos(IClienteNegocio cliente, ICiudadNegocio ciudadNegocio, ISucursalNegocio sucursalNegocio, IPeliculaNegocio peliculaNegocio, IFuncionNegocio funcionNegocio, IReporteNegocio reporte, FuncionDTO fila) {
        this.cliente = cliente;
        this.ciudad = ciudadNegocio;
        this.sucursal = sucursalNegocio;
        this.pelicula = peliculaNegocio;        
        this.funcion = funcionNegocio;        
        this.reporte = reporte;        
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

    private void comprarBoletos() throws NegocioException {
        
        int cant = 1 + boxCantidad.getSelectedIndex();

        this.cliente.comprarBoleto(row.getIdFuncion(), cant);
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
        boxCantidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        boxCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Boleto", "2 Boletos", "3 Boletos", "4 Boletos", "5 Boletos", "6 Boletos", "7 Boletos", "8 Boletos", "9 Boletos", "10 Boletos" }));

        jLabel1.setText("Selecciona la cantidad de boletos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Compra de boletos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras)
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComprar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(187, 187, 187))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnComprar)
                    .addComponent(boxCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IClienteNegocio cliente =this.cliente;
        IFuncionNegocio funcion = this.funcion;
        IReporteNegocio reporte = this.reporte;
        frmCartelera x = new frmCartelera(cliente, ciudad, sucursal, pelicula, funcion, reporte);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IClienteNegocio cliente =this.cliente;
        IFuncionNegocio funcion = this.funcion;
        IReporteNegocio reporte = this.reporte;

         try {
             comprarBoletos();
        JOptionPane.showMessageDialog(this, "Boleto comprado correctamente!");
        frmCartelera x = new frmCartelera(cliente, ciudad, sucursal, pelicula, funcion, reporte);
        x.setVisible(true);
        setVisible(false);
         } catch (NegocioException ex) {
             Logger.getLogger(frmBoletos.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        

      
    }//GEN-LAST:event_btnComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCantidad;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoleto;
    // End of variables declaration//GEN-END:variables
}
