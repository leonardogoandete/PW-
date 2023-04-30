package aula6.atv;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinhaListaGenerica<E> implements ListaGen<E>{
    LinkedList<E> minhaLista = new LinkedList<>();

    @Override
    public void adicionar(E obj) {
        minhaLista.add(obj);
    }

    @Override
    public E remover() {
        return (E) minhaLista.removeFirst();
        
    }

    @Override
    public String listar() {
        String aux = "";
        for(Object obj : minhaLista){
            aux += minhaLista.toString()+"\n";
        }
        return aux;
    }

    @Override
    public int totalizar() {
        return minhaLista.size();
    }

    @Override
    public void removerTodos() {
        minhaLista.clear();
    }

    @Override
    public boolean contemElemento(E obj) {
        return minhaLista.contains(obj);
    }

    @Override
    public E pegarElemento(int i) {
        try{
            return minhaLista.get(i);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Indice maior que o tamanho da lista!");
        }
        return null;
    }

    @Override
    public E pegarPrimeiroElemento() throws NoSuchElementException {
        return minhaLista.getFirst();
    }

    @Override
    public E pegarUltimoElemento() {
        throw new NoSuchElementException("Não há elementos na lista!");
    }

    @Override
    public void removerElementoPosicao(int indice) {
        try {
            minhaLista.remove(indice);
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("Não foi possivel remover elemento \nErro: " + e);
        }
    }
}
