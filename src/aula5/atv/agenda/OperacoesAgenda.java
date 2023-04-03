package aula5.atv.agenda;

import java.util.TreeSet;

public interface OperacoesAgenda<E>{
    boolean cadastrar(E e);
    TreeSet<E> listarTodos();
    int totalizar();
    boolean pesquisar(E e);
    boolean remover(E e);
}
