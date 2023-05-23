package libsys;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.JTable;

public class BookLocationMan extends main {
    DefaultTableModel Table1=new DefaultTableModel();
    DefaultTableModel Table2=new DefaultTableModel();
    int shelfcount,ShelfNum1,ShelfNum2;
    
    public BookLocationMan() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboBox2 = new javax.swing.JComboBox<>();
        btnMove = new javax.swing.JButton();
        btnUp2 = new javax.swing.JButton();
        btnDown2 = new javax.swing.JButton();
        btnUp1 = new javax.swing.JButton();
        btnDown1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnNewShelf = new javax.swing.JButton();
        btnEmptyShelf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNSORTED" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Shelf Number Selector");

        ShowTable1.setModel(Table1);
        ShowTable1.setDragEnabled(true);
        ShowTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShowTable1);

        ShowTable2.setModel(Table2);
        ShowTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ShowTable2);

        jLabel2.setText("Shelf Number Selector");

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNSORTED" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });

        btnMove.setText("Move");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        btnUp2.setText("UP");
        btnUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp2ActionPerformed(evt);
            }
        });

        btnDown2.setText("Down");
        btnDown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown2ActionPerformed(evt);
            }
        });

        btnUp1.setText("UP");
        btnUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp1ActionPerformed(evt);
            }
        });

        btnDown1.setText("Down");
        btnDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOOK LOCATION MANAGER");

        btnNewShelf.setText("Create new shelf");
        btnNewShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewShelfActionPerformed(evt);
            }
        });

        btnEmptyShelf.setText("Empty shelf");
        btnEmptyShelf.setEnabled(false);
        btnEmptyShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyShelfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEmptyShelf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNewShelf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUp1)
                        .addGap(14, 14, 14))
                    .addComponent(btnDown1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(btnMove)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDown2)
                    .addComponent(btnUp2))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(btnMove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnUp2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDown2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(btnUp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDown1)
                        .addGap(92, 92, 92)
                        .addComponent(btnNewShelf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmptyShelf)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        databaseConnect("books");
        CountShelves();
        RenderComboButtons(shelfcount);
        RenderTable(Table1,0);
        RenderTable(Table2,0);
    }//GEN-LAST:event_formWindowOpened

    private void btnNewShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewShelfActionPerformed
        System.out.println(shelfcount);
        for(int x=1;x<=shelfcount;x++){
            ComboBox1.removeItemAt(1);
            ComboBox2.removeItemAt(1);
        }
        shelfcount=shelfcount+1;
        RenderComboButtons(shelfcount);
    }//GEN-LAST:event_btnNewShelfActionPerformed

    private void btnEmptyShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyShelfActionPerformed
        if(ShowTable1.getSelectedRow()!=-1){
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum1+"%'");
                while(rs.next()){
                    rs.updateString("LOCATION","UNSORTED");
                    rs.updateRow();
                }
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
        else{
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum2+"%'");
                while(rs.next()){
                    rs.updateString("LOCATION","UNSORTED");
                    rs.updateRow();
                }
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }//GEN-LAST:event_btnEmptyShelfActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        ShelfNum1=ComboBox1.getSelectedIndex();
        RenderTable(Table1,ShelfNum1);
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        ShelfNum2=ComboBox2.getSelectedIndex();
        RenderTable(Table2,ShelfNum2);
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        if(ShowTable1.getSelectedRow()!=-1){
            Object val=ShowTable1.getValueAt(ShowTable1.getSelectedRow(), 1);
            int selectedbookID=Integer.parseInt(val.toString());
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+val);
                rs.next();
                rs.updateString("LOCATION","S"+ShelfNum2+"R1");
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
        else{
            Object val=ShowTable2.getValueAt(ShowTable2.getSelectedRow(), 1);
            int selectedbookID=Integer.parseInt(val.toString());
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+val);
                rs.next();
                rs.updateString("LOCATION","S"+ShelfNum1+"R1");
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }//GEN-LAST:event_btnMoveActionPerformed

    private void ShowTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTable1MouseClicked
        ShowTable2.clearSelection();
        btnEmptyShelf.setEnabled(true);
    }//GEN-LAST:event_ShowTable1MouseClicked

    private void ShowTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTable2MouseClicked
        ShowTable1.clearSelection();
        btnEmptyShelf.setEnabled(true);
    }//GEN-LAST:event_ShowTable2MouseClicked

    private void btnUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp1ActionPerformed
        MoveRow(ShowTable1,1);
    }//GEN-LAST:event_btnUp1ActionPerformed

    private void btnDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown1ActionPerformed
        MoveRow(ShowTable1,-1);
    }//GEN-LAST:event_btnDown1ActionPerformed

    private void btnUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp2ActionPerformed
        MoveRow(ShowTable2,1);
    }//GEN-LAST:event_btnUp2ActionPerformed

    private void btnDown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown2ActionPerformed
        MoveRow(ShowTable2,-1);
    }//GEN-LAST:event_btnDown2ActionPerformed

    private void RenderTable(DefaultTableModel Table, int ShelfNum){
        String[] GivenColumns={"Title","Book ID","Location"};
        Table.setColumnIdentifiers(GivenColumns);
        Table.setRowCount(0);
        
        if(ShelfNum!=0){
        try{
            rs=stmt.executeQuery("SELECT TITLE, BOOKID, LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum+"%' ORDER BY LOCATION");
            while(rs.next()){
            Table.addRow(new Object[]{
                rs.getString("TITLE"),
                rs.getString("BOOKID"),
                rs.getString("LOCATION")
            });
            }
                refreshRsStmt("books");
                rs.close();
            }catch(SQLException err){
                System.out.print(err);
            }
        }
        else{
            try{
                rs=stmt.executeQuery("SELECT TITLE, BOOKID, LOCATION FROM BOOKS WHERE LOCATION LIKE 'UNSORTED' ORDER BY LOCATION");
                while(rs.next()){
                Table.addRow(new Object[]{
                    rs.getString("TITLE"),
                    rs.getString("BOOKID"),
                    rs.getString("LOCATION")
                    });
                }
                refreshRsStmt("books");
                rs.close();
                }catch(SQLException err){
                    System.out.print(err);
                }   
        }
    }
    
    private void CountShelves(){
        try{
            rs=stmt.executeQuery("SELECT MAX(LOCATION) AS TEMP FROM BOOKS WHERE LOCATION LIKE 'S%'");
            rs.next();
            String temp=rs.getString("TEMP");
            shelfcount=Integer.parseInt(temp.substring(1,2));
        }catch(SQLException err){
            System.out.println(err);
        }
        
    }
    
    private void RenderComboButtons(int y){
        for(int x=1;x<=y;x++){
            ComboBox1.addItem("Shelf "+x);
            ComboBox2.addItem("Shelf "+x);
        }
    }
    
    private void MoveRow(JTable Table,int MoveVal){
        Object val=Table.getValueAt(Table.getSelectedRow(),1);
        String BookID=val.toString();
        
        Object LocationVal=Table.getValueAt(Table.getSelectedRow(),2);
        String LocationCode=LocationVal.toString();
        System.out.println(LocationCode.charAt(1));
        int temp=Integer.parseInt(LocationCode.substring(3,4));
        
        if((temp==1&&MoveVal==-1)||(temp==9&&MoveVal==1)){
           JOptionPane.showMessageDialog(null,"Shelf Rows only go from a value of 1 to 9.");
        }
        else{
            temp=temp+MoveVal;
            String newLocationCode="S"+LocationCode.charAt(1)+"R"+String.valueOf(temp);
            System.out.println(newLocationCode);
            
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+BookID);
                rs.next();
                rs.updateString("LOCATION",newLocationCode);
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }
            
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
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookLocationMan().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JTable ShowTable1;
    private javax.swing.JTable ShowTable2;
    private javax.swing.JButton btnDown1;
    private javax.swing.JButton btnDown2;
    private javax.swing.JButton btnEmptyShelf;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnNewShelf;
    private javax.swing.JButton btnUp1;
    private javax.swing.JButton btnUp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
