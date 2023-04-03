package aula5.atv.pessoas;

import aula5.atv.contatos.Contato;

public class Pessoa implements Comparable<Pessoa> {
    private String nome, cpf;
    private Contato contato;

    public Pessoa() {
    }

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
        return "\n\tNome:"+getNome()+
               "\n\tCPF:"+getCpf()+
               "\n\tContato:"+getContatos()+"\n";
    }

    @Override
    public int compareTo(Pessoa outraPessoa){
        return this.nome.compareTo(outraPessoa.nome);
    }
    /*
    @Override
    public int compare(Pessoa p, Pessoa outraPessoa) {
        return p.getNome().
                compareTo(outraPessoa.getNome());
    }

     */
}
