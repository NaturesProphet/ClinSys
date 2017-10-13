//classe responsável por iniciar a aplicação
package Entidades;

import DAO.BD_2;
import Visao.*;
import java.util.Date;
import javax.swing.JOptionPane;

public class AppStart {

    public static void main(String[] args) {
        //esse trecho configura a aparência visual
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //tudo começa com o login, o login se encarrega de encaminhar o fluxo
        new telaLOGIN();
    }
}
