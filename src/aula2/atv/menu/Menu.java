package aula2.atv.menu;

import aula2.atv.agencias.Agencia;
import aula2.atv.clientes.Cliente;
import aula2.atv.contas.ContaEspecial;
import aula2.atv.utils.OpcoesMenu;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static int exibeMenu(){
        String string_menu = "";
        for(OpcoesMenu opcaoMenu : OpcoesMenu.values())
            string_menu += opcaoMenu.toString();
        return Integer.parseInt(JOptionPane.showInputDialog(null,string_menu));

    }
    public static void main(String[] args) {

        //do {
        while (true) {
            switch (exibeMenu()) {
                case 1:
                    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

                    do {
                        clientes.add(new Cliente(
                                JOptionPane.showInputDialog(null, "Digite o nome do cliente:"),
                                JOptionPane.showInputDialog(null, "Digite o CPF do cliente:")));
                    } while (JOptionPane.showConfirmDialog(null, "Deseja incluir outro cliente?") == 0);

                    ContaEspecial ce = new ContaEspecial(
                            new Agencia(Integer.parseInt(
                                    JOptionPane.showInputDialog(null, "Digite o numero da agencia:")),
                                    JOptionPane.showInputDialog(null, "Digite o endereco da agencia:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o saldo:")),
                            Long.parseLong(JOptionPane.showInputDialog(null, "Digite o numero da conta:")),
                            Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o limite:")),
                            clientes
                    );
                    break;
                case 2:
                    System.out.println("teste");
                    break;
                case 6:
                    System.exit(0);
                    break;


            }
            //}while (exibeMenu() != 6);
        }
    }
}
