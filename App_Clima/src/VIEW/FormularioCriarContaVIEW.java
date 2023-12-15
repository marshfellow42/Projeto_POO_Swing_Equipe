/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mello
 */
public class FormularioCriarContaVIEW extends javax.swing.JFrame {

    /**
     * Creates new form FormularioCriarContaVIEW
     */
    public FormularioCriarContaVIEW() {
        initComponents();
        this.setTitle("Weathervane");
        setIconImage();
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

        jPanel1 = new javax.swing.JPanel();
        comeback = new javax.swing.JButton();
        txtCriarNomeUsuario = new javax.swing.JTextField();
        btnCriarConta = new javax.swing.JButton();
        txtCriarSenhaUsuario = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        checkSenhaCriar = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        comeback.setBackground(new java.awt.Color(255, 255, 255));
        comeback.setForeground(new java.awt.Color(0, 0, 0));
        comeback.setText("Voltar");
        comeback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comebackActionPerformed(evt);
            }
        });
        jPanel1.add(comeback);
        comeback.setBounds(190, 400, 90, 20);

        txtCriarNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCriarNomeUsuarioActionPerformed(evt);
            }
        });
        txtCriarNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCriarNomeUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtCriarNomeUsuario);
        txtCriarNomeUsuario.setBounds(130, 140, 200, 22);

        btnCriarConta.setBackground(new java.awt.Color(255, 255, 255));
        btnCriarConta.setForeground(new java.awt.Color(0, 0, 0));
        btnCriarConta.setText("Cadastrar");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCriarConta);
        btnCriarConta.setBounds(50, 400, 90, 20);

        txtCriarSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCriarSenhaUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtCriarSenhaUsuario);
        txtCriarSenhaUsuario.setBounds(130, 200, 200, 22);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 200, 70, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome De Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 140, 114, 20);

        checkSenhaCriar.setForeground(new java.awt.Color(255, 255, 255));
        checkSenhaCriar.setText("Mostrar Senha");
        checkSenhaCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSenhaCriarActionPerformed(evt);
            }
        });
        jPanel1.add(checkSenhaCriar);
        checkSenhaCriar.setBounds(60, 260, 130, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastro");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 190, 48);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preencha os formulários abaixo.");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 90, 340, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Oferecemos serviços de alta qualidade! 100% Seguro");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 60, 340, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 400, 480));

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/fundo-gradiente.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCriarNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCriarNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCriarNomeUsuarioActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        Checar();
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void checkSenhaCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSenhaCriarActionPerformed
        if (checkSenhaCriar.isSelected()) {
            txtCriarSenhaUsuario.setEchoChar((char) 0);
        } else {
            txtCriarSenhaUsuario.setEchoChar('*');
        }
    }//GEN-LAST:event_checkSenhaCriarActionPerformed

    private void txtCriarNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriarNomeUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCriarSenhaUsuario.requestFocus();
        }
    }//GEN-LAST:event_txtCriarNomeUsuarioKeyPressed

    private void txtCriarSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriarSenhaUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Checar();
        }
    }//GEN-LAST:event_txtCriarSenhaUsuarioKeyPressed

    private void comebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comebackActionPerformed
        FormularioLoginVIEW Flogin = new FormularioLoginVIEW();
        Flogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_comebackActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCriarContaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCriarContaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCriarContaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCriarContaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCriarContaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JCheckBox checkSenhaCriar;
    private javax.swing.JButton comeback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCriarNomeUsuario;
    private javax.swing.JPasswordField txtCriarSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    private void Criar() {
        String nome, senha;

        nome = txtCriarNomeUsuario.getText();
        senha = txtCriarSenhaUsuario.getText();

        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setCriar_nome_usuario(nome);
        objusuariodto.setCriar_senha_usuario(senha);

        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrarUsuario(objusuariodto);

        //chamar tela principal
        AppPrincipalVIEW objappprincipalview = new AppPrincipalVIEW();
        objappprincipalview.setVisible(true);

        dispose();

    }

    private void Checar() {
        try {
            String nome = txtCriarNomeUsuario.getText();

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setCriar_nome_usuario(nome);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.checarUsuarioExistente(objusuariodto);

            if (rsusuariodao.next()) {
                JOptionPane.showMessageDialog(null, "Esse usuario já existe");
            } else {
                Criar();
            }
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "FormularioCriarContaVIEW: " + error);
        }
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/perereca_engracada.png")));
    }
    
    private void centreWindow(Window frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}
