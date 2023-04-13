package aula5.atv.agenda;

import aula5.atv.pessoas.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda implements OperacoesAgenda<Pessoa>{
    private List<Pessoa> listaPessoas;

    public Agenda(){
        listaPessoas = new ArrayList<>();
    }

    @Override

    public boolean cadastrar(Pessoa obj) {
        if (obj == null) {
            throw new IllegalArgumentException("O objeto de inserção não pode ser nulo.");
        }
        return listaPessoas.add(obj);
    }

    @Override
    public List<Pessoa> listarTodos() {
        return listaPessoas;
    }

    @Override
    public int totalizar() {
        if (listaPessoas == null) {
            throw new IllegalArgumentException("Erro ao contabilizar o total de pessoas.");
        }
        return listaPessoas.size();
    }

   @Override
   public boolean pesquisar(Pessoa obj) {
       return listaPessoas.contains(obj);
   }
    @Override
    public boolean remover(Pessoa obj) {
        if (obj == null) {
            throw new IllegalArgumentException("O objeto a ser removido nao pode ser nulo.");
        }
        return listaPessoas.remove(obj);
    }

    public String toString() {
        String aux ="";
        for (Pessoa pessoa : listaPessoas) {
            if(pessoa != null)
                aux+= pessoa.toString();
        }
        return aux;
    }

    public void ordenar() {
        Collections.sort(listaPessoas);
    }
}
