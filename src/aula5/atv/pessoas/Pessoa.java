package aula5.atv.pessoas;

import aula5.atv.contatos.Contato;
import java.util.Objects;

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
               "\n\tContato:"+ (contato != null ? getContatos() : "Não cadastrado")+"\n";
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Pessoa other = (Pessoa) obj;
        return Objects.equals(nome, other.nome);
    }

    @Override
    public int compareTo(Pessoa obj){
        return this.nome.compareTo(obj.nome);
    }

}
