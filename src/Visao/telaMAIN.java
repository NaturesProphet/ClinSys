package Visao;

//import DAO.BD;
import DAO.BD_2;
import Entidades.Paciente;
import Entidades.Pessoa;
import Entidades.RespFinFisico;
import Entidades.RespFinJuridico;
import Entidades.Usuario;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class telaMAIN extends javax.swing.JFrame {

    Usuario u;

    public telaMAIN(Usuario u) {

        initComponents();
        this.u = u;
        if (!u.getlogin().equals("admin")) {
            novousuario.setEnabled(false);
            novousuario.setText("Novo usuário do Sistema (REQUER ADMIN)");
            verlogs.setEnabled(false);
            verlogs.setText("Visualizar logs de acesso (REQUER ADMIN)");
        }
        setExtendedState(this.MAXIMIZED_BOTH);
        setVisible(true);
        setTitle("SISTEMA CLINSYS  -    " + u.getnome() + "  (" + u.getlogin() + ")"
                + " Ultimo acesso em: " + BD_2.lastLogin(u));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novousuario = new javax.swing.JMenuItem();
        verlogs = new javax.swing.JMenuItem();
        MENU = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA CLINSYS");
        setName("telaMAIN"); // NOI18N

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N

        jDesktopPane1.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(logo)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(105, 105, 105))
        );

        jMenu1.setText("Administração do sistema");

        novousuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        novousuario.setText("Novo usuário do Sistema");
        novousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novousuarioActionPerformed(evt);
            }
        });
        jMenu1.add(novousuario);

        verlogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/disquete20.jpg"))); // NOI18N
        verlogs.setText("Visualizar logs de acesso");
        verlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verlogsActionPerformed(evt);
            }
        });
        jMenu1.add(verlogs);

        jMenuBar1.add(jMenu1);

        MENU.setText("Cadastros");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        jMenuItem1.setText("Novo Paciente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MENU.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/3.gif"))); // NOI18N
        jMenuItem2.setText("Novo Responsável Financeiro");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MENU.add(jMenuItem2);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrow_refresh.png"))); // NOI18N
        jMenuItem10.setText("Ativar/Inativar Cadastros");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MENU.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/arrow_refresh.png"))); // NOI18N
        jMenuItem11.setText("Atualizar sua senha de acesso");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        MENU.add(jMenuItem11);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        jMenuItem14.setText("Visualizar todos os cadastros");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        MENU.add(jMenuItem14);

        jMenuBar1.add(MENU);

        jMenu2.setText("Consultas");

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        jMenu4.setText("Paciente");

        jMenuItem5.setText("buscar por ID");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("buscar por CPF");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem15.setText("Listar pacientes por seus responsáveis");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenu2.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/3.gif"))); // NOI18N
        jMenu5.setText("Responsável Financeiro");

        jMenuItem7.setText("buscar por ID");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem9.setText("buscar por Paciente");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuItem8.setText("buscar por Nome");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem12.setText("buscar por CNPJ");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("buscar por CPF");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Ajuda");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Manual do usuário");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("ClinSys");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/lampada.png"))); // NOI18N
        jMenuItem4.setText("sobre o CLINSYS...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/sair.png"))); // NOI18N
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        sobre janela = new sobre();

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadastroPaciente cadastro = new CadastroPaciente();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int rf = JOptionPane.showConfirmDialog(null, "Cadastrar como Pessoa Juridica?", "Responsável Financeiro", JOptionPane.YES_NO_OPTION);
        if (rf == 0) {
            tela_RespFinJuridico rfj = new tela_RespFinJuridico();
        } else {
            tela_RespFinFisico rff = new tela_RespFinFisico();
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        int idpac = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do PACIENTE"));
        //Paciente pac = BD.getpaciente(idpac);
        //ATUALIZADO
        Paciente pac = BD_2.getPaciente(idpac);

        if (pac == null) {
            JOptionPane.showMessageDialog(null, "A ID informada não foi encontrada nos registros");
        } else {
            resumoPaciente rp = new resumoPaciente(pac);
        }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        String cpfpac = JOptionPane.showInputDialog(null, "Informe o CPF do PACIENTE");
        Paciente pac = BD_2.getPaciente(cpfpac);
        if (pac == null) {
            JOptionPane.showMessageDialog(null, "O CPF informado não foi encontrado nos registros");
        } else {
            resumoPaciente rp = new resumoPaciente(pac);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        int id;
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID"));
            //Pessoa p = BD.getpessoa(id);
            //ATUALIZADO
            if ((id != 1)) {
                Pessoa p = BD_2.getPessoa(id);
                if (p != null) {
                    String stats = "INATIVO.";
                    String op = "\nDeseja Ativar este cadastro ?";
                    if (p.getstatus()) {
                        stats = "ATIVO.";
                        op = "\nDeseja Inativar este cadastro?";
                    }

                    int r = JOptionPane.showConfirmDialog(null, "O status de " + p.getnome() + " é" + stats + op);
                    if (r == 0) {
                        p.setstatus(!p.getstatus());//se perguntar eu nego mesmo
                        if (p.getstatus()) {
                            stats = "ATIVO.";
                        } else {
                            stats = "INATIVO.";
                        }
                        //BD.update(p);
                        //ATUALIZADO
                        BD_2.updatePessoa(p);
                        JOptionPane.showMessageDialog(null, "O cadastro de " + p.getnome() + " está " + stats);
                    } else {
                        JOptionPane.showMessageDialog(null, "nenhuma alteração realizada");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ID não reconhecida");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você não pode alterar o usuario ROOT do sistema");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite apenas numeros! assim deu o erro:\n" + e);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int idrf = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ID do Responsável"));
        //if (BD.getrf(idrf) == null) 
        //ATUALIZADO
        Pessoa rf = BD_2.getRespFin(idrf);
        if (rf == null) {
            JOptionPane.showMessageDialog(null, "A ID informada não foi encontrada nos registros");
        } else {
            if (rf instanceof RespFinFisico) {
                RespFinFisico rff = (RespFinFisico) rf;
                resumoRespFinFisico re = new resumoRespFinFisico(rff);
                re.setVisible(true);
            } else if (rf instanceof RespFinJuridico) {
                RespFinJuridico rfj = (RespFinJuridico) rf;
                resumoPJ wtfisthisshit = new resumoPJ(rfj);
            }
        }


    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed

    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        new ajuda();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        int ide;
        Paciente p;
        Pessoa responsavel;
        try {
            ide = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o ID do paciente"));
            //p = BD.getpaciente(ide);
            //ATUALIZADO
            p = BD_2.getPaciente(ide);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "O ID inserido não pertence a nenhum paciente registrado");
            } else {
                responsavel = p.getRespFin();
                if (responsavel instanceof RespFinFisico) {
                    resumoRespFinFisico resumo = new resumoRespFinFisico((RespFinFisico) responsavel);
                } else if (responsavel instanceof RespFinJuridico) {
                    resumoPJ resumo = new resumoPJ((RespFinJuridico) responsavel);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O ID fornecido é inválido, utilize apenas numeros");
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void novousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novousuarioActionPerformed
        if (u.getlogin().equals("admin")) {
            new telaUsuario().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "você não tem permissão. logue-se como admin");
        }
    }//GEN-LAST:event_novousuarioActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String old = JOptionPane.showInputDialog(null, "Digite sua senha antiga");
        if (u.getsenha().equals(old)) {
            String nova = JOptionPane.showInputDialog(null, "Digite sua nova senha");
            String nova2 = JOptionPane.showInputDialog(null, "Repita sua nova senha");
            if (nova.equals(nova2)) {
                u.setsenha(nova);
                if (BD_2.updateSenha(u.getidPessoa(), nova)) {
                    JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "As senhas não conferem. "
                        + "nenhuma alteração foi feita.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String nome = JOptionPane.showInputDialog(null, "Digite o nome ");
        Pessoa p = BD_2.getrespfin(nome);
        if (p != null) {
            if (p instanceof RespFinFisico) {
                new resumoRespFinFisico((RespFinFisico) p);
            } else if (p instanceof RespFinJuridico) {
                new resumoPJ((RespFinJuridico) p);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new resumocadastros().setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void verlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verlogsActionPerformed
        if (u.getlogin().equals("admin")) {
            new LogsAcesso().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão "
                    + "para visualizar logs de acesso. Logue-se como admin");
        }
    }//GEN-LAST:event_verlogsActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        String cnpj = JOptionPane.showInputDialog(null, "Digite o cnpj");
        RespFinJuridico pj = (RespFinJuridico) BD_2.getpj(cnpj);
        if (pj != null) {
            new resumoPJ(pj).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String cpf = JOptionPane.showInputDialog(null, "Digite o CPF");
        RespFinFisico rf = (RespFinFisico) BD_2.getrf(cpf);
        if (rf != null) {
            new resumoRespFinFisico(rf).setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do responsável"));
            Pessoa respfin = BD_2.getRespFin(id);
            if (respfin != null) {
                new PacientesPorRF(respfin).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"esta ID não pertence a um Responsável");
            }

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O id é composto apenas por numeros. "
                    + "não utilize outros caracteres.\n" + e);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MENU;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuItem novousuario;
    private javax.swing.JMenuItem verlogs;
    // End of variables declaration//GEN-END:variables
}
