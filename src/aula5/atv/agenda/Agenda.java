package aula5.atv.agenda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda implements OperacoesAgenda{
    private List<Object> listaPessoas = new ArrayList<>();


    @Override
    public boolean cadastrar(Object o) {
        if (o == null) {
            throw new IllegalArgumentException("O objeto de inserção não pode ser nulo.");
        }
        return listaPessoas.add(o);
    }

    @Override
    public List<Object> listarTodos() {
        return listaPessoas != null ? listaPessoas : new ArrayList<>();
    }

    @Override
    public int totalizar() {
        if (listaPessoas.isEmpty()) {
            return 0;
        } else {
            return listaPessoas.size();
        }
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
}
