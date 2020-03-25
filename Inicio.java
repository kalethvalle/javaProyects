package clasearray;

import java.util.ArrayList;
import java.util.List;

public class Inicio extends javax.swing.JFrame {

    public static List<String> data = new ArrayList<>();

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nom_l = new javax.swing.JTextField();
        btn_guardar_l = new javax.swing.JButton();
        btn_delete_l = new javax.swing.JButton();
        btn_modificar_l = new javax.swing.JButton();
        cbx_list_l = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel1.setText("Ejemplo Array");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txt_nom_l.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_nom_l.setMinimumSize(new java.awt.Dimension(16, 32));
        txt_nom_l.setPreferredSize(new java.awt.Dimension(16, 32));
        txt_nom_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_lActionPerformed(evt);
            }
        });

        btn_guardar_l.setText("Guardar");
        btn_guardar_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_lActionPerformed(evt);
            }
        });

        btn_delete_l.setText("Eliminar");
        btn_delete_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_lActionPerformed(evt);
            }
        });

        btn_modificar_l.setText("Modificar");
        btn_modificar_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_lActionPerformed(evt);
            }
        });

        cbx_list_l.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbx_list_lItemStateChanged(evt);
            }
        });
        cbx_list_l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_list_lActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(txt_nom_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(btn_guardar_l)
                            .addGap(43, 43, 43)
                            .addComponent(btn_delete_l)
                            .addGap(41, 41, 41)
                            .addComponent(btn_modificar_l))
                        .addComponent(cbx_list_l, 0, 316, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbx_list_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nom_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar_l)
                    .addComponent(btn_delete_l)
                    .addComponent(btn_modificar_l))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_lActionPerformed
        String nombre = txt_nom_l.getText();
        data.add(nombre);
        txt_nom_l.setText("");
        cbx_list_l.removeAllItems();
        for(int i = 0; i < data.size(); i++){
            cbx_list_l.addItem(data.get(i));
        }

    }//GEN-LAST:event_btn_guardar_lActionPerformed

    private void txt_nom_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_lActionPerformed
    }//GEN-LAST:event_txt_nom_lActionPerformed

    private void btn_delete_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_lActionPerformed
        int j = cbx_list_l.getSelectedIndex();
        data.remove(j);
        cbx_list_l.removeAllItems();
        for(int i = 0; i < data.size(); i++){
            cbx_list_l.addItem(data.get(i));
        }
    }//GEN-LAST:event_btn_delete_lActionPerformed

    private void btn_modificar_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_lActionPerformed
        int j = cbx_list_l.getSelectedIndex();
        String nombre = txt_nom_l.getText();
        data.set(j,nombre);
        
        cbx_list_l.removeAllItems();
        for(int i = 0; i < data.size(); i++){
            cbx_list_l.addItem(data.get(i));
        }

    }//GEN-LAST:event_btn_modificar_lActionPerformed

    private void cbx_list_lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_list_lActionPerformed
        String nom = (String) cbx_list_l.getSelectedItem();
        txt_nom_l.setText(nom);
    }//GEN-LAST:event_cbx_list_lActionPerformed

    private void cbx_list_lItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbx_list_lItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_list_lItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete_l;
    private javax.swing.JButton btn_guardar_l;
    private javax.swing.JButton btn_modificar_l;
    private javax.swing.JComboBox<String> cbx_list_l;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_nom_l;
    // End of variables declaration//GEN-END:variables
}
