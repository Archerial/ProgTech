/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progtech;

import java.util.Random;

/**
 *
 * @author Adam
 */
public class PCPartsPicker extends javax.swing.JFrame {
    
    Logger logger = Logger.getInstance();
    
    Random rnd = new Random();
    int low = 200000;
    int high = 550000;
    
    public void initComp(){
        apickedComp = new Computer(processzor,ramTipus,ramMeret,videoKartyaTipus,hatterTar,videoKartyaMeret,tapegyseg,tapegysegTeljesitmeny,hazTipus,alaplap,procceszorHuto,ar);
    }
    
    int ar = rnd.nextInt(high-low) + low;
    String processzor;
        String ramTipus;
        int ramMeret;
        String videoKartyaTipus;
        String hatterTar;
        String tapegyseg;
        int tapegysegTeljesitmeny;
        String alaplap;
        String procceszorHuto;
        int videoKartyaMeret;
        String hazTipus;

    
    public AComputer apickedComp;
    public AComputer acomp;
    
        MinositesGyar minositoG = new MinositesGamer();
        MinositesGyar minositoO = new MinositesOffice();

    /**
     * Creates new form FistGUI
     */
    public PCPartsPicker() {
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

        proccesorComboBox = new javax.swing.JComboBox<>();
        ramTypeComboBox = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ramSizeComboBox = new javax.swing.JComboBox<>();
        videoCardSizeComboBox = new javax.swing.JComboBox<>();
        videoCardTypeComboBox = new javax.swing.JComboBox<>();
        proccesorCoolerComboBox = new javax.swing.JComboBox<>();
        tapTeljesitmenyComboBox = new javax.swing.JComboBox<>();
        motherboardComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hattertarComboBox = new javax.swing.JComboBox<>();
        tapegysegComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        extrasComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hazTipusComboBox = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        proccesorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "Intel i3", "Intel i5", "Intel i7", "Intel i 9", "AMD FX1", "AMD FX2" }));
        proccesorComboBox.setToolTipText("Válasszon egyet");
        proccesorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proccesorComboBoxActionPerformed(evt);
            }
        });

        ramTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "HyperX", "Crosshair", "Item 4" }));

        jToggleButton1.setText("Ok");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("PC parts");

        jLabel2.setText("Procceszorok");

        jLabel3.setText("RAM típus");

        ramSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon eggyet", "2", "4", "8", "16", "32", "64" }));

        videoCardSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "2", "4", "8", "16" }));

        videoCardTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "nVdiia GeForce GTX 1060", "nVdiia GeForce GTX 1660", "nVdiia GeForce GTX 1080", "nVdiia GeForce RTX 2020" }));

        proccesorCoolerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "Cooler Master", "Artic" }));

        tapTeljesitmenyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "400", "450", "500", "550", "600", "750" }));
        tapTeljesitmenyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapTeljesitmenyComboBoxActionPerformed(evt);
            }
        });

        motherboardComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "ASUS", "ASROCK", "MSI", "GIGABYTE" }));

        jLabel5.setText("RAM méret (GB)");

        jLabel6.setText("Videókártya típus");

        jLabel7.setText("Háttértár");

        jLabel8.setText("Videókártya méret (GB)");

        jLabel9.setText("Tápegység");

        jLabel10.setText("Alaplap");

        jLabel11.setText("Tápegység teljesítmény(kHz)");

        jLabel13.setText("Procceszor hűtő");

        hattertarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "HDD", "SSD" }));

        tapegysegComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "Crosshair", "ASUS", "Chieftech" }));

        jLabel4.setText("Választható extrák");

        extrasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válassz egyet", "RGB", "Külső DVD író" }));
        extrasComboBox.setEnabled(false);
        extrasComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                extrasComboBoxItemStateChanged(evt);
            }
        });

        jButton1.setText("Véglegesítés");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel14.setText("Ház típus");

        hazTipusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Válasszon egyet", "Cougar", "NZXT" }));

        jLabel15.setText("Ára:");

        jTextField1.setEditable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(proccesorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ramTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(videoCardTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(ramSizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(hattertarComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addComponent(tapegysegComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tapTeljesitmenyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(motherboardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(extrasComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(proccesorCoolerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(videoCardSizeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addComponent(hazTipusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(288, 288, 288))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(306, 306, 306))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proccesorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ramTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ramSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(videoCardTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(proccesorCoolerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(videoCardSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hazTipusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hattertarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tapegysegComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tapTeljesitmenyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(motherboardComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extrasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jToggleButton1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void proccesorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proccesorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proccesorComboBoxActionPerformed

    private void tapTeljesitmenyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapTeljesitmenyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tapTeljesitmenyComboBoxActionPerformed

    private void extrasComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_extrasComboBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == evt.SELECTED){
            if (extrasComboBox.getSelectedIndex() == 0){
            }
            if (extrasComboBox.getSelectedIndex()== 1){
                Minosites minosites = minositoG.Create();
                apickedComp =  minosites.Minosit(apickedComp);
                ar += 10000;
            }
            if (extrasComboBox.getSelectedIndex() == 2){
                Minosites minosites = minositoO.Create();
                apickedComp = minosites.Minosit(apickedComp);
                ar += 13000;
            }
            jLabel12.setText(apickedComp.print().toString());
        }else if (evt.getStateChange() == evt.DESELECTED){
            initComp();
            jLabel12.setText(apickedComp.print().toString());
        }
    }//GEN-LAST:event_extrasComboBoxItemStateChanged

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        logger.parts(apickedComp, ar);
        OrderFrame ordersData = new OrderFrame();
        ordersData.setVisible(true);
        dispose();
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        processzor = String.valueOf(proccesorComboBox.getSelectedItem());
        ramTipus = String.valueOf(ramTypeComboBox.getSelectedItem());
        ramMeret = Integer.parseInt(String.valueOf(ramSizeComboBox.getSelectedItem()));
        videoKartyaTipus = String.valueOf(videoCardTypeComboBox.getSelectedItem());
        hatterTar = String.valueOf(hattertarComboBox.getSelectedItem());
         tapegyseg = String.valueOf(tapegysegComboBox.getSelectedItem());
        tapegysegTeljesitmeny = Integer.parseInt(String.valueOf(tapTeljesitmenyComboBox.getSelectedItem()));
         alaplap = String.valueOf(motherboardComboBox.getSelectedItem());
         procceszorHuto = String.valueOf(proccesorCoolerComboBox.getSelectedItem());
        videoKartyaMeret = Integer.parseInt(String.valueOf(videoCardSizeComboBox.getSelectedItem()));
        hazTipus = String.valueOf(hazTipusComboBox.getSelectedItem());
        
        /*
        pickedComp.setProcceszor(String.valueOf(proccesorComboBox.getSelectedItem()));
        pickedComp.setRamTipus(String.valueOf(ramTypeComboBox.getSelectedItem()));
        pickedComp.setRamMeret(Integer.parseInt(String.valueOf(ramSizeComboBox.getSelectedItem())));
        pickedComp.setVideoKartyaTipus(String.valueOf(videoCardTypeComboBox.getSelectedItem()));
        pickedComp.setHatterTar(String.valueOf(hattertarComboBox.getSelectedItem()));
        pickedComp.setTapegyseg(String.valueOf(tapegysegComboBox.getSelectedItem()));
        pickedComp.setTapegysegTeljesitmeny(Integer.parseInt(String.valueOf(tapTeljesitmenyComboBox.getSelectedItem())));
        pickedComp.setAlaplap(String.valueOf(motherboardComboBox.getSelectedItem()));
        pickedComp.setProccesszorHűtő(String.valueOf(proccesorCoolerComboBox.getSelectedItem()));
        pickedComp.setVideoKartyaMeret(Integer.parseInt(String.valueOf(videoCardSizeComboBox.getSelectedItem())));*/
     
        
        
         initComp();
        
        jLabel12.setText(apickedComp.print());
        jTextField1.setText(String.valueOf(apickedComp.getAr()));
        
        extrasComboBox.enable();
        
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(PCPartsPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCPartsPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCPartsPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCPartsPicker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCPartsPicker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> extrasComboBox;
    private javax.swing.JComboBox<String> hattertarComboBox;
    private javax.swing.JComboBox<String> hazTipusComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> motherboardComboBox;
    private javax.swing.JComboBox<String> proccesorComboBox;
    private javax.swing.JComboBox<String> proccesorCoolerComboBox;
    private javax.swing.JComboBox<String> ramSizeComboBox;
    private javax.swing.JComboBox<String> ramTypeComboBox;
    private javax.swing.JComboBox<String> tapTeljesitmenyComboBox;
    private javax.swing.JComboBox<String> tapegysegComboBox;
    private javax.swing.JComboBox<String> videoCardSizeComboBox;
    private javax.swing.JComboBox<String> videoCardTypeComboBox;
    // End of variables declaration//GEN-END:variables
}
