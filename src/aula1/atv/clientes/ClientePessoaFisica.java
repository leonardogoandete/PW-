package aula1.atv.clientes;

import aula1.atv.contatos.Endereco;
import aula1.atv.documentos.Cpf;

import java.util.List;

public class ClientePessoaFisica extends Cliente{

    private String nome;
    private Cpf cpf;

    public ClientePessoaFisica(){}

    public ClientePessoaFisica(String telefone, List<Endereco> enderecos, String nome, Cpf cpf) {
        super(telefone, enderecos); // chama o construtor da superclasse
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "\nnome:" + nome + "\nCPF: " + cpf + ",\n" + super.toString() + "\n";
    }
}
