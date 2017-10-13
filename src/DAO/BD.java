/*
Como ainda não estudamos a implementação de banco com java, fiz esta classe utilizando
metodos estaticos afim de servir-nos como um banco de dados volátil, que será
util para os testes do sistema.
os dados não persistem após o fim da execução.
 */
/*
ATUALIZAÇÃO EM OUTUBRO DE 2017
Agora sabemos implementar o banco de dados e não precisaremos mais dessa classe.
A mesma está aqui apenas como referência dos tempos sombrios ;)
Sinta-se a vontade para ignorar o conteúdo deste arquivo.
*/

package DAO;

import Entidades.Endereco;
import Entidades.Paciente;
import Entidades.Pessoa;
import Entidades.RespFinFisico;
import Entidades.RespFinJuridico;
import Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class BD {

    private static int ID; //contador para gerar os codigos de IDPessoa

    //Dados de endereço:
    private static ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private static int Contagemenderecos; //este contador gerará os IDs de endereço

    //dados de usuarios
    private static ArrayList<Usuario> users = new ArrayList<Usuario>();

    //dados de RespFinJuridico
    private static ArrayList<RespFinJuridico> rfj = new ArrayList<RespFinJuridico>();

    //dados de RespFinFisico
    private static ArrayList<RespFinFisico> rff = new ArrayList<RespFinFisico>();

    //dados de Pacientes
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

    /*
##################################################################
###################### TABELA DE ENDEREÇOS #######################
##################################################################
     */
    public static void add(Endereco e) {
        Contagemenderecos++; //gerei o id do endereço
        e.setcodigo(Contagemenderecos); //apliquei este id no objeto
        enderecos.add(e); //armazenei o objeto
        JOptionPane.showMessageDialog(null, "Endereço armazenado com sucesso! Codigo: " + Contagemenderecos);
    }

    public static void add(Endereco e, int id) {
        e.setcodigo(id); //apliquei este id no objeto
        enderecos.add(e); //armazenei o objeto
        //JOptionPane.showMessageDialog(null, "Endereço armazenado com sucesso! Codigo: " + id);
    }

    //metodo para buscar um endereco pelo seu id
    public static Endereco getendereco(int id) {
        for (int i = 0; i < enderecos.size(); i++) {
            if (enderecos.get(i) != null) { //verifico se a posicao existe, pra não tomar um NULL POINTER EXCEPTION
                if (enderecos.get(i).getcodigo() == id) { //se o id for o mesmo da busca e tal..
                    return enderecos.get(i); //vem pro papai
                }
            }
        }
        return null;
    }

    //para calcular IDs
    public static int getContagemenderecos() {
        return Contagemenderecos;
    }

    /*
##################################################################
###################### TABELA DE USUARIOS ########################
##################################################################
     */
    public static void add(Usuario u) {
        ID++;
        u.setstatus(true);
        u.setidPessoa(ID);
        users.add(u);
    }

    public static Usuario getusuario(String u) {
        Usuario U = null;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i) != null) {
                if (users.get(i).getlogin().equals(u)) {
                    U = users.get(i);

                }
            }
        }
        return U;
    }

    /*
##################################################################
#################### TABELA DE RESPFIN JURIDICO ##################
##################################################################
     */
    public static void add(RespFinJuridico r) {
        ID++;
        r.setidPessoa(ID);
        r.setstatus(true);
        rfj.add(r);
        JOptionPane.showMessageDialog(null, "Responsável Financeiro (Pessoa Juridica) Cadastrado com Sucesso. ID: " + ID);
    }

    public static void add(RespFinJuridico r, int id) {
        r.setidPessoa(id);
        r.setstatus(true);
        rfj.add(r);
        // JOptionPane.showMessageDialog(null, "Responsável Financeiro (Pessoa Juridica) Cadastrado com Sucesso. ID: " + id);
    }

    //busca um RespFinJuridico pelo id
    public static RespFinJuridico getrfj(int id) {
        RespFinJuridico Rfj = null;
        for (int i = 0; i < rfj.size(); i++) {
            if (rfj.get(i) != null) {
                if (rfj.get(i).getidPessoa() == id) {
                    Rfj = rfj.get(i);
                }
            }
        }
        return Rfj;
    }

    //um metodo misto, que fuça tabelas de Pessoa Fisica e Juridica em busca do respfin
    public static Pessoa getrf(int id) {
        if (getrfj(id) != null) {
            return getrfj(id);
        }
        if (getrff(id) != null) {
            return getrff(id);
        }
        return null;
    }

    /*
##################################################################
#################### TABELA DE RESPFIN FISICO ####################
##################################################################
     */
    public static void add(RespFinFisico rf) {
        ID++;
        rf.setstatus(true);
        rf.setidPessoa(ID);
        rff.add(rf);
        JOptionPane.showMessageDialog(null, "Responsável Financeiro (Pessoa Fisica) " + rf.getnome() + "registrado com sucesso! ID: " + ID);
    }

    public static void add(RespFinFisico rf, int id) {
        rf.setidPessoa(id);
        rf.setstatus(true);
        rff.add(rf);
        //JOptionPane.showMessageDialog(null, "Responsável Financeiro (Pessoa Fisica) " + rf.getnome() + "registrado com sucesso! ID: " + ID);
    }

    public static RespFinFisico getrff(int id) {
        RespFinFisico Rff = null;
        for (int i = 0; i < rff.size(); i++) {
            if (rff.get(i) != null) {
                if (rff.get(i).getidPessoa() == id) {
                    Rff = rff.get(i);

                }
            }
        }
        return Rff;
    }

    /*
##################################################################
##################### TABELA DE PACIENTES ########################
##################################################################
     */
    //metodo generico para adicionar um paciente novo com id nova
    public static void add(Paciente p) {
        ID++;
        p.setidPessoa(ID);
        p.setstatus(true);
        pacientes.add(p);
        JOptionPane.showMessageDialog(null, "Paciente " + p.getnome() + " registrado com sucesso. ID: " + ID);
    }

    //metodo para adicionar um paciente cujo ID já exista como um respfin
    public static void add(Paciente p, int id) {
        p.setidPessoa(id);
        p.setstatus(true);
        pacientes.add(p);
        JOptionPane.showMessageDialog(null, "Paciente " + p.getnome() + " registrado com sucesso. ID: " + id);
    }

    //retorna um paciente com a ID informada
    public static Paciente getpaciente(int id) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i) != null) {
                if (pacientes.get(i).getidPessoa() == id) {
                    return pacientes.get(i);

                }
            }
        }
        return null;
    }

    //retorna um paciente com o cpf informado
    public static Paciente getpaciente(String cpf) {
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i) != null) {
                if (new String(pacientes.get(i).getcpf()).equals(cpf)) {
                    return pacientes.get(i);
                }
            }
        }
        return null;
    }

    public static Pessoa getpessoa(int id) {
        Pessoa respfin = getrf(id);
        Pessoa pac = getpaciente(id);
        if (respfin != null && pac == null) {
            return respfin;
        } else if (respfin == null && pac != null) {
            return pac;
        } else if (respfin != null && pac != null) {
            try {
                int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Encontrei um paciente que é seu próprio responsável, deseja visualizar qual tabela? (1 responsável, 2 paciente)"));
                if (x == 1 || x == 2) {
                    if (x == 1) {
                        return respfin;
                    } else {
                        return pac;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha inválida, tuilize apenas \"1\" ou \"2\"");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ID inválido");
            }

        }
        return null;
    }

    public static void update(Pessoa p) {
        if (p instanceof Paciente) {
            pacientes.remove(p);
            try {
                pacientes.add((Paciente) p);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (p instanceof RespFinFisico){
            rff.remove(p);
            try {
                rff.add((RespFinFisico)p);
            } catch(Exception e) {
                 JOptionPane.showMessageDialog(null, e);
            }
        }

    }

}
