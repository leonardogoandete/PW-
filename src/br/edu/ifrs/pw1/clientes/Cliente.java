package br.edu.ifrs.pw1.clientes;

import br.edu.ifrs.pw1.contatos.Endereco;

import java.util.List;

public class Cliente {
    private String telefone;
    private List<Endereco> enderecos;

    public Cliente() {}
    public Cliente(String telefone, List<Endereco> enderecos) {
        super();
        this.telefone = telefone;
        this.enderecos = enderecos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @Override
    public String toString() {
        return "telefone:'" + telefone + '\'' +
                ",\nenderecos:" + enderecos;
    }
}
