package aula1.atv.menu;

import aula1.atv.clientes.ClientePessoaFisica;
import aula1.atv.contatos.Endereco;
import aula1.atv.documentos.Cpf;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    public static int menu(){
        return Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Cliente Pessoa Física \n" +
                "2 - Pesquisar Cliente Pessoa Física pelo nome \n" +
                "3 - Pesquisar Cliente Pessoa Física pelo CPF \n" +
                "4 – Pesquisar Cliente Pessoa Física pelo endereço \n" +
                "5 - Listar todos os clientes \n" +
                "6 - Sair \n" +
                "Digite uma opção: " ));
    }

    public static void main(String[] args) throws IOException {
        List<ClientePessoaFisica> clientes = new ArrayList<>();

        //do {
        while(menu() != 6) {
            switch (menu()) {
                case 1:
                    List<Endereco> enderecos = new ArrayList<>();

                    String cpf = JOptionPane.showInputDialog(null, "Digite o CPF:");
                    long cpfParteInicial = Long.parseLong(cpf.substring(0, 9)); // cast de String para long
                    int cpfParteFinal = Integer.parseInt(cpf.substring(9, 11)); // cast de String para Int
                    Cpf cpfCompleto = new Cpf(cpfParteInicial, cpfParteFinal);

                    // Configurando Endereco do cliente
                    do {
                        enderecos.add(new Endereco(
                                JOptionPane.showInputDialog(null, "Digite o endereco:"),
                                JOptionPane.showInputDialog(null, "Digite o complemento:"),
                                Long.parseLong(JOptionPane.showInputDialog(null, "Digite o CEP:"))));
                    } while (JOptionPane.showConfirmDialog(null, "Deseja incluir outro endereco?") == 0);

                    clientes.add(new ClientePessoaFisica(
                            JOptionPane.showInputDialog(null, "Digite o telefone:"),
                            enderecos,
                            JOptionPane.showInputDialog(null, "Digite o nome:"),
                            cpfCompleto));
                    break;
                case 2:
                    if (clientes != null && !clientes.isEmpty()) {
                        for (ClientePessoaFisica cli : clientes) {
                            if (JOptionPane.showInputDialog(null, "Digite o nome:").equals(cli.getNome())) {
                                JOptionPane.showMessageDialog(null, cli);
                            }
                        }
                    } else JOptionPane.showMessageDialog(null, "Nao ha clientes cadastrados!");
                    break;
                case 3:
                    if (clientes != null && !clientes.isEmpty()) {
                        String buscaCpf = JOptionPane.showInputDialog(null, "Digite o CPF:");
                        long cpfBuscaParteInicial = Long.parseLong(buscaCpf.substring(0, 9));
                        int cpfBuscaParteFinal = Integer.parseInt(buscaCpf.substring(9, 11));

                        for (ClientePessoaFisica cli : clientes) {
                            if (cli.getCpf().getNumero() == cpfBuscaParteInicial && cli.getCpf().getDigito() == cpfBuscaParteFinal) {
                                System.out.println(cli);
                            }
                        }
                    } else JOptionPane.showMessageDialog(null, "Nao ha clientes cadastrados!");
                    break;
                case 4:
                    if (clientes != null && !clientes.isEmpty()) {
                        //boolean flag = true;
                        for (ClientePessoaFisica cli : clientes) {
                            for (Endereco endereco : cli.getEnderecos()) { //percorre o array de enderecos dos clientes
                                if (endereco.equals(JOptionPane.showInputDialog(null, "Digite o endereco:"))) { // se tiver o endereco pesquisado retorna o cliente
                                    JOptionPane.showMessageDialog(null, cli);
                                }
                                // implementar a flag
                            }
                        }
                    } else JOptionPane.showMessageDialog(null, "Nao ha clientes cadastrados!");
                    break;
                case 5:
                    if (clientes != null && !clientes.isEmpty()) {
                        for (ClientePessoaFisica cli : clientes) {
                            JOptionPane.showMessageDialog(null, clientes);
                        }
                    } else JOptionPane.showMessageDialog(null, "Nao ha clientes cadastrados!");
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Mensagem invalida!");
                    break;
            }
        }
        //} while (menu() != 6) ;
    }}