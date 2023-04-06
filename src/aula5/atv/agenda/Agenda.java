package aula5.atv.agenda;

import aula5.atv.pessoas.Pessoa;

import java.util.Comparator;
import java.util.TreeSet;

public class Agenda implements OperacoesAgenda{
    private List<Pessoa> pessoas;

    public Agenda(){
        pessoas = new ArrayList<>();
    }

    @Override
    public boolean cadastrar(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("O objeto de inserção não pode ser nulo.");
        }
        return listaPessoas.add(o);
    }

    @Override
    public TreeSet<Pessoa> listarTodos() {
        TreeSet<Pessoa> conjuntoPessoas = new TreeSet<>(new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa pessoa1, Pessoa pessoa2) {
                return pessoa1.getNome().compareToIgnoreCase(pessoa2.getNome());
            }
        });
        for (Object item : listaPessoas) {
            try {
                Pessoa pessoa = (Pessoa) item;
                conjuntoPessoas.add(pessoa);
            } catch (ClassCastException e) {
                // Se o item não pode ser convertido para Pessoa, passa para o próximo item
            }
        }
        return conjuntoPessoas;
    }

    @Override
    public int totalizar() {
        if (listaPessoas == null) return 0; 
        else return listaPessoas.size();
    }

   @Override
   public boolean pesquisar(Object o) { 
       if (listaPessoas.isEmpty()) {
           return false;
       }
       if (o == null) {
           throw new IllegalArgumentException("O objeto de pesquisa nao pode ser nulo.");
       }
       for (Object item : listaPessoas) {
           if (item == o) {
               return true;
           }
       }
       return false;
   }
   /* Outro tipo de implementacao
    public boolean pesquisar(String nome) {
        Pessoa p = new Pessoa();
        p.setNome();
        return agenda.contains(p);
   */

    @Override
    public boolean remover(Object o) {
        if (listaPessoas.isEmpty()) {
            return false;
        }
        if (o == null) {
            throw new IllegalArgumentException("O objeto a ser removido nao pode ser nulo.");
        }
        if (listaPessoas.contains(o)) {
            listaPessoas.remove(o);
            return true;
        }
        return false;
    }

    public void ordenar() {
        Collections.sort(pessoas);
    }
}
