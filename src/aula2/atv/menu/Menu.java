package aula2.atv.menu;

import aula2.atv.agencias.Agencia;
import aula2.atv.clientes.Cliente;
import aula2.atv.contas.ContaEspecial;
import aula2.atv.utils.OpcoesMenu;
import aula2.atv.utils.ValidaCpf;

import javax.swing.*;
import java.util.ArrayList;

public class Menu implements ValidaCpf {

    public static int exibeMenu(){
        String string_menu = "";
        for(OpcoesMenu opcaoMenu : OpcoesMenu.values())
            string_menu += opcaoMenu.toString();
        return Integer.parseInt(JOptionPane.showInputDialog(null,string_menu));

    }
    public static void main(String[] args) {
        ArrayList<ContaEspecial> contasEspeciais = new ArrayList<ContaEspecial>();
        ArrayList<Cliente> clientesTeste = new ArrayList<>();
        ArrayList<Cliente> clientesTeste1 = new ArrayList<>();

        Agencia ag = new Agencia(116,"Travessa A dos B 556");
        Agencia ag1 = new Agencia(215,"Travessa Veiga 666");
        clientesTeste.add(new Cliente("Isadora","11"));
        clientesTeste1.add(new Cliente("Luna","12"));
        clientesTeste1.add(new Cliente("Laika","13"));

        contasEspeciais.add(new ContaEspecial(ag,123d,115l,55000.00d,clientesTeste));
        contasEspeciais.add(new ContaEspecial(ag1,456d,118l,66000.00d,clientesTeste1));

        while (true) {
            switch (exibeMenu()) {
                case 1:
                    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

                    do {
                        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
                        if (JOptionPane.showInputDialog(null, "Digite o CPF do cliente:"){

                        }
                        //clientes.add(new Cliente(
                        //        JOptionPane.showInputDialog(null, "Digite o nome do cliente:"),
                        //        JOptionPane.showInputDialog(null, "Digite o CPF do cliente:")));

                    } while (JOptionPane.showConfirmDialog(null, "Deseja incluir outro cliente?") == 0);

                    ContaEspecial novaContaEspecial = new ContaEspecial(
                            new Agencia(Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Digite o numero da agencia:")),
                                    JOptionPane.showInputDialog(null, "Digite o endereco da agencia:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo:")),
                            Long.parseLong(JOptionPane.showInputDialog(null, "Digite o numero da conta:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite:")),
                            clientes
                    );
                    contasEspeciais.add(novaContaEspecial);
                    System.out.println(novaContaEspecial);
                    break;

                case 2:
                    boolean flag = false;
                    if (contasEspeciais != null && !contasEspeciais.isEmpty()){
                        for (ContaEspecial ce: contasEspeciais ) {
                            if (Long.parseLong(JOptionPane.showInputDialog(null,"Digite o numero da conta:")) == ce.getNumero()){
                                flag = true;
                                JOptionPane.showMessageDialog(null,ce.toString());
                            }else JOptionPane.showMessageDialog(null,"Não existe a conta pesquisada");
                        }
                    }else JOptionPane.showMessageDialog(null,"Não existe contas cadastradas");
                    break;

                case 3:
                    if (contasEspeciais != null && !contasEspeciais.isEmpty()){
                        for (ContaEspecial ce: contasEspeciais ) {
                            // uar flag aqui
                            if (Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero da agencia:")) == ce.getAgencia().getNumero() &&
                                Long.parseLong(JOptionPane.showInputDialog(null,"Digite o numero da conta:")) == ce.getNumero()
                            ){
                                   JOptionPane.showMessageDialog(null,ce.toString());
                            }else JOptionPane.showMessageDialog(null,"Não existe a conta ou agencia pesquisada");
                        }
                    }else JOptionPane.showMessageDialog(null,"Não existe contas cadastradas");
                    break;

                case 4:
                    if (contasEspeciais != null && !contasEspeciais.isEmpty()){
                        for (ContaEspecial ce: contasEspeciais ) {
                            for(Cliente cli: ce.getCliente()){
                                if(JOptionPane.showInputDialog(null,"Digite o CPF da conta:").equals(cli.getCpf())){
                                    JOptionPane.showMessageDialog(null,ce);
                                }
                            }
                        }
                    }else JOptionPane.showMessageDialog(null,"Não existe contas cadastradas");
                    break;

                case 5:
                    boolean flag1 = false;
                    if (contasEspeciais != null && !contasEspeciais.isEmpty()) {
                        for(ContaEspecial ce: contasEspeciais){
                            JOptionPane.showMessageDialog(null,ce);
                        }
                    }else JOptionPane.showMessageDialog(null,"Não existe contas cadastradas");
                    break;

                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
