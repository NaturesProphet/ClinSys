package Visao;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mateus Garcia
 */
public class resumocadastros extends javax.swing.JFrame {

    class registro {

        public int id;
        public String nome;
        public String tipo;

        public String[] getinfo() {
            String[] info = {"" + id, nome, tipo};
            return info;
        }
    }

    public resumocadastros() {
        initComponents();
    }

    //posiciona os dados na matriz que alimenta a tabela
    public Object[][] getArray() {
        ArrayList<registro> ls = getRegistros();
        int length = ls.size();
        Object[][] s = new String[length][3];
        for (int i = 0; i < length; i++) {
            registro r = ls.get(i);
            for (int y = 0; y < 3; y++) {
                switch (y) {
                    case 0:
                        s[i][y] = "" + r.id;
                        break;
                    case 1:
                        s[i][y] = r.nome;
                        break;
                    case 2:
                        s[i][y] = r.tipo;
                        break;
                }
            }

        }

        return s;
    }

    //gera uma lista de dados extraídos do DB que popularão a tabela
    public ArrayList getRegistros() {
        ArrayList<registro> ls = new ArrayList();
        Connection con = new ConnectionFactory().getConnection();
        String sql = "SELECT id,nome FROM Pessoa";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                registro r = new registro();
                r.id = rs.getInt("id");
                r.nome = rs.getString("nome");
                r.tipo = "DESCONHECIDO";
                ls.add(r);
            }
            ps.close();
            try {
                sql = "SELECT id FROM Paciente";
                PreparedStatement ps1 = con.prepareStatement(sql);
                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    int x = rs1.getInt(1);
                    for (int i = 0; i < ls.size(); i++) {
                        registro r = ls.get(i);
                        if (r.id == x) {
                            r.tipo = "Paciente";
                            ls.remove(i);
                            ls.add(i, r);
                            break;
                        }
                    }
                }
                ps1.close();
                try {
                    sql = "SELECT id FROM RespFinFisico";
                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ResultSet rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        int x = rs2.getInt(1);
                        for (int i = 0; i < ls.size(); i++) {
                            registro r = ls.get(i);
                            if (r.id == x) {
                                r.tipo = "Responsável Financeiro - PF";
                                ls.remove(i);
                                ls.add(i, r);
                                break;
                            }
                        }
                    }
                    ps2.close();
                    try {
                        sql = "SELECT id FROM RespFinJuridico";
                        PreparedStatement ps3 = con.prepareStatement(sql);
                        ResultSet rs3 = ps3.executeQuery();
                        while (rs3.next()) {
                            int x = rs3.getInt(1);
                            for (int i = 0; i < ls.size(); i++) {
                                registro r = ls.get(i);
                                if (r.id == x) {
                                    r.tipo = "Responsável Financeiro - PJ";
                                    ls.remove(i);
                                    ls.add(i, r);
                                    break;
                                }
                            }
                        }
                        ps3.close();
                        try {
                            sql = "SELECT id FROM Usuario";
                            PreparedStatement ps4 = con.prepareStatement(sql);
                            ResultSet rs4 = ps4.executeQuery();
                            while (rs4.next()) {
                                int x = rs4.getInt(1);
                                for (int i = 0; i < ls.size(); i++) {
                                    registro r = ls.get(i);
                                    if (r.id == x) {
                                        r.tipo = "Usuario do Sistema ClinSys";
                                        ls.remove(i);
                                        ls.add(i, r);
                                        break;
                                    }
                                }
                            }
                            ps4.close();
                            con.close();

                        } catch (Exception e) {
                            System.out.println("Erro " + e);
                        }
                    } catch (Exception e) {
                        System.out.println("Erro " + e);
                    }
                } catch (Exception e) {
                    System.out.println("Erro " + e);
                }

            } catch (SQLException e) {
                System.out.println("Erro " + e);
            }
        } catch (SQLException e) {
            System.out.println("Erro " + e);
        }
        return ls;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Visualizar todos os Cadastros");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            getArray(),
            new String [] {
                "ID", "Nome", "Tipo de Registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(resumocadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resumocadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resumocadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resumocadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resumocadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
