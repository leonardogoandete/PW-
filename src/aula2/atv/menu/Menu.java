package aula2.atv.menu;

import aula2.atv.agencias.Agencia;
import aula2.atv.clientes.Cliente;
import aula2.atv.contas.ContaEspecial;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static int exibeMenu(){
        return Integer.parseInt(JOptionPane.showInputDialog(
                        "1 – Cadastrar Conta Especial \n" +
                        "2 – Pesquisar Conta Especial usando número\n" +
                        "3 - Pesquisar Conta Especial usando número da agência\n" +
                        "4 – Pesquisar Conta Especial usando o CPF do cliente \n" +
                        "5 - Listar todos os clientes \n" +
                        "6 - Sair \n" +
                        "Digite uma opção: " ));
    }
    public static void main(String[] args) {

        do {
            switch (exibeMenu()){
                case 1:
                    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

                    do {
                        clientes.add(new Cliente(
                                JOptionPane.showInputDialog(null, "Digite o nome do cliente:"),
                                JOptionPane.showInputDialog(null, "Digite o CPF do cliente:")));
                    }while (JOptionPane.showConfirmDialog(null, "Deseja incluir outro cliente?") == 0);

                    ContaEspecial ce = new ContaEspecial(
                            new Agencia(Integer.parseInt(
                                    JOptionPane.showInputDialog(null,"Digite o numero da agencia:")),
                                    JOptionPane.showInputDialog(null,"Digite o endereco da agencia:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo:")),
                            Long.parseLong(JOptionPane.showInputDialog(null, "Digite o numero da conta:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite:")),
                            clientes
                            );

                    System.out.println(ce);
                    break;


            }
        }while (exibeMenu() != 6);
    }
}
