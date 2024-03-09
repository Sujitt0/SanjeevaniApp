/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.AppointmentDao;
import sanjeevaniapp.dao.DoctorDao;
import sanjeevaniapp.dao.PatientDao;
import sanjeevaniapp.pojo.PatientPojo;

/**
 *
 * @author HP
 */
public class UpdatePatientFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatientFrame
     */
    java.sql.Date dt;
    private PatientPojo patient;

    public UpdatePatientFrame() {
        initComponents();
        setLocationRelativeTo(null);
        loadAllDoctorsId();
        loadAllPatientsId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jcDocId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        txtOPD = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jcMaritalStatus = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        jcPatientId = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Patient Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("OPD");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Doctor Id");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Patient Id");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Age");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("City");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("First Name");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Last Name");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Marital Status");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Date");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Phone No.");

        jcDocId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDocIdActionPerformed(evt);
            }
        });

        jcGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcGender.setEnabled(false);

        txtOPD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtOPD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOPDActionPerformed(evt);
            }
        });

        txtFirstName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtLastName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtContact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jcMaritalStatus.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Unmarried" }));
        jcMaritalStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMaritalStatusActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Address");

        jScrollPane1.setHorizontalScrollBar(null);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtAge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jcPatientId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPatientIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jcDocId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOPD)
                    .addComponent(txtAge)
                    .addComponent(txtCity)
                    .addComponent(jcPatientId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addComponent(jLabel10))
                    .addComponent(jLabel11)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jcPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtOPD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 700, 310));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Update Patient Frame");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, 30));

        btnUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 102));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 230, 40));

        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 100, 30));

        btnLogout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 102, 102));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, 90, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/checkup.jpg"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 220, 230));

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator3.setToolTipText("");
        jSeparator3.setOpaque(true);
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 490, 2));

        jLabel2.setFont(new java.awt.Font("Forte", 1, 45)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText(" Sanjeevani Application");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 510, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG12.jpg"))); // NOI18N
        jLabel17.setText("jLabel1");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -130, 1080, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDocIdActionPerformed

    private void txtOPDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOPDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOPDActionPerformed

    private void jcMaritalStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMaritalStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMaritalStatusActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (validateInputs() == false) {
            JOptionPane.showMessageDialog(null, "Please input all fields");
            return;
        }
        try {
            patient.setOpd(txtOPD.getText().trim());
            boolean resp1 = PatientDao.updatePatient(patient);
            boolean resp2 = AppointmentDao.updateAppointment(patient);
            if (resp1 == true && resp2 == true) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            JOptionPane.showMessageDialog(null, "Record not updated!", "Failure!", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error In DB" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ReceptionistOptionFrame rof = new ReceptionistOptionFrame();
        rof.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginFrame lframe = new LoginFrame();
        lframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jcPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPatientIdActionPerformed
        // TODO add your handling code here:
        try {
            String patId = jcPatientId.getSelectedItem().toString();
            PatientPojo pat = PatientDao.getAllPatientDetailsById(patId);
            txtOPD.setText(pat.getOpd());
            jcDocId.setSelectedItem(pat.getDoctorId());
            txtAge.setText(String.valueOf(pat.getAge()));
            txtCity.setText(pat.getCity());
            txtAddress.setText(pat.getAddress());
            txtFirstName.setText(pat.getFirstName());
            txtLastName.setText(pat.getLastName());
            jcGender.setSelectedItem(pat.getGender());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String dateStr = sdf.format(pat.getDate());
            txtDate.setText(dateStr);
            txtContact.setText(pat.getMno());
            jcMaritalStatus.setSelectedItem(pat.getMarriedStatus());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB in UpdatePatientFrame:" + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcPatientIdActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcDocId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JComboBox<String> jcMaritalStatus;
    private javax.swing.JComboBox<String> jcPatientId;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOPD;
    // End of variables declaration//GEN-END:variables

    private void loadAllPatientsId() {
        try {
            List<String> patList = PatientDao.getAllPatientId();
            for (String patId : patList) {
                jcPatientId.addItem(patId);
            }
            if (jcPatientId.getItemCount() != 0) {
                btnUpdate.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB in UpdatePatientFrame:" + ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
    }

    private void loadAllDoctorsId() {
        try {
            List<String> docList = DoctorDao.getAllDoctorId();
            for (String patId : docList) {
                jcDocId.addItem(patId);
            }
            if (jcDocId.getItemCount() != 0) {
                btnUpdate.setEnabled(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB in UpdatePatientFrame:" + ex);
            System.out.println("Error in DB");
            ex.printStackTrace();
        }
    }

    private boolean validateInputs() {
        patient = new PatientPojo();
        patient.setPatientId(jcPatientId.getSelectedItem().toString());
        patient.setCity(txtCity.getText().trim());
        patient.setAddress(txtAddress.getText().trim());
        patient.setFirstName(txtFirstName.getText().trim());
        patient.setLastName(txtLastName.getText().trim());
        patient.setGender(jcGender.getSelectedItem().toString());
        patient.setMarriedStatus(jcMaritalStatus.getSelectedItem().toString());
        patient.setDoctorId(jcDocId.getSelectedItem().toString());
        patient.setDate(dt);
        patient.setMno(txtContact.getText().trim());
        if (patient.getCity().isEmpty() || patient.getFirstName().isEmpty() || patient.getLastName().isEmpty() || patient.getAddress().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
            return false;

        }

        try {
            patient.setAge(Integer.parseInt(txtAge.getText().trim()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid age" + ex);
            return false;
        }
        if (!isContactNoValid()) {
            JOptionPane.showMessageDialog(null, "Invalid Mobile no");
            return false;
        }
        return true;
    }

    private boolean isContactNoValid() {
        char[] mob = patient.getMno().toCharArray();
        for (char ch : mob) {
            if (Character.isDigit(ch) == false) {
                return false;
            }
        }
        if (patient.getMno().length() == 10) {
            return true;
        }
        return false;
    }
}
