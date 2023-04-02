package aula5.atv.agenda;

import java.util.List;

public interface OperacoesAgenda<T>{
    boolean cadastrar(T obj);
    List<T> listarTodos();
    int totalizar();
    boolean pesquisar(T t);
    boolean remover(T t);
}
