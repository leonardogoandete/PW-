package br.edu.ifrs.pw1.testeClienteCpf;

import br.edu.ifrs.pw1.clientes.ClientePessoaFisica;
import br.edu.ifrs.pw1.contatos.Endereco;
import br.edu.ifrs.pw1.documentos.Cpf;

import java.util.ArrayList;
import java.util.List;

public class TesteClienteCpf {

    public static void main(String[] args) {
        Endereco end = new Endereco("aadasf","casa",59499);
        Endereco end1 = new Endereco("aaaaaaf","casa",59499);
        List<Endereco> enderecos = new ArrayList<>();

        enderecos.add(end);
        enderecos.add(end1);

        Cpf cpf = new Cpf(4945455,55);
        ClientePessoaFisica cli1 = new ClientePessoaFisica("5156215",enderecos,"Leo",cpf);

        System.out.println(cli1.toString());
    }
}
