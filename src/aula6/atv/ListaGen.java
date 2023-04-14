package aula6.atv;

public interface ListaGen<E> {
    public void adicionar(E obj);
    public E remover();
    //qual método usar para remover o primeiro elemento da lista?
    public String listar();
    public int totalizar();
    public void removerTodos();
    public boolean contemElemento(E obj);
    public E pegarElemento(int i);
    public E pegarPrimeiroElemento();
    public E pegarUltimoElemento();
    public void removerElementoPosicao(int indice);
}
