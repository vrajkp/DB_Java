
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Student_insert extends javax.swing.JFrame {

    /**
     * Creates new form Student_insert
     */
    public Student_insert() {
        initComponents();
        showStudent ();
    }
     public ArrayList<Student> student()
    {
        ArrayList<Student> studentlist = new ArrayList<>();
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = null;
            connection = DriverManager.getConnection(
                              "jdbc:oracle:thin:@localhost:1533/cse1.omega.uta.edu", "vkp2822", "Mavs2018");
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from F18_6_student");
            Student student_obj;
            while (rs.next()) {
               student_obj = new Student(rs.getLong("STUDENT_ID"),rs.getString("STUDENT_NAME"),rs.getString("STUDENT_EMAIL"),rs.getLong("STUDENT_CONTACT"),rs.getString("BUILDING_NO"),rs.getString("APT_NO"),rs.getInt("ZIP_CODE"),rs.getString("STUDENT_COUNTRY"),rs.getDate("DOB"));
               studentlist.add(student_obj);
            }
        }
        catch(Exception e){
            System.out.println("Connection Failed! Check output console");
                  e.printStackTrace();
                  
        }
        return studentlist;
    }
    
    public void showStudent ()
    {
        ArrayList<Student> list = student();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_Student.getModel();
        Object[] row = new Object[9];
       
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getSid();
            row[1]=list.get(i).getS_name();
            row[2]=list.get(i).getS_email();
            row[3]=list.get(i).getS_contact();
            row[4]=list.get(i).getS_b_No();
            row[5]=list.get(i).getS_apt_no();
            row[6]=list.get(i).getZip_code();
            row[7]=list.get(i).getS_country();
            row[8]=list.get(i).getS_DOB();
            model.addRow(row);
            
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        STUDENT_ID = new javax.swing.JTextField();
        STUDENT_NAME = new javax.swing.JTextField();
        STUDENT_CONTACT = new javax.swing.JTextField();
        STUDENT_EMAIL = new javax.swing.JTextField();
        BUILDING_NO = new javax.swing.JTextField();
        APT_NO = new javax.swing.JTextField();
        ZIP_CODE = new javax.swing.JTextField();
        STUDENT_COUNTRY = new javax.swing.JTextField();
        DOB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Display_Student = new javax.swing.JTable();
        update = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("STUDENT_NAME:");

        jLabel2.setText("STUDENT_ID:");

        jLabel3.setText("STUDENT_CONTACT:");

        jLabel4.setText("STUDENT_EMAIL:");

        jLabel5.setText("APT_NO:");

        jLabel6.setText("BUILDING_NO :");

        jLabel7.setText("ZIP_CODE:");

        jLabel8.setText("STUDENT_COUNTRY:");

        jLabel9.setText("DOB:");

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jTable_Display_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STUDENT_ID    ", "STUDENT_NAME ", "STUDENT_EMAIL", "STUDENT_CONTACT", "BUILDING_NO ", "APT_NO", "ZIP_CODE", "STUDENT_COUNTRY", "DOB"
            }
        ));
        jTable_Display_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_StudentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_Display_Student);

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUILDING_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ZIP_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_COUNTRY, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(save)
                        .addGap(114, 114, 114)
                        .addComponent(update)
                        .addGap(90, 90, 90)
                        .addComponent(reset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUILDING_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(APT_NO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ZIP_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STUDENT_COUNTRY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(save)
                    .addComponent(update))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        STUDENT_ID.setText("");
        STUDENT_NAME.setText("");
        STUDENT_EMAIL.setText("");
        STUDENT_CONTACT.setText("");
        BUILDING_NO.setText("");
        APT_NO.setText("");
        ZIP_CODE.setText("");
        STUDENT_COUNTRY.setText("");
        DOB.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = null;
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1533/cse1.omega.uta.edu", "vkp2822", "Mavs2018");
            String query = ("insert into F18_6_student(STUDENT_ID,STUDENT_NAME,STUDENT_EMAIL,STUDENT_CONTACT,BUILDING_NO,APT_NO,ZIP_CODE,STUDENT_COUNTRY,DOB) values(?,?,?,?,?,?,?,?,?)");
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, STUDENT_ID.getText());
            pst.setString(2, STUDENT_NAME.getText());
            pst.setString(3, STUDENT_CONTACT.getText());
            pst.setString(4, STUDENT_CONTACT.getText());
            pst.setString(5, BUILDING_NO.getText());
            pst.setString(6, APT_NO.getText());
            pst.setString(7, ZIP_CODE.getText());
            pst.setString(8, STUDENT_COUNTRY.getText());
            pst.setString(9, DOB.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Sucessfully!");
        } catch (Exception e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();

        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = null;
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1533/cse1.omega.uta.edu", "vkp2822", "Mavs2018");
            int row = jTable_Display_Student.getSelectedRow();
            String value = (jTable_Display_Student.getModel().getValueAt(row,0).toString());
            String query = "UPDATE F18_6_STUDENT SET STUDENT_NAME=?, STUDENT_EMAIL=?, STUDENT_CONTACT=?, BUILDING_NO=?, APT_NO=?, ZIP_CODE=?, STUDENT_COUNTRY=?, DOB=? WHERE STUDENT_ID="+value;
             PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, STUDENT_ID.getText());
            pst.setString(2, STUDENT_NAME.getText());
            pst.setString(3, STUDENT_CONTACT.getText());
            pst.setString(4, STUDENT_CONTACT.getText());
            pst.setString(5, BUILDING_NO.getText());
            pst.setString(6, APT_NO.getText());
            pst.setString(7, ZIP_CODE.getText());
            pst.setString(8, STUDENT_COUNTRY.getText());
            pst.setString(9, DOB.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "updated Sucessfully!");
        } 
        catch (Exception e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_updateActionPerformed

    private void jTable_Display_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Display_StudentMouseClicked
        int i = jTable_Display_Student.getSelectedRow();
        TableModel model = jTable_Display_Student.getModel() ;
        STUDENT_ID.setText(model.getValueAt(i,0).toString());
        STUDENT_NAME.setText(model.getValueAt(i,1).toString());
        STUDENT_EMAIL.setText(model.getValueAt(i,2).toString());
        STUDENT_CONTACT.setText(model.getValueAt(i,3).toString());
        BUILDING_NO.setText(model.getValueAt(i,4).toString());
        APT_NO.setText(model.getValueAt(i,5).toString());
        ZIP_CODE.setText(model.getValueAt(i,6).toString());
        STUDENT_COUNTRY.setText(model.getValueAt(i,7).toString());
        DOB.setText(model.getValueAt(i,8).toString());
    }//GEN-LAST:event_jTable_Display_StudentMouseClicked

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
            java.util.logging.Logger.getLogger(Student_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APT_NO;
    private javax.swing.JTextField BUILDING_NO;
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField STUDENT_CONTACT;
    private javax.swing.JTextField STUDENT_COUNTRY;
    private javax.swing.JTextField STUDENT_EMAIL;
    private javax.swing.JTextField STUDENT_ID;
    private javax.swing.JTextField STUDENT_NAME;
    private javax.swing.JTextField ZIP_CODE;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Display_Student;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}