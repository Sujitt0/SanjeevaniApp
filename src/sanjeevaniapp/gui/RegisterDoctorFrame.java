/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.gui;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import sanjeevaniapp.dao.DoctorDao;
import sanjeevaniapp.dao.EmpDao;
import sanjeevaniapp.dao.UserDao;
import sanjeevaniapp.pojo.DoctorPojo;
import sanjeevaniapp.pojo.UserPojo;
import sanjeevaniapp.utility.PasswordEncryption;

/**
 *
 * @author HP
 */
public class RegisterDoctorFrame extends javax.swing.JFrame {

    private Map<String, String> unRegDocList;
    private String logId, selEmpId, selEmpName;
    private String pwd1, pwd2;
    private String contactNo, emailId, qualification, specialist;

    public RegisterDoctorFrame() {
        initComponents();
        setLocationRelativeTo(null);
        unRegDocList = new HashMap<>();
        loadDoctorDetails();
        genNewDocId();
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
        jSeparator3 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        jcEmpId = new javax.swing.JComboBox<>();
        jcGender = new javax.swing.JComboBox<>();
        txtDoctorName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtDoctorId = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        txtSpecialist = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPwd1 = new javax.swing.JPasswordField();
        txtPwd2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 153));
        jSeparator3.setToolTipText("");
        jSeparator3.setOpaque(true);
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 490, 2));

        jLabel16.setFont(new java.awt.Font("Forte", 1, 45)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText(" Sanjeevani Application");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 510, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/HomePageBG1.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -80, 1040, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Doctor's Details"));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Employee ID");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Doctor Name");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Login Id");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Password");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Retype Password");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Doctor ID");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Contact No");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Qualification");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Specialist");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Email ID");

        jcEmpId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });

        jcGender.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        txtDoctorName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        txtLoginId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIdActionPerformed(evt);
            }
        });

        txtDoctorId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtContactNo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtQualification.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtSpecialist.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtEmailId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcEmpId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDoctorName)
                    .addComponent(txtLoginId)
                    .addComponent(jcGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, 154, Short.MAX_VALUE)
                    .addComponent(txtPwd1)
                    .addComponent(txtPwd2))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDoctorId)
                    .addComponent(txtContactNo)
                    .addComponent(txtQualification)
                    .addComponent(txtSpecialist)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jcEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(txtSpecialist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPwd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 700, 310));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Add Doctors");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 30));

        btnRegister.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 102, 102));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 230, 40));

        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, 100, 30));

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 620, 90, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sanjeevaniapp/icons/checkup.jpg"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 220, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void txtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIdActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoginFrame lframe = new LoginFrame();
        lframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageDoctorFrame mdf = new ManageDoctorFrame();
        mdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        if (validateInputs() == false) {
            JOptionPane.showMessageDialog(null, "Please input all the fields");
            return;
        }
        String passwordValid = matchPassword();
        if (passwordValid != null) {
            JOptionPane.showMessageDialog(null, passwordValid);
            return;
        }
        if (isContactNoValid() == false) {
            JOptionPane.showMessageDialog(null, "Invalid mobile no");
            return;
        }
        try {
            DoctorPojo doc = new DoctorPojo();
            doc.setDoctorId(txtDoctorId.getText());
            doc.setDoctorName(selEmpName);
            doc.setEmailId(emailId);
            doc.setGender(jcGender.getSelectedItem().toString());
            doc.setContactNo(contactNo);
            doc.setQualification(qualification);
            doc.setSpecialist(specialist);
            UserPojo user = new UserPojo();
            user.setLoginId(logId);
            String encPassword = new String(PasswordEncryption.getEncryptedPassword(pwd1));
            user.setPassword(encPassword);
            user.setUserName(selEmpName);
            user.setUserType("Doctor");
            boolean result1 = DoctorDao.addDoctor(doc);
            boolean result2 = UserDao.addUser(user);
            if (result1 == true && result2 == true) {
                JOptionPane.showMessageDialog(null, "Doctor successfully registered!");
                clearAll();
                //......................
                this.genNewDocId();
                return;
            }
            JOptionPane.showMessageDialog(null, "Registration unsuccessful!");
            return;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in DB:" + ex);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        // TODO add your handling code here:
        if (jcEmpId.getSelectedIndex() == -1) {
            return;
        }
        selEmpId = jcEmpId.getSelectedItem().toString();
        selEmpName = unRegDocList.get(selEmpId);
        txtDoctorName.setText(selEmpName);
    }//GEN-LAST:event_jcEmpIdActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JComboBox<String> jcGender;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPwd1;
    private javax.swing.JPasswordField txtPwd2;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSpecialist;
    // End of variables declaration//GEN-END:variables

    private boolean validateInputs() {
        logId = txtLoginId.getText().trim();
        char[] p1 = txtPwd1.getPassword();
        char[] p2 = txtPwd2.getPassword();
        this.contactNo = txtContactNo.getText().trim();
        this.qualification = txtQualification.getText().trim();
        this.emailId = txtEmailId.getText().trim();
        this.specialist = txtSpecialist.getText().trim();
        if (logId.isEmpty() || p1.length == 0 || p2.length == 0 || contactNo.isEmpty() || qualification.isEmpty() || emailId.isEmpty() || specialist.isEmpty()) {
            return false;
        }
        pwd1 = new String(p1);
        pwd2 = new String(p2);
        return true;
    }

    private String matchPassword() {
        pwd1 = pwd1.trim();
        pwd2 = pwd2.trim();
        if (pwd1.length() < 4 || pwd2.length() < 4) {
            return "Passwords must be of atleast 4 characters in length";
        }
        if (pwd1.equals(pwd2) == false) {
            return "Passwords do not match";
        }
        return null;
    }

    private boolean isContactNoValid() {
        //......................................................................
        char[] mob = contactNo.toCharArray();
        for (char ch : mob) {
            if (Character.isDigit(ch) == false) {
                return false;
            }
        }
        if (contactNo.length() == 10) {
            return true;
        }
        return false;
    }

    private void clearAll() {
        txtLoginId.setText("");
        this.txtContactNo.setText("");
        this.txtDoctorId.setText("");
        this.txtEmailId.setText("");
        this.txtPwd1.setText("");
        this.txtPwd2.setText("");
        this.txtQualification.setText("");
        this.txtSpecialist.setText("");
        this.unRegDocList.remove(selEmpId);
        this.jcEmpId.removeItem(selEmpId);
        if (unRegDocList.size() == 0) {
            JOptionPane.showMessageDialog(null, "All doctors registered!");
            ManageDoctorFrame manageDoc = new ManageDoctorFrame();
            manageDoc.setVisible(true);
            this.dispose();
        }
    }
    private void loadDoctorDetails() {
        try{
            unRegDocList=EmpDao.getUnRegisteredDoctors();
            Set <String> empIdSet=unRegDocList.keySet();
            for(String empId:empIdSet){
                jcEmpId.addItem(empId);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB in RegisterDoctorFrame:"+ex);
            ex.printStackTrace();
        }
    }
    
    private void genNewDocId() {
        try{
            String docId=DoctorDao.getNewDocId();
            txtDoctorId.setText(docId);
            }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in DB in RegisterDoctorFrame:"+ex);
            ex.printStackTrace();
        }
    }
}
