/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.ClienteDTO;
import dtos.FuncionDTO;
import dtos.PeliculaDTO;
import entidad.ClienteEntidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.IReporteNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import persistencia.IClienteDAO;


/**
 *
 * @author santi
 */
public class frmFuncionesCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form frmClientes
     */
    IClienteNegocio cliente;
    ICiudadNegocio ciudad;
    ISucursalNegocio sucursal;
    IPeliculaNegocio pelicula;
    IFuncionNegocio funcion;   
    IReporteNegocio reporte;
    
    public frmFuncionesCatalogo(IClienteNegocio cliente, ICiudadNegocio ciudad, ISucursalNegocio sucursal, IPeliculaNegocio pelicula, IFuncionNegocio funcion, IReporteNegocio reporte) {
        this.cliente = cliente;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.pelicula = pelicula;
        this.funcion = funcion;        
        this.reporte = reporte;        
        initComponents();
        llenarTablaFunciones(buscarFuncionesTablaT());
    }

    private List<FuncionDTO> buscarFuncionesTablaT(){
        List<FuncionDTO> funcionesLista = null;
        try {
            
            funcionesLista = this.funcion.buscarFuncionesTablaT();


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return funcionesLista;
    }          
    
    private void llenarTablaFunciones(List<FuncionDTO> funcionesLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblClientes.getModel();

        if (modeloTabla.getRowCount() > 0) {
            for (int i = modeloTabla.getRowCount() - 1; i > -1; i--) {
                modeloTabla.removeRow(i);
            }
        }

        if (funcionesLista != null) {
            funcionesLista.forEach(row -> {
                Object[] fila = new Object[7];
                fila[0] = row.getTitulo();
                fila[1] = row.getDuracion();
                fila[2] = row.getSala();
                fila[3] = row.getAsientosdisponibles();
                

                modeloTabla.addRow(fila);
            });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sala", "Película", "Fecha", "Asientos disponibles"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        IClienteNegocio cliente = this.cliente;
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IFuncionNegocio funcion = this.funcion;
        IReporteNegocio reporte = this.reporte;
        
        frmLogin x = new frmLogin(cliente, ciudad, sucursal, pelicula, funcion, reporte);
        x.setVisible(true);
        setVisible(false);        
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}