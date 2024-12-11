package forms;

import controller.ctrLinea;
import controller.ctrMarca;
import controller.ctrPrecioPieza;
import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cargarCombo;
import model.mdlLinea;
import model.mdlPrecioPorPieza;

/**
 *
 * @author alsan
 */
public class frmPrecioporServicio extends javax.swing.JInternalFrame {

    //private JComboBox<ctrMarca> cboMarca;
    public frmPrecioporServicio() {
        initComponents();
        inhabilitar();
        mostrar("");
        cargarCombo(new cargarCombo(), cboMarca);
    }

    public static void cargarCombo(cargarCombo mar, JComboBox<ctrMarca> combo) {
// Obtener la lista de ctrMarca 
        List<ctrMarca> marcas = mar.mostrarMarca();
// Crear el DefaultComboBoxModel y añadir los elementos 
        DefaultComboBoxModel<ctrMarca> modelo = new DefaultComboBoxModel<>();
        for (ctrMarca marca : marcas) {
            modelo.addElement(marca);
        } // Asignar el modelo al JComboBox existente 
        combo.setModel(modelo);
    }

    private String accion = "guardar";
    public static int idValor;

    // Aquí estamos ocultando el indice 0 de la tabla osea el ID
    void ocultar_columnas() {
        tblListados.getColumnModel().getColumn(0).setMaxWidth(0);
        tblListados.getColumnModel().getColumn(0).setMinWidth(0);
        tblListados.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    /* METODO PARA MOSTRAR E INHABILITAR CAJAS DE TEXTO */
    void inhabilitar() {
        txtIdValor.setVisible(false);
        cboMarca.setEnabled(false);
        cboLinea.setEnabled(false);
        cboModelo.setEnabled(false);
        cboPieza.setEnabled(false);
        cboProceso.setEnabled(false);
        txtPrecio.setEnabled(false);

        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }

    void habilitar() {
        txtIdValor.setVisible(false);
        cboMarca.setEnabled(true);
        cboLinea.setEnabled(true);
        cboModelo.setEnabled(true);
        cboPieza.setEnabled(true);
        cboProceso.setEnabled(true);
        txtPrecio.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnEliminar.setEnabled(true);

        txtPrecio.setText("");
    }

    void mostrar(String buscar) {
        try {

            DefaultTableModel modelo;
            mdlPrecioPorPieza func = new mdlPrecioPorPieza();
            modelo = func.mostrar(buscar);

            tblListados.setModel(modelo);
            ocultar_columnas();
            lblTotalregistros.setText("Total Registros" + " " + Integer.toString(func.totalregistros));

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(rootPane, e);

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

        borderPanel1 = new components.BorderPanel();
        borderPanel2 = new components.BorderPanel();
        borderPanel3 = new components.BorderPanel();
        jLabel1 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboModelo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboLinea = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cboPieza = new javax.swing.JComboBox<>();
        txtIdValor = new javax.swing.JTextField();
        borderPanel4 = new components.BorderPanel();
        jLabel4 = new javax.swing.JLabel();
        cboProceso = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        borderPanel5 = new components.BorderPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListados = new javax.swing.JTable();
        lblTotalregistros = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        javax.swing.GroupLayout borderPanel1Layout = new javax.swing.GroupLayout(borderPanel1);
        borderPanel1.setLayout(borderPanel1Layout);
        borderPanel1Layout.setHorizontalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        borderPanel1Layout.setVerticalGroup(
            borderPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        borderPanel3.setBackground(new java.awt.Color(255, 255, 255));
        borderPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos vehículo"));

        jLabel1.setText("Marca:");

        cboMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMarcaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Módelo:");

        cboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        jLabel3.setText("Línea:");

        cboLinea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLineaItemStateChanged(evt);
            }
        });

        jLabel6.setText("Pieza:");

        cboPieza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Capó", "Guarda barros delantero Izquierdo", "Guarda barros delantero Derecho", "Bomper delantero", "Puerta delantera Izquierda", "Puerta delantera Derecha", "Puerta trasera Izquierda", "Puerta trasera Derecha", "Nave trasera Derecha", "Nave trasera Izquierda", "Capota", "Tapa Maleta", "Bomper trasero", "Vidrio delantero", "Vidrio trasero", "Punta Chasis delantera izquierda", "Punta Chasis delantera derecha", "Motor", "Persiana", "Farola derecha", "Farola izquierda", "Stop derecho", "Stop izquierdo" }));

        javax.swing.GroupLayout borderPanel3Layout = new javax.swing.GroupLayout(borderPanel3);
        borderPanel3.setLayout(borderPanel3Layout);
        borderPanel3Layout.setHorizontalGroup(
            borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderPanel3Layout.createSequentialGroup()
                        .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboMarca, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboLinea, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboPieza, javax.swing.GroupLayout.Alignment.LEADING, 0, 212, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        borderPanel3Layout.setVerticalGroup(
            borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(borderPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboPieza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        borderPanel4.setBackground(new java.awt.Color(255, 255, 255));
        borderPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));

        jLabel4.setText("Tipo proceso:");

        cboProceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Cambiar", "Pintar", "Enderezar", "Desmontar" }));

        jLabel5.setText("Precio $:");

        javax.swing.GroupLayout borderPanel4Layout = new javax.swing.GroupLayout(borderPanel4);
        borderPanel4.setLayout(borderPanel4Layout);
        borderPanel4Layout.setHorizontalGroup(
            borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        borderPanel4Layout.setVerticalGroup(
            borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(borderPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        borderPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblListados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblListados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListados);

        javax.swing.GroupLayout borderPanel5Layout = new javax.swing.GroupLayout(borderPanel5);
        borderPanel5.setLayout(borderPanel5Layout);
        borderPanel5Layout.setHorizontalGroup(
            borderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        borderPanel5Layout.setVerticalGroup(
            borderPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTotalregistros.setText("Total registros:");

        btnNuevo.setBackground(new java.awt.Color(0, 51, 255));
        btnNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new_file.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 0));
        btnGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save_folder.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/page-found.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout borderPanel2Layout = new javax.swing.GroupLayout(borderPanel2);
        borderPanel2.setLayout(borderPanel2Layout);
        borderPanel2Layout.setHorizontalGroup(
            borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderPanel2Layout.createSequentialGroup()
                        .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borderPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(borderPanel2Layout.createSequentialGroup()
                                .addComponent(borderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(borderPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))
                    .addGroup(borderPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir)
                        .addGap(32, 32, 32)
                        .addComponent(lblTotalregistros)
                        .addContainerGap(180, Short.MAX_VALUE))))
        );
        borderPanel2Layout.setVerticalGroup(
            borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(borderPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borderPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(borderPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(borderPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalregistros)
                            .addComponent(btnSalir)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(borderPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(borderPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMarcaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            ctrMarca mar = (ctrMarca) cboMarca.getSelectedItem();
            mdlLinea linea = new mdlLinea();
            DefaultComboBoxModel<ctrLinea> modlLinea = new DefaultComboBoxModel<>(linea.mostrarLineas(mar.getIDmarca()));
            cboLinea.setModel(modlLinea);
        }
    }//GEN-LAST:event_cboMarcaItemStateChanged

    // Este evento no se necesita
    private void cboLineaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLineaItemStateChanged
        // TODO add your handling code here:
        /*if (evt.getStateChange() == ItemEvent.SELECTED) {
            ctrMarca mar = (ctrMarca) cboMarca.getSelectedItem();
            
            mdlLinea linea = new mdlLinea();
            DefaultComboBoxModel modlLinea = new DefaultComboBoxModel(linea.mostrarLineas(mar.getIDmarca()));
            
            cboLinea.setModel(modlLinea);
            
        } */
    }//GEN-LAST:event_cboLineaItemStateChanged

    //Botón acción guardar
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnGuardar.setText("Guardar");
        accion = "guardar";

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (cboMarca.getSelectedItem().toString().equals("Selecciona una opción")) {
            JOptionPane.showConfirmDialog(null, "Debes seleccionar una marca");
            cboMarca.requestFocus();
            return;
        }

        if (cboModelo.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showConfirmDialog(null, "Debes seleccionar un módelo");
            cboModelo.requestFocus();
            return;
        }

        if (cboPieza.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showConfirmDialog(null, "Debes seleccionar una pieza del vehículo");
            cboPieza.requestFocus();
            return;
        }

        if (cboProceso.getSelectedItem().toString().equals("Seleccione")) {
            JOptionPane.showConfirmDialog(null, "Debes seleccionar un proceso a ejecutar");
            cboProceso.requestFocus();
            return;
        }

        if (txtPrecio.getText().length() == 0) {
            JOptionPane.showConfirmDialog(null, "Debes ingresar el precio del servicio");
            txtPrecio.requestFocus();
            return;
        }

        ctrPrecioPieza dts = new ctrPrecioPieza();
        mdlPrecioPorPieza func = new mdlPrecioPorPieza();

        /* pasamos la informacion que viene de las cajas de texto y recibe los datos por el metod Setter */
        int seleccionado = cboMarca.getSelectedIndex();
        dts.setMarca(cboMarca.getItemAt(seleccionado).toString());

        int seleccion = cboLinea.getSelectedIndex();
        dts.setLinea(cboLinea.getItemAt(seleccion).toString());
        
        int seleccionModelo = cboModelo.getSelectedIndex();
        dts.setModelo(cboModelo.getItemAt(seleccionModelo));
        
        int seleccionPieza = cboPieza.getSelectedIndex();
        dts.setPieza(cboPieza.getItemAt(seleccionPieza));
        
        int seleccionProceso = cboProceso.getSelectedIndex();
        dts.setServicio(cboProceso.getItemAt(seleccionProceso));
        
        dts.setValor(Double.parseDouble(txtPrecio.getText()));

        /* PREGUNTAMOS QUE ACCION VAMOS A EJECUTAR */
        if (accion.equals("guardar")) {

            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El registro fue guardado con éxito");
                mostrar("");
                inhabilitar();
            }
        } else if (accion.equals("editar")) {
            dts.setIdValor(Integer.parseInt(txtIdValor.getText()));

            if (func.editar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El registro fué modificado con éxito");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblListadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadosMouseClicked
        // TODO add your handling code here:
        btnGuardar.setText("Editar");
        habilitar();
        btnEliminar.setEnabled(true);
        accion = "editar";

        /* ALMACENAMOS EN UNA VARIABLE LA FILA DONDE HACEMOS CLICK */
        int fila = tblListados.rowAtPoint(evt.getPoint());

        //ALMACENAMOS EN UNA VARIABLE LA FILA DONDE HACEMOS CLICK 
        txtIdValor.setText(tblListados.getValueAt(fila, 0).toString());
        cboMarca.setSelectedItem(tblListados.getValueAt(fila, 1).toString());
        cboLinea.setSelectedItem(tblListados.getValueAt(fila, 2).toString());
        cboModelo.setSelectedItem(tblListados.getValueAt(fila, 3).toString());
        cboPieza.setSelectedItem(tblListados.getValueAt(fila, 4).toString());
        cboProceso.setSelectedItem(tblListados.getValueAt(fila, 5).toString());
        txtPrecio.setText(tblListados.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tblListadosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrecioporServicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrecioporServicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrecioporServicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrecioporServicio.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrecioporServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.BorderPanel borderPanel1;
    private components.BorderPanel borderPanel2;
    private components.BorderPanel borderPanel3;
    private components.BorderPanel borderPanel4;
    private components.BorderPanel borderPanel5;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JComboBox<ctrLinea> cboLinea;
    public static javax.swing.JComboBox<ctrMarca> cboMarca;
    private javax.swing.JComboBox<String> cboModelo;
    private javax.swing.JComboBox<String> cboPieza;
    private javax.swing.JComboBox<String> cboProceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalregistros;
    private javax.swing.JTable tblListados;
    private javax.swing.JTextField txtIdValor;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
