/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import dtos.ReporteSucursalDTO;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ICiudadNegocio;
import negocio.IClienteNegocio;
import negocio.IFuncionNegocio;
import negocio.IPeliculaNegocio;
import negocio.IReporteNegocio;
import negocio.ISucursalNegocio;
import negocio.NegocioException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author santi
 */
public class frmReporteSucursal extends javax.swing.JFrame {

    private IClienteNegocio cliente;
    private ICiudadNegocio ciudad;
    private ISucursalNegocio sucursal;
    private IPeliculaNegocio pelicula;
    private IFuncionNegocio funcion;   
    private IReporteNegocio reporte;
    
    /**
     * Creates new form frmReporteSucursal
     */
    public frmReporteSucursal(IClienteNegocio cliente, ICiudadNegocio ciudad, ISucursalNegocio sucursal, IPeliculaNegocio pelicula, IFuncionNegocio funcion, IReporteNegocio reporte) {
        this.cliente = cliente;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.pelicula = pelicula;
        this.funcion = funcion;
        this.reporte = reporte;
        initComponents();
    }

    
    private List<ReporteSucursalDTO> buscarFuncionesTabla(Timestamp desde, Timestamp hasta) {
        List<ReporteSucursalDTO> reporteLista = null;
        try {
            
            reporteLista = this.reporte.buscarReporteSucursalTabla(desde, hasta);


        } catch (NegocioException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Información", JOptionPane.ERROR_MESSAGE);
        }

        return reporteLista;
    }      

    private void generarReporte(Timestamp desde, Timestamp hasta){

        String dest = "reporte.pdf";

        try {

            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);


            document.add(new Paragraph("Reporte de ventas de las sucursales del siguiente periodo desde: " + desde.toString()+ " hasta: " + hasta.toString()));


            List<ReporteSucursalDTO> lista = buscarFuncionesTabla(desde, hasta);
            float[] columnWidths = {200, 200, 200};
            Table table = new Table(columnWidths);

            if (lista != null) {
                lista.forEach(row -> {

                String costo = "$" + row.getCosto();    
                String cantidad = row.getCantidadBoletos()+ " boletos";    
                table.addCell(row.getNombreSucursal());
                table.addCell(cantidad);
                table.addCell(costo);


            });
        }
                    

            document.add(table);

            // Cerrar el Document
            document.close();

            System.out.println("¡Reporte generado con éxito!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();    
    
    }
    
    
    }  
     
    public Timestamp stringATimestamp (String time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(time, formatter);
        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        return timestamp;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fldFechaDesde = new javax.swing.JTextField();
        fldFechaHasta = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reporte Sucursales");

        jLabel2.setText("Desde");

        jLabel3.setText("Desde");

        fldFechaDesde.setText("YYYY-MM-DD");

        fldFechaHasta.setText("YYYY-MM-DD");

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fldFechaHasta, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                    .addComponent(fldFechaDesde))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldFechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldFechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnGenerar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        IClienteNegocio cliente = this.cliente;
        ICiudadNegocio ciudad = this.ciudad;
        IPeliculaNegocio pelicula = this.pelicula;
        IFuncionNegocio funcion = this.funcion;
        IReporteNegocio reporte = this.reporte;
        
        frmLogin x = new frmLogin(cliente, ciudad, sucursal, pelicula, funcion, reporte);
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:
        String desdeAUX = this.fldFechaDesde.getText();
        String hastaAUX = this.fldFechaHasta.getText();
        Timestamp desde = stringATimestamp(desdeAUX);
        Timestamp hasta = stringATimestamp(hastaAUX);
        
        generarReporte(desde, hasta);
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JTextField fldFechaDesde;
    private javax.swing.JTextField fldFechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
