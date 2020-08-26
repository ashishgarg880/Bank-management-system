import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class newacc extends javax.swing.JInternalFrame {
Connection con;
ResultSet rs;
Statement st;

    public newacc() {
        initComponents();
        connect();
        getdate();
        setcombo();
       
    }

   public void getdate(){
   DateFormat df = new SimpleDateFormat("dd-MM-yyyy");   
   java.util.Date dt = new java.util.Date();
   jLabel4.setText(df.format(dt));
           }
   
   public void connect(){
   String host="jdbc:mysql://localhost:3306/bank?useSSL=false";
   String user="root";
   String pass="1234";
   try{
   con=DriverManager.getConnection(host,user,pass);
   }
   catch(SQLException ex){
   JOptionPane.showMessageDialog(this,"PLEASE CHECK THE CONNECTION");
   
   }
   
   }
   
   public void setcombo(){
          try{
      st = con.createStatement();
      String cmd="Select name from profile";
      rs=st.executeQuery(cmd);
      
           while(rs.next())
           {
           jComboBox1.addItem(rs.getString("name"));
           }
        }
      catch(SQLException ex)
      {
      JOptionPane.showMessageDialog(this, "");
      }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NEW ACCOUNT NUMBER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));
        setClosable(true);
        setMaximizable(true);
        setTitle("NEW ACCOUNT");
        setToolTipText("");

        jLabel1.setText("NAME");

        jLabel2.setText("ACCOUNT NUMBER");

        jLabel3.setText("MOBILE NUMBER");

        jButton1.setText("SAVE ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, 185, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String a=jTextField1.getText();
       String b=jTextField2.getText();
       String d=jLabel4.getText();
       String c=jComboBox1.getSelectedItem().toString();
       
       try{
       st=con.createStatement();
      if(c.equals("")&&b.equals("")){
      JOptionPane.showMessageDialog(this,"PLAESE ENTER SOMETHING");
      } 
      
      else{
       String cmd="INSERT into account(name,account_no,mobile_no,date)values('"+c+"','"+b+"','"+a+"','"+d+"')";
        st.executeUpdate(cmd);
       JOptionPane.showMessageDialog(this, "YOUR ACCOUNTB IS SAVED");
       }
       }
       catch(SQLException ex){
          JOptionPane.showMessageDialog(this,"YOUR ACCOUNT IS NOT SAVED");
       }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String a=jTextField1.getText();
       String b=jTextField2.getText();
       String d=jLabel4.getText();
       String c=jComboBox1.getSelectedItem().toString();
       
       try{
       st=con.createStatement();
       if(c.equals("")&& b.equals("")){
       JOptionPane.showMessageDialog(this,"PLAESE ENTER SOMETHING");
      } 
      
      else{
       String cmd="DELETE into account(name,account_no,mobile_no,date)values('"+c+"','"+b+"','"+a+"','"+d+"')";
       st.executeUpdate(cmd);
       JOptionPane.showMessageDialog(this, "YOUR ACCOUNT DELETE");
       }
       }
       catch(SQLException ex){
          JOptionPane.showMessageDialog(this,"NO Delete");
       }
    
                                     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          jTextField1.setText("");
          jTextField2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
