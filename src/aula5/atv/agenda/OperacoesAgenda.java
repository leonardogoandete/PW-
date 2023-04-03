package aula5.atv.agenda;

import java.util.TreeSet;

public interface OperacoesAgenda<T>{
    boolean cadastrar(T obj);
    TreeSet<T> listarTodos();
    int totalizar();
    boolean pesquisar(T t);
    boolean remover(T t);
}
