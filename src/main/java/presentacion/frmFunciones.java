/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.FuncionDTO;
import dtos.PeliculaDTO;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import negocio.ICiudadNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import persistencia.IClienteDAO;
import utilerias.JButtonCellEditor;
import utilerias.JButtonRenderer;

/**
 *
 * @author santi
 */
public class frmFunciones extends javax.swing.JFrame {

     ICiudadNegocio ciudad = this.ciudad;
     ISucursalNegocio sucursal = this.sucursal;
     IPeliculaNegocio pelicula = this.pelicula;
     IClienteDAO cliente = this.cliente;
     IFuncionNegocio funcion = this.funcion;
     String pelicula1 = null;
    /**
     * Creates new form frmLogin
     */
    public frmFunciones(IClienteDAO cliente, ICiudadNegocio ciudadNegocio, ISucursalNegocio sucursalNegocio, IPeliculaNegocio peliculaNegocio, IFuncionNegocio funcionNegocio, String pelicula) {
        this.cliente = cliente;
        this.ciudad = ciudadNegocio;
        this.sucursal = sucursalNegocio;
        this.pelicula = peliculaNegocio;        
        this.funcion = funcionNegocio;      
        this.pelicula1 = pelicula;
        initComponents();
        cargarConfiguracionInicialTablaFunciones();
        llenarTablaPeliculas(buscarFuncionesTabla(pelicula));
    }

    private void cargarConfiguracionInicialTablaFunciones() { 
        
        ActionListener onEditarClickListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
               comprarBoleto(buscarFuncionesTabla(pelicula1)); 
                
            }               
        };
            
        TableColumnModel modeloColumnas = this.tblFuncion.getColumnModel();
        modeloColumnas.getColumn(5).setCellRenderer(new JButtonRenderer("Comprar"));
        modeloColumnas.getColumn(5).setCellEditor(new JButtonCellEditor("Comprar",onEditarClickListener));
    }    
    
    
    private List<FuncionDTO> buscarFuncionesTabla(String pelicula) {
        List<FuncionDTO> funcionLista = null;
        try {
            
            funcionLista = this.funcion.buscarFuncionesTabla(pelicula);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return funcionLista;
    }      
        
    private void llenarTablaPeliculas(List<FuncionDTO> funcionesLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblFuncion.getModel();

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
                fila[2] = row.getAsientosdisponibles();
                fila[3] = row.getSala();
                fila[4] = row.getPrecio();

                modeloTabla.addRow(fila);
            });
        }
    }
    
        
    private int buscarIdFuncion(Timestamp date, String nombre, String titulo) throws NegocioException{

        int idFuncion;
        return idFuncion = funcion.buscarIdFuncion(date, nombre, titulo);
    }
             
       
    private void comprarBoleto(List<FuncionDTO> funcionesLista) {
                    
        IClienteDAO clientes = this.cliente;
        ICiudadNegocio ciudads = this.ciudad;
        ISucursalNegocio sucursals = this.sucursal;
        IPeliculaNegocio peliculas = this.pelicula;
        IFuncionNegocio funcions = this.funcion;
        int idFuncion;
        int i = this.tblFuncion.getSelectedRow();
        FuncionDTO fila = funcionesLista.get(i);
        //idFuncion = buscarIdFuncion(fila.getDuracion(), fila.getSala(), fila.getTitulo());
        frmBoletos x = new frmBoletos(clientes, ciudads, sucursals, peliculas, funcions, fila);
        x.setVisible(true);
        setVisible(false);
     
                
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("Guardar");

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblFuncion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Fecha", "Asientos Disponibles", "Sala", "Precio", "Comprar"
            }
        ));
        jScrollPane1.setViewportView(tblFuncion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnAtras))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(622, 622, 622)
                                .addComponent(btnGuardar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGuardar))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncion;
    // End of variables declaration//GEN-END:variables
}
