/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SignInApp;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Objects;
/**
 *
 * @author Jason
 */
public class StudentMainMenuFrame extends javax.swing.JFrame {
    String c1 = null;
    String c2 = null;
    String c3 = null;
    /**
     * Creates new form StudentMainMenuFrame
     */
    public void getInfo(){
        AddClassFrame info = new AddClassFrame();
        c1 = info.getC1();
        c2 = info.getC2();
        c3 = info.getC3();
        class1.setText(c1);
        class2.setText(c2);
        class3.setText(c3);
    }
    public StudentMainMenuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentInfoButton = new javax.swing.JButton();
        addClassButton = new javax.swing.JButton();
        defaultClass = new javax.swing.JButton();
        class1 = new javax.swing.JButton();
        class2 = new javax.swing.JButton();
        class3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        studentInfoButton.setText("StudentInfo");
        studentInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentInfoButtonActionPerformed(evt);
            }
        });

        addClassButton.setText("AddClass");
        addClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassButtonActionPerformed(evt);
            }
        });

        defaultClass.setText("Ist 250");
        defaultClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultClassActionPerformed(evt);
            }
        });

        class1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class1ActionPerformed(evt);
            }
        });

        class2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class2ActionPerformed(evt);
            }
        });

        class3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(class3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(class1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(defaultClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentInfoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(addClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentInfoButton)
                    .addComponent(addClassButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(defaultClass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(class1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(class2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(class3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentInfoButtonActionPerformed
        // TODO add your handling code here:
        UserInfoForm infoFrame = new UserInfoForm();
        infoFrame.getInfo(evt);
        infoFrame.setVisible(true);
        
    }//GEN-LAST:event_studentInfoButtonActionPerformed

    private void addClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassButtonActionPerformed
        // TODO add your handling code here:
        AddClassFrame addClass = new AddClassFrame();
        addClass.setVisible(true);
    }//GEN-LAST:event_addClassButtonActionPerformed

    private void defaultClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultClassActionPerformed
        // TODO add your handling code here:
        classMenuFrame classMenu = new classMenuFrame();
        classMenu.defaultClass("ist250",evt);
        classMenu.setVisible(true);
    }//GEN-LAST:event_defaultClassActionPerformed

    private void class2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class2ActionPerformed
        // TODO add your handling code here:
        if (c2 != null && !c2.isEmpty()){
            classMenuFrame frame = new classMenuFrame();
            frame.defaultClass(c1, evt);
        }
    }//GEN-LAST:event_class2ActionPerformed

    private void class1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class1ActionPerformed
        // TODO add your handling code here:
        if (c1 != null && !c1.isEmpty()){
           classMenuFrame frame = new classMenuFrame();
           frame.defaultClass(c2,evt);
        }
    }//GEN-LAST:event_class1ActionPerformed

    private void class3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class3ActionPerformed
        // TODO add your handling code here:
        if (c3 != null && !c3.isEmpty()){
           classMenuFrame frame = new classMenuFrame();
           frame.defaultClass(c3, evt);
        }
    }//GEN-LAST:event_class3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMainMenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClassButton;
    private javax.swing.JButton class1;
    private javax.swing.JButton class2;
    private javax.swing.JButton class3;
    private javax.swing.JButton defaultClass;
    private javax.swing.JButton studentInfoButton;
    // End of variables declaration//GEN-END:variables
}
