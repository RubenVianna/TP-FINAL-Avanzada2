/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author Julian
 */
public class Areas extends javax.swing.JPanel {
private Controlador controlador;
    /**
     * Creates new form Areas
     */
    public Areas() {
        initComponents();
    }
    
      public Areas(Controlador crt){ 
        this();
        this.controlador=crt;
        this.cargarTablaArea();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAreas = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTramites = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion de Areas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel2.setText("ID:");

        jLabel3.setText("Area:");

        tablaAreas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAreas);

        txtArea.setEnabled(false);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.setEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Listado de Areas");

        tablaTramites.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaTramites);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tramites Realizados en el Area:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Empleados del Area");

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(txtArea, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addComponent(jLabel4)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(194, 194, 194))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBuscar)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botonModificar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonGuardar)
                            .addComponent(botonNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregar)
                            .addComponent(botonEliminar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
         int ban=0;
       if (txtArea.getText().isEmpty()){
           ban=1;
            JOptionPane.showMessageDialog(this, "El campo Area est?? vacio", "Error", ERROR_MESSAGE);
       }else{
            char []caracteres = txtArea.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isDigit(caracteres[i]) == true ){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar letras en el campo Area", "Error", ERROR_MESSAGE);
            }
        }
       }
        
        if (ban==0){
        Area are = new Area (txtArea.getText());
      //  this.controlador.addArea(are);
        this.controlador.persistirArea(are); 
        JOptionPane.showMessageDialog(this, "El Area fue cargada existosamente ", "Aviso", INFORMATION_MESSAGE);
        this.cargarTablaArea();
        txtArea.setEnabled(false);
        botonAgregar.setEnabled(false);
        txtArea.setText("");
        txtId.setText("");
        botonBuscar.setEnabled(true);
        botonNuevo.setEnabled(true);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
          int ban=0;
        if (txtId.getText().isEmpty()){
         ban=1;   
         JOptionPane.showMessageDialog(this, "El campo id est?? vacio", "Error", ERROR_MESSAGE);
         
        }else{
            char []caracteres = txtId.getText().toCharArray();
        
        for(int i=0; i< caracteres.length; i++){
            if( Character.isDigit(caracteres[i]) == false ){
                ban=1;
                JOptionPane.showMessageDialog(this, "Error, solo puede ingresar numeros en el campo id", "Error", ERROR_MESSAGE);
            }
        }
        }                     
        
        if (ban==0){
       
       int id = Integer.parseInt(txtId.getText());
       Area are = this.controlador.buscarArea(id);
        
       if (are == null){
           JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ning??n Area ya registrada ", "Error", ERROR_MESSAGE);
           
       }else{
           txtArea.setText(are.getNombreArea());
           botonModificar.setEnabled(true);   
           botonEliminar.setEnabled(true);
           this.cargarTablas();
       }
        }
        
        botonAgregar.setEnabled(false);
  
     botonNuevo.setEnabled(true);
    
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
      txtArea.setEnabled(true);
      botonEliminar.setEnabled(true);
      botonModificar.setEnabled(false);
      botonGuardar.setEnabled(true);
      botonNuevo.setEnabled(false);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       int ban=0;
       if (txtArea.getText().isEmpty()){
           ban=1;
            JOptionPane.showMessageDialog(this, "El campo Area est?? vacio", "Error", ERROR_MESSAGE);
       }
        
        if (ban==0){
        int id= Integer.parseInt(txtId.getText());
        Area are= this.controlador.buscarArea(id);
        
       if (are == null){
           JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ning??n Area registrada ", "Error", ERROR_MESSAGE);
           
       }else{
           String nombreArea = String.valueOf(txtArea.getText());
           are.setNombreArea(nombreArea);
           this.controlador.actualizarArea(are);
           JOptionPane.showMessageDialog(this, "El Area fue actualizada existosamente ", "Aviso", INFORMATION_MESSAGE);
           botonGuardar.setEnabled(false);  
           txtId.setText("");
           txtArea.setText("");
           botonNuevo.setEnabled(true);
           botonEliminar.setEnabled(false);
           this.cargarTablaArea();
       }
          
           
       }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int ban=0;
        if (txtId.getText().isEmpty()){
         ban=1;   
         JOptionPane.showMessageDialog(this, "El campo id est?? vacio", "Error", ERROR_MESSAGE);
         
        }else{
            char []caracteres = txtId.getText().toCharArray();
        
        for(int i=0; i< caracteres.length; i++){
            if( Character.isDigit(caracteres[i]) == false ){
                ban=1;
                JOptionPane.showMessageDialog(this, "Error, solo puede ingresar numeros en el campo id", "Error", ERROR_MESSAGE);
            }
        }
        }                     
        
        if (ban==0){
        
            int id = Integer.parseInt(txtId.getText());
           Area are= this.controlador.buscarArea(id);
            if (are == null){
                JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ning??n Area registrada ", "Error", ERROR_MESSAGE);

            }else{
                this.controlador.eliminarArea(are);
                JOptionPane.showMessageDialog(this, "El Area fue eliminada existosamente ", "Aviso", INFORMATION_MESSAGE);
                this.cargarTablaArea();
                txtId.setText("");
                txtArea.setText("");

            }

            botonModificar.setEnabled(false);
            botonAgregar.setEnabled(false);
            botonEliminar.setEnabled(false);
            botonGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
       txtArea.setText("");
       txtId.setText("");
       txtArea.setEnabled(true);
       botonAgregar.setEnabled(true);
       botonNuevo.setEnabled(false);
       botonBuscar.setEnabled(false);
    }//GEN-LAST:event_botonNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaAreas;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaTramites;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

public void cargarTablaArea(){
      
     // Carga de la tabla de Areas
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");//0
        modelo.addColumn("Area");//1
       
       
     List<Area> areas = this.controlador.ListarAreas();
        
        modelo.setRowCount(areas.size());
        
        for(int i = 0; i < areas.size(); i++){
            
            modelo.setValueAt(areas.get(i).getId_area(), i, 0);
            modelo.setValueAt(areas.get(i).getNombreArea(), i, 1);
       
        }
        this.tablaAreas.setModel(modelo);                   
                                   
 }

    public void cargarTablas(){
        	int id_area = Integer.parseInt(txtId.getText());
        Area unArea = this.controlador.buscarArea(id_area); 
        // Carga de la tabla Tramites
        DefaultTableModel modelo2 = new DefaultTableModel();
        modelo2.addColumn("Id");//0
        modelo2.addColumn("Tramite");//1
       
        if(unArea!= null){
            List<Tramite> tramites = this.controlador.ListarTramitesArea(id_area);
        
          modelo2.setRowCount(tramites.size());
        
        for(int i = 0; i < tramites.size(); i++){
            
            modelo2.setValueAt(tramites.get(i).getId_Tramite(), i, 0);
            modelo2.setValueAt(tramites.get(i).getNombreTramite(), i, 1);                                  
        }
        this.tablaTramites.setModel(modelo2);
        modelo2=null;
        
        // Carga de la tabla Empleados
        DefaultTableModel modelo3 = new DefaultTableModel();
        modelo3.addColumn("Id");//0
        modelo3.addColumn("Nombre");//1
        modelo3.addColumn("Apellido");//2
       
        List<Empleado> empleados = this.controlador.ListarEmpleadosArea(id_area);
        modelo3.setRowCount(empleados.size());
        
        for(int i = 0; i < empleados.size(); i++){
            
            modelo3.setValueAt(empleados.get(i).getId_empleado(), i, 0);
            modelo3.setValueAt(empleados.get(i).getNombre(), i, 1);  
            modelo3.setValueAt(empleados.get(i).getApellido(), i, 2);
        }
        this.tablaEmpleados.setModel(modelo3);
        modelo3=null;   
        }
          
    }
}
