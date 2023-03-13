package br.edu.ifrs.pw1.menu;

import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

    public static void menu(){
        System.out.println("1 - Cadastrar Cliente Pessoa Física \n" +
                "2 - Pesquisar Cliente Pessoa Física pelo nome \n" +
                "3 - Pesquisar Cliente Pessoa Física pelo CPF \n" +
                "4 – Pesquisar Cliente Pessoa Física pelo endereço \n" +
                "5 - Listar todos os clientes \n" +
                "6 - Sair \n" +
                "Digite uma opção: " );
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<ClientePessoaFisica> clientes = new ArrayList<>();
        int opc;
        String escolha;

        do {
            menu();
            //System.out.println("Digite uma opção: " );
            opc = sc.nextInt();
            sc.nextLine(); // limpa o bufer do teclado

            switch (opc) {
                case 1:
                    List<Endereco> enderecos = new ArrayList<>();

                    // COnfigurando nome e telefone do cliente
                    System.out.println("Cadastro de clientes" );
                    System.out.println("Digite o nome:" );
                    String nome = sc.nextLine();
                    System.out.println("Digite o telefone" );
                    String telefone = sc.nextLine();

                    // Configurando CPF do cliente
                    System.out.println("Digite o CPF:" );
                    String cpf = sc.nextLine();
                    long cpfParteInicial = Long.parseLong(cpf.substring(0,9)); // cast de String para long
                    int cpfParteFinal = Integer.parseInt(cpf.substring(9,11)); // cast de String para Int
                    Cpf cpfCompleto = new Cpf(cpfParteInicial, cpfParteFinal);

                    // Configurando Endereco do cliente
                    do{
                        System.out.println("Digite o nome da rua:" );
                        String logradouro = sc.nextLine();
                        System.out.println("Digite o complemento:" );
                        String complemento = sc.nextLine();
                        System.out.println("Digite o CEP:" );
                        long cep = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Deseja incluir outro endereco? [S / N]:");
                        escolha = sc.nextLine().toLowerCase();

                        //Endereco endereco = new Endereco();
                        enderecos.add(new Endereco(logradouro, complemento, cep));
                    }while(escolha.equals("s"));

                    clientes.add(new ClientePessoaFisica(telefone, enderecos, nome, cpfCompleto));
                    System.out.println("CLiente " + nome + " adicionado com sucesso!\nPressione enter para continuar!");
                    System.in.read();
                    break;
                case 2:
                    if (!clientes.isEmpty()) {
                        System.out.println("Digite o nome desejado:");
                        String buscaNome = sc.nextLine();
                        System.out.println("Pesquisando clientes com nome:" + buscaNome);

                        for (ClientePessoaFisica cli : clientes) {
                            if (buscaNome.equals(cli.getNome())) {
                                System.out.println(cli);
                            }
                        }
                    }else System.out.println("Nao há clientes cadastrados!");
                    System.out.println("\nPressione enter para continuar");
                    System.in.read();
                    break;
                case 3:
                    if (!clientes.isEmpty()) {
                        System.out.println("Digite o CPF do cliente desejado:");
                        String buscaCpf = sc.nextLine();
                        System.out.println("Pesquisando cliente com o CPF:" + buscaCpf);

                        long cpfBuscaParteInicial = Long.parseLong(buscaCpf.substring(0,9)); // cast de String para long
                        int cpfBuscaParteFinal = Integer.parseInt(buscaCpf.substring(9,11)); // cast de String para Int

                        for (ClientePessoaFisica cli : clientes) {
                            if (cli.getCpf().getNumero() == cpfBuscaParteInicial && cli.getCpf().getDigito() == cpfBuscaParteFinal) {
                                System.out.println(cli);
                            }
                        }
                    }else System.out.println("Nao há clientes cadastrados!");
                    System.out.println("\nPressione enter para continuar!");
                    System.in.read();
                    break;
                case 4:
                    if (!clientes.isEmpty()) {
                        System.out.println("Digite o endereco do cliente desejado:");
                        String buscaEndereco = sc.nextLine();
                        System.out.println("Pesquisando clientes que contem endereco: " + buscaEndereco);

                        for (ClientePessoaFisica cli : clientes) {
                            for (int i = 0; i < cli.getEnderecos().size(); i++) { //percorre o array de enderecos dos clientes
                                if (cli.getEnderecos().get(i).getLogradouro().equals(buscaEndereco)) { // se tiver o endereco pesquisado retorna o cliente
                                    System.out.println(cli);
                                }
                            }
                        }
                    }else System.out.println("Nao há clientes cadastrados!");
                    System.out.println("\nPressione enter para continuar!");
                    System.in.read();
                    break;
                case 5:
                    if (!clientes.isEmpty()) {
                        System.out.println("Listando clientes:");
                        System.out.println(clientes);
                    } else System.out.println("Nao há clientes cadastrados!");
                    System.out.println("\nPressione enter para continuar!");
                    System.in.read();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida" );
                    break;
            }
        } while (opc != 6) ;
    }}