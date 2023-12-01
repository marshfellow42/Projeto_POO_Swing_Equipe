/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.util.prefs.Preferences;

/**
 *
 * @author Elenita
 */
public class ConfigAparencia extends javax.swing.JFrame {

    /**
     * Creates new form ConfigAparencia
     */
    public ConfigAparencia() {
        initComponents();
        restorePreferences();
        updateUI();
        Color color = new Color(214, 217, 223);
        painelPrincipal.setBackground(color);
        jLabel1.setForeground(Color.black);
        jLabel2.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        centreWindow(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selecaoCores = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cor");

        selecaoCores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "White", "Black" }));
        selecaoCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoCoresActionPerformed(evt);
            }
        });

        jLabel2.setText("Unidade de V.");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "Km/h" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Idioma");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português-Brazil", "Inglês", "Japonês", "Francês" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel4.setText("Unidade de C");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°C", "°F", "°K" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addComponent(selecaoCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecaoCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String selectedColor = null;
    String selectedWindUnit = null;
    String selectedLanguage = null;
    String selectedTemperatureUnit = null;

    private void restorePreferences() {
        Preferences prefs = Preferences.userNodeForPackage(ConfigAparencia.class);
        selectedColor = prefs.get("selectedColor", "Default");
        selectedWindUnit = prefs.get("selectedWindUnit", "m/s");
        selectedLanguage = prefs.get("selectedLanguage", "Português-Brazil");
        selectedTemperatureUnit = prefs.get("selectedTemperatureUnit", "°C");
    }

    private void updateUI() {
        selecaoCores.setSelectedItem(selectedColor);
        jComboBox1.setSelectedItem(selectedWindUnit);
        jComboBox2.setSelectedItem(selectedLanguage);
        jComboBox3.setSelectedItem(selectedTemperatureUnit);
    }

    private void savePreferences() {
        Preferences prefs = Preferences.userNodeForPackage(ConfigAparencia.class);
        prefs.put("selectedColor", selectedColor);
        prefs.put("selectedWindUnit", selectedWindUnit);
        prefs.put("selectedLanguage", selectedLanguage);
        prefs.put("selectedTemperatureUnit", selectedTemperatureUnit);
    }

    private void selecaoCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoCoresActionPerformed
        String selectedColor = selecaoCores.getSelectedItem().toString();
        if (selectedColor.equals("Default")) {
            Color color = new Color(214, 217, 223);
            painelPrincipal.setBackground(color);
            jLabel1.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
            jLabel4.setForeground(Color.black);
        } else if (selectedColor.equals("Black")) {
            jLabel1.setForeground(Color.white);
            jLabel2.setForeground(Color.white);
            jLabel3.setForeground(Color.white);
            jLabel4.setForeground(Color.white);
            painelPrincipal.setBackground(Color.black);
        } else if (selectedColor.equals("White")) {
            painelPrincipal.setBackground(Color.white);
            jLabel1.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
            jLabel4.setForeground(Color.black);
        }
        savePreferences();
    }//GEN-LAST:event_selecaoCoresActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    AppPrincipalVIEW appP = new AppPrincipalVIEW();

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedTemperatureUnit = jComboBox3.getSelectedItem().toString();
            appP.mudarTemp(selectedTemperatureUnit);
        }
        savePreferences();
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String selectedWindUnit = jComboBox1.getSelectedItem().toString();
            appP.mudarVento(selectedWindUnit);
        }
        savePreferences();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        String selectedLanguage = jComboBox2.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

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
            java.util.logging.Logger.getLogger(ConfigAparencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigAparencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigAparencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigAparencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfigAparencia().setVisible(true);
            }
        });
    }

    private void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel painelPrincipal;
    public javax.swing.JComboBox<String> selecaoCores;
    // End of variables declaration//GEN-END:variables
}