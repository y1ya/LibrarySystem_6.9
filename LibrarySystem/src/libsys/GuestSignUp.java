package libsys;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static libsys.main.currFullName;

public class GuestSignUp extends main {
    public GuestSignUp() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new Button_Gradient.ButtonGradient();
        panelRound1 = new Panel_Gradient.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNewEmail = new textfield.TextField();
        jLabel7 = new javax.swing.JLabel();
        txtNewPassConf = new textfield.PasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtNewPass = new textfield.PasswordField();
        btnConfirm1 = new Button_Gradient.ButtonGradient();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 51, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 204, 204));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/18sp-ourfuture-libraries-mediumSquareAt3X (1).gif"))); // NOI18N
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 790, 650));

        btnBack1.setBackground(new java.awt.Color(153, 153, 255));
        btnBack1.setForeground(new java.awt.Color(51, 51, 255));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_20px.png"))); // NOI18N
        btnBack1.setColor1(new java.awt.Color(211, 204, 227));
        btnBack1.setColor2(new java.awt.Color(233, 228, 240));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Create account");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Register a new account");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txtNewEmail.setLabelText("Enter your full name\n");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtNewPassConf.setLabelText("Confirm Password");
        txtNewPassConf.setShowAndHide(true);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User Default_30px.png"))); // NOI18N

        txtNewPass.setLabelText("Create Password\n");
        txtNewPass.setShowAndHide(true);

        btnConfirm1.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm1.setText("CREATE ACCOUNT");
        btnConfirm1.setColor1(new java.awt.Color(0, 51, 153));
        btnConfirm1.setColor2(new java.awt.Color(255, 204, 204));
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_key_37px.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_37px.png"))); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(781, 781, 781)
                        .addComponent(jLabel7))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtNewPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtNewPass, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewPassConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnConfirm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        kGradientPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 84, 410, 620));

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        this.dispose();
        main.sendDisplaySignal(new ReaderSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed

        
        usiEmail = txtNewEmail.getText();
        if (emailTaken(usiEmail))
        {
            JOptionPane.showMessageDialog(null, "Email already taken");
            return;
        }
        
        usiPass = String.valueOf(txtNewPass.getPassword());
        
        if ( usiPass.isEmpty() || usiEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Must satisfy all fields");
        }
        else if (lessthanLength(6, txtNewPass)) {
            JOptionPane.showMessageDialog(null, "Password must be greater than or equal to 6 characters");
        }
        else if (lessthanLength(4, txtNewEmail)) {
            JOptionPane.showMessageDialog(null, "Email must be greater than or equal to 4 characters");
        }                
        else 
        {
            if (!String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtNewPassConf.getPassword()))) 
            {
                JOptionPane.showMessageDialog(null, "Password not aligned. Try again.");
            } 
            else 
            {
                try
                {
                    databaseConnect("accounts");
                    int randID = randNumGen("accounts", "userid");
                    databaseConnect("accounts");
                    rs.moveToInsertRow();
                    rs.updateInt("USERID", randID); 
                    rs.updateNull("FULLNAME");
                    rs.updateString("PASSWORD", usiPass);
                    rs.updateString("USERTYPE", "GUEST");
                    rs.updateString("EMAIL", usiEmail);
                    rs.updateNull("CONTACTNUMBER");
                    rs.updateNull("ADDRESS");
                    rs.updateNull("VALIDID");
                    rs.updateNull("BIRTHDATE");
                    rs.updateNull("SEX");
                    rs.insertRow();
                    refreshRsStmt("accounts");

                    JOptionPane.showMessageDialog(null, "Registration Complete!");
                    this.dispose();
                    currFullName = "Guest";
                    currUserType = usiUsertype;
                    currUserID = randID;
                    toUsertypeBases("GUEST");
                    databaseConnect("accounts"); 
                    refreshRsStmt("accounts");
                }  
                catch (SQLException err) 
                {
                System.out.println(err.getMessage());
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(GuestSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnConfirm1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack1;
    private Button_Gradient.ButtonGradient btnConfirm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel2;
    private Panel_Gradient.PanelRound panelRound1;
    private textfield.TextField txtNewEmail;
    private textfield.PasswordField txtNewPass;
    private textfield.PasswordField txtNewPassConf;
    // End of variables declaration//GEN-END:variables

}
