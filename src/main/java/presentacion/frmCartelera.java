/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.PeliculaDTO;
import dtos.SucursalDTO;
import dtos.ciudadDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import negocio.ICiudadNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import utilerias.JButtonRenderer;
import persistencia.IClienteDAO;
import utilerias.JButtonCellEditor;

/**
 *
 * @author santi
 */
public class frmCartelera extends javax.swing.JFrame {

    IClienteDAO cliente = this.cliente;
    ICiudadNegocio ciudad = this.ciudad;
    ISucursalNegocio sucursal = this.sucursal;
    IPeliculaNegocio pelicula = this.pelicula;
    IFuncionNegocio funcion = this.funcion;
    /**
     * Creates new form frmLogin
     */
    public frmCartelera(IClienteDAO cliente, ICiudadNegocio ciudadNegocio, ISucursalNegocio sucursalNegocio, IPeliculaNegocio peliculaNegocio, IFuncionNegocio funcion) {
        this.cliente = cliente;
        this.ciudad = ciudadNegocio;
        this.sucursal = sucursalNegocio;
        this.pelicula = peliculaNegocio;
        this.funcion = funcion;
        initComponents();
        llenarBoxCiudades(buscarCiudadTabla());
        cargarConfiguracionInicialTablaCartelera();
    }
    
    
    
    private List<ciudadDTO> buscarCiudadTabla() {
        List<ciudadDTO> ciudadLista = null;
        try {
            
            ciudadLista = this.ciudad.buscarCiudadTabla();


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return ciudadLista;
    }  
    
    private void cargarConfiguracionInicialTablaCartelera() { 
        
        ActionListener onEditarClickListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            funcionesPelicula();
            }               
        };
            
        TableColumnModel modeloColumnas = this.tblPelicula.getColumnModel();
        modeloColumnas.getColumn(7).setCellRenderer(new JButtonRenderer("Funciones"));
        modeloColumnas.getColumn(7).setCellEditor(new JButtonCellEditor("Funciones",onEditarClickListener));
    }
    
    private void funcionesPelicula(){
                    
        IClienteDAO cliente = this.cliente;        
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IFuncionNegocio funcion = this.funcion;
        
        String pelicula1 = (String) tblPelicula.getValueAt(tblPelicula.getSelectedRow(), 0);
        
        frmFunciones x = new frmFunciones(cliente, ciudad, sucursal, pelicula, funcion, pelicula1);
        x.setVisible(true);
        setVisible(false);        
                
    }
    
    private List<SucursalDTO> buscarSucursalTabla(int idCiudad) {
        List<SucursalDTO> sucursalLista = null;
        try {
            
            sucursalLista = this.sucursal.buscarSucursalTabla(idCiudad);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return sucursalLista;
    }      
    
    private void llenarBoxCiudades(List<ciudadDTO> ciudadLista) {
        int i = 0;
        while (ciudadLista.size() > i) {
            boxCiudad.addItem(ciudadLista.get(i).getNombre());
            i++;
        }
    }    
    
    private void llenarBoxSucursal(List<SucursalDTO> sucursalLista) {
        int i = 0;
        boxSucursal.removeAllItems();
        while (sucursalLista.size() > i) {
            boxSucursal.addItem(sucursalLista.get(i).getNombre());
            i++;
        }
    }      

    private void llenarTablaPeliculas(List<PeliculaDTO> peliculasLista) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPelicula.getModel();

        if (modeloTabla.getRowCount() > 0) {
            for (int i = modeloTabla.getRowCount() - 1; i > -1; i--) {
                modeloTabla.removeRow(i);
            }
        }

        if (peliculasLista != null) {
            peliculasLista.forEach(row -> {
                Object[] fila = new Object[7];
                fila[0] = row.getTitulo();
                fila[1] = row.getClasificacion();
                fila[2] = row.getGenero();
                fila[3] = row.getDuracion();
                fila[4] = row.getPais();
                fila[5] = row.getTrailer();
                fila[6] = row.getSinopsis();

                modeloTabla.addRow(fila);
            });
        }
    }
         
    private void cargarPeliculasEnTabla(int idSucursal) {
        try {
            List<PeliculaDTO> peliculas = this.pelicula.buscarPeliculaTabla(idSucursal);
            this.llenarTablaPeliculas(peliculas);
        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
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

        btnAtras = new javax.swing.JButton();
        boxCiudad = new javax.swing.JComboBox<>();
        boxSucursal = new javax.swing.JComboBox<>();
        btnACiudad = new javax.swing.JButton();
        btnASucursal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelicula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        boxCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCiudadActionPerformed(evt);
            }
        });

        boxSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSucursalActionPerformed(evt);
            }
        });

        btnACiudad.setText("Aceptar");
        btnACiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACiudadActionPerformed(evt);
            }
        });

        btnASucursal.setText("Aceptar");
        btnASucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnASucursalActionPerformed(evt);
            }
        });

        tblPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Clasificación", "Género", "Duración", "País", "Trailer", "Sinopsis", "Función"
            }
        ));
        jScrollPane1.setViewportView(tblPelicula);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(boxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnACiudad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnASucursal))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnACiudad)
                    .addComponent(btnASucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        IClienteDAO cliente = this.cliente;        
        ICiudadNegocio ciudad = this.ciudad;
        ISucursalNegocio sucursal = this.sucursal;
        IPeliculaNegocio pelicula = this.pelicula;
        IFuncionNegocio funcion = this.funcion;
        
        frmLogin x = new frmLogin(cliente, ciudad, sucursal, pelicula, funcion);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void boxCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCiudadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPelicula.getModel();
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_boxCiudadActionPerformed

    private void btnACiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACiudadActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPelicula.getModel();
        modeloTabla.setRowCount(0);
        int idCiudad = boxCiudad.getSelectedIndex() + 1;
        llenarBoxSucursal(buscarSucursalTabla(idCiudad));
        tblPelicula.clearSelection();
        
    }//GEN-LAST:event_btnACiudadActionPerformed

    private void boxSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSucursalActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPelicula.getModel();
        modeloTabla.setRowCount(0);

    }//GEN-LAST:event_boxSucursalActionPerformed

    private void btnASucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnASucursalActionPerformed
        // TODO add your handling code here: 
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblPelicula.getModel();
        modeloTabla.setRowCount(0);        
        int idSucursal = boxSucursal.getSelectedIndex() + 1;  
        cargarPeliculasEnTabla(idSucursal);
    }//GEN-LAST:event_btnASucursalActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCiudad;
    private javax.swing.JComboBox<String> boxSucursal;
    private javax.swing.JButton btnACiudad;
    private javax.swing.JButton btnASucursal;
    private javax.swing.JButton btnAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPelicula;
    // End of variables declaration//GEN-END:variables
}
