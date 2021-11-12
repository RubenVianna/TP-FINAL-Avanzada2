/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.exceptions.NonexistentEntityException;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import modelo.Area;
import modelo.Empleado;
import modelo.Tramite;

/**
 *
 * @author Usuario
 */
public class GestionEmpleados extends javax.swing.JPanel {
private Controlador controlador;
    /**
     * Creates new form GestionEmpleados
     */
    public GestionEmpleados() {
        initComponents();
    }
    
    public GestionEmpleados(Controlador crt) {
        this();
        this.controlador=crt;
        this.cargarComboAreas();
        this.cargarTablaEmpleados();
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
        botonNuevo = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        comboAreas = new javax.swing.JComboBox<>();
        checkArea = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestion de Empleados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

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

        botonEliminar.setText("Eliminar");
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonAgregar)
                    .addComponent(botonModificar)
                    .addComponent(botonGuardar)
                    .addComponent(botonEliminar))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jLabel2.setText("Id:");

        jLabel3.setText("DNI");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Telefono");

        jLabel7.setText("Direccion");

        txtDni.setEnabled(false);

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtTelefono.setEnabled(false);

        txtDireccion.setEnabled(false);

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Area:");

        comboAreas.setEnabled(false);

        checkArea.setText("Modificar el Area asignada del empleado");
        checkArea.setEnabled(false);
        checkArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAreaActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablaEmpleados);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Listado de Empleados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDni)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono)
                                            .addComponent(txtDireccion))))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(checkArea))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(botonBuscar))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel9)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(checkArea)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        int ban=0;
        if (txtId.getText().isEmpty()){
         ban=1;   
         JOptionPane.showMessageDialog(this, "El campo id está vacio", "Error", ERROR_MESSAGE);
         
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
            Empleado em = this.controlador.buscarEmpleado(id);

            if (em == null){
                JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ningún Empleado registrado ", "Error", ERROR_MESSAGE);

            }else{
                String dni = String.valueOf(em.getDni());
                txtDni.setText(dni);
                txtNombre.setText(em.getNombre());
                txtApellido.setText(em.getApellido());
                txtTelefono.setText(em.getTelefono());
                txtDireccion.setText(em.getDireccion());
                botonModificar.setEnabled(true);   
                botonEliminar.setEnabled(true);
            }
        }
        
        botonAgregar.setEnabled(false);
  
     botonNuevo.setEnabled(true);
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtId.setText("");
        txtDni.setEnabled(true);
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtDireccion.setEnabled(true);
        botonEliminar.setEnabled(false);
        botonAgregar.setEnabled(true);
        botonNuevo.setEnabled(false);
        botonBuscar.setEnabled(false);
        comboAreas.setEnabled(true);                                        
                                              
  
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int ban=0;
        if (txtId.getText().isEmpty()){
         ban=1;   
         JOptionPane.showMessageDialog(this, "El campo id está vacio", "Error", ERROR_MESSAGE);
         
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
            Empleado emp = this.controlador.buscarEmpleado(id);
            if (emp != null){
               Area are= emp.getArea();
               List <Empleado> empleados = are.getEmpleados();
               for (int i=0; i < empleados.size(); i++){
                   if(empleados.get(i).getId_empleado()== emp.getId_empleado()){
                      empleados.remove(i);
                   }
               }

               this.controlador.eliminarEmpleado(emp);
                JOptionPane.showMessageDialog(this, "El Empleado fue eliminado existosamente ", "Aviso", INFORMATION_MESSAGE);
                this.cargarTablaEmpleados();
                txtDni.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtDireccion.setText("");
                txtId.setText("");
                botonEliminar.setEnabled(false);
               // this.controlador.removerEmpleado(emp);
            }else{
             JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ningún Empleado registrado ", "Error", ERROR_MESSAGE);

            }
        }
        botonModificar.setEnabled(false);
        botonAgregar.setEnabled(false);
        
        botonGuardar.setEnabled(false);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
      botonEliminar.setEnabled(true);
      botonModificar.setEnabled(false);
      botonGuardar.setEnabled(true);
      botonNuevo.setEnabled(false);
      txtDni.setEnabled(true);
      txtNombre.setEnabled(true);
      txtApellido.setEnabled(true);
      txtTelefono.setEnabled(true);
      txtDireccion.setEnabled(true);
      checkArea.setEnabled(true);
      
    }//GEN-LAST:event_botonModificarActionPerformed

    private void checkAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAreaActionPerformed
        if(checkArea.isSelected()==true){
            comboAreas.setEnabled(true);
        }else{
            comboAreas.setEnabled(false);
        }
    }//GEN-LAST:event_checkAreaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       int ban=0;
       char []caracteres = txtDni.getText().toCharArray();
   
        for(int i=0; i< caracteres.length; i++){
            if( Character.isDigit(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar numeros en el campo DNI ", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtNombre.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar letras en el campo Nombre ", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtApellido.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar letras en el campo Apellido", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtTelefono.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == true){
                ban=1;
                JOptionPane.showMessageDialog(this, "No debe ingresar letras en el campo Telefono ", "Error", ERROR_MESSAGE);
            }
        }
        if(txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty()){
           ban = 1; 
           JOptionPane.showMessageDialog(this, "No deben quedar campos vacios", "Error", ERROR_MESSAGE);
        }
        
        if (ban==0){
        int id= Integer.parseInt(txtId.getText());
        Empleado emp= this.controlador.buscarEmpleado(id);
        emp.setDni(Integer.parseInt(txtDni.getText()));
        emp.setNombre(txtNombre.getText());
        emp.setApellido(txtApellido.getText());
        emp.setDireccion(txtDireccion.getText());
        emp.setTelefono(txtTelefono.getText());
            if (emp == null){
                JOptionPane.showMessageDialog(this, "El id ingresado no corresponde con ningún Empleado registrado ", "Error", ERROR_MESSAGE);

            }else{
                if (checkArea.isSelected()==true){
                   String nombreArea = (String) comboAreas.getSelectedItem();
                   emp.getArea().quitarEmpleado(emp);
                   Area are = this.controlador.buscarArea(nombreArea);
                   emp.setArea(are);
                   are.addEmpleado(emp);
                 // this.controlador.actualizarArea(are);
               }
               this.controlador.actualizarEmpleado(emp);
               JOptionPane.showMessageDialog(this, "El Empleado fue actualizado existosamente ", "Aviso", INFORMATION_MESSAGE);
               botonGuardar.setEnabled(false);  
               txtDni.setText("");
               txtNombre.setText("");
               txtApellido.setText("");
               txtTelefono.setText("");
               txtDireccion.setText("");
               txtId.setText("");
               
               txtDni.setEnabled(false);
               txtNombre.setEnabled(false);
               txtApellido.setEnabled(false);
               txtTelefono.setEnabled(false);
               txtDireccion.setEnabled(false);
               
               botonNuevo.setEnabled(true);
               botonEliminar.setEnabled(false);
               this.cargarTablaEmpleados();
               checkArea.setEnabled(false);
               
               comboAreas.setEnabled(false);
               
               botonAgregar.setEnabled(false);
               
            }         
         
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
       int ban=0;
       char []caracteres = txtDni.getText().toCharArray();
   
        for(int i=0; i< caracteres.length; i++){
            if( Character.isDigit(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar numeros en el campo DNI ", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtNombre.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar letras en el campo Nombre ", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtApellido.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == false){
                ban=1;
                JOptionPane.showMessageDialog(this, "Solo debe ingresar letras en el campo Apellido", "Error", ERROR_MESSAGE);
            }
        }
        
        caracteres = txtTelefono.getText().toCharArray();
        for(int i=0; i< caracteres.length; i++){
            if( Character.isLetter(caracteres[i]) == true){
                ban=1;
                JOptionPane.showMessageDialog(this, "No debe ingresar letras en el campo Telefono ", "Error", ERROR_MESSAGE);
            }
        }
        if(txtDni.getText().isEmpty() || txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty()){
           ban = 1; 
           JOptionPane.showMessageDialog(this, "No deben quedar campos vacios", "Error", ERROR_MESSAGE);
        }
        
        if (ban==0){
        Empleado emp = new Empleado();
        int dni = Integer.parseInt(txtDni.getText());
        emp.setDni(dni);
        emp.setNombre(txtNombre.getText());
        emp.setApellido(txtApellido.getText());
        emp.setTelefono(txtTelefono.getText());
        emp.setDireccion(txtDireccion.getText());
        String nombreArea = (String) comboAreas.getSelectedItem();
        Area are = this.controlador.buscarArea(nombreArea);
        emp.setArea(are);
        are.addEmpleado(emp);
        //this.controlador.actualizarArea(are);
        this.controlador.persistirEmpleado(emp);
           
        
        JOptionPane.showMessageDialog(this, "El Empleado fue cargado existosamente ", "Aviso", INFORMATION_MESSAGE);
        this.cargarTablaEmpleados();
        
        txtDni.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtId.setText("");
        txtDni.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtDireccion.setEnabled(false);
        botonAgregar.setEnabled(false);
        
        botonBuscar.setEnabled(true);
        botonNuevo.setEnabled(true);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JCheckBox checkArea;
    private javax.swing.JComboBox<String> comboAreas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables


    public void cargarComboAreas(){
        List <Area> listaAreas = controlador.ListarAreas();
        for(int i = 0; i < listaAreas.size() ; i++ ){
             comboAreas.addItem(listaAreas.get(i).getNombreArea());
        }
    }
    
      public void cargarTablaEmpleados(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");//0
        modelo.addColumn("DNI");//1
        modelo.addColumn("Nombre");//2
        modelo.addColumn("Apellido");//3
        modelo.addColumn("Telefono");//4
        modelo.addColumn("Direccion");//5
       
       
        List<Empleado> empleados = this.controlador.ListarEmpleados();
        //if (!empleados.isEmpty()){
            modelo.setRowCount(empleados.size());
        
            for(int i = 0; i < empleados.size(); i++){
                modelo.setValueAt(empleados.get(i).getId_empleado(), i, 0);
                modelo.setValueAt(empleados.get(i).getDni(), i, 1);
                modelo.setValueAt(empleados.get(i).getNombre(), i, 2);
                modelo.setValueAt(empleados.get(i).getApellido(), i, 3);
                modelo.setValueAt(empleados.get(i).getTelefono(), i, 4);
                modelo.setValueAt(empleados.get(i).getDireccion(), i, 5);
                
            }
        //}
        this.tablaEmpleados.setModel(modelo);
      }


}
