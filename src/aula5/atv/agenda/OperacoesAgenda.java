package aula5.atv.agenda;

import java.util.List;

public interface OperacoesAgenda<E>{
    public boolean cadastrar(E obj);
    public List<E> listarTodos();
    public int totalizar();
    public boolean pesquisar(E obj);
    public boolean remover(E obj);
}
