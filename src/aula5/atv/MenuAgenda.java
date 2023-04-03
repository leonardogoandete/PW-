package aula5.atv;

import aula5.atv.agenda.Agenda;
import aula5.atv.contatos.Telefone;
import aula5.atv.pessoas.Pessoa;
import aula5.atv.utils.OpcoesMenu;
import javax.swing.*;


public class MenuAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        while (true) {
            switch (exibeMenu()) {
                case 1:
                    agenda.cadastrar(new Pessoa(
                            JOptionPane.showInputDialog(null,"Digite o nome"),
                            JOptionPane.showInputDialog(null,"Digite o CPF:"),
                            new Telefone(
                                    Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o DDD")),
                                    Long.parseLong(JOptionPane.showInputDialog(null,"Digite o numero:")))
                            ));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,agenda.listarTodos());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,agenda.totalizar());
                    break;
                case 4:
                    //implementar
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Saindo...");
                    System.exit(0);
                    break;
                case 6:
                    System.out.println(agenda.listarTodos());
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida!");
                    break;
            }
        }
    }

    public static int exibeMenu() {
        StringBuilder stringMenu = new StringBuilder();
        for (OpcoesMenu opcaoMenu : OpcoesMenu.values())
            stringMenu.append(opcaoMenu.toString());
        return Integer.parseInt(JOptionPane.showInputDialog(null, stringMenu.toString()));
    }
}
