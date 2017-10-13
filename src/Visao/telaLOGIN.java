package Visao;

import Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import DAO.BD;
import DAO.BD_2;

/**
 *
 * @author Mateus
 */
public class telaLOGIN extends javax.swing.JFrame {

    public telaLOGIN() {
        initComponents();
        setVisible(true);
        getRootPane().setDefaultButton(entrar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senhatxt = new javax.swing.JPasswordField();
        usuariotxt = new javax.swing.JTextField();
        entrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA CLINSYS: LOGIN");
        setName("telaLOGIN"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("Bem vindo(a) ao Sistema CLINSYS!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 70, 250, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 100, 70, 16);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("SENHA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 150, 50, 16);
        getContentPane().add(senhatxt);
        senhatxt.setBounds(240, 140, 278, 30);
        getContentPane().add(usuariotxt);
        usuariotxt.setBounds(240, 90, 278, 30);

        entrar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ok.png"))); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(420, 200, 100, 30);

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(240, 200, 110, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/users.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 60, 128, 128);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 270);

        setSize(new java.awt.Dimension(638, 270));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        //Usuario logado = BD.getusuario(usuariotxt.getText());
        //ATUALIZADO
        Usuario logado = BD_2.getUsuario(usuariotxt.getText());
        if (logado != null && usuariotxt.getText().equals(logado.getlogin()) && senhatxt.getText().equals(logado.getsenha()) && logado.getstatus()) {
           
            
            //bora logar o acesso
            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf
                    = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(dt);
            BD_2.loga(logado, currentTime);

            JOptionPane.showMessageDialog(null,"Bem Vindo "+logado.getnome()+" !");
            telaMAIN telamain = new telaMAIN(logado);
            telamain.setVisible(true);
            dispose();
        } else if (!logado.getstatus()) {
            JOptionPane.showMessageDialog(null, "Usuário Desativado");
        } else {
            JOptionPane.showMessageDialog(null, "login/senha inválidos");
        }

    }//GEN-LAST:event_entrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField senhatxt;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
