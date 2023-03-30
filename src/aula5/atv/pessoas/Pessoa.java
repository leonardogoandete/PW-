package aula5.atv.pessoas;

import aula5.atv.contatos.Contato;

public class Pessoa {
    private String nome, cpf;
    private Contato contato;

    public Pessoa() {}

    public Pessoa(String nome, String cpf, Contato contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null){
            this.cpf = cpf;
        }
    }

    public Contato getContatos() {
        return contato;
    }

    public void setContatos(Contato contato) {
        if (contato != null) {
            this.contato = contato;
        }
    }

    @Override
    public String toString() {
        return "\nNome:"+getNome()+
               "\nCPF:"+getCpf()+
               "\nContato:"+getContatos();
    }
}
