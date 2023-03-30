package aula5.atv.agenda;

import java.util.Collection;

public interface OperacoesAgenda{

    boolean cadastrar(Object obj);
    Collection<Object> listarTodos();
    int totalizar();
    boolean pesquisar(Object obj);
    boolean remover(Object obj);

}
