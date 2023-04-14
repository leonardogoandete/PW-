package aula6.atv;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MinhaListaGenerica implements ListaGen{
    LinkedList<Object> minhaLista;

    public MinhaListaGenerica(){
        minhaLista = new LinkedList<>();
    }

    @Override
    public void adicionar(Object obj) {
        minhaLista.add(obj);
    }

    @Override
    public Object remover() {
        minhaLista.remove();
        return null;
    }

    @Override
    public String listar() {
        return minhaLista.toString();
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
    public boolean contemElemento(Object obj) {
        return minhaLista.contains(obj);
    }

    @Override
    public Object pegarElemento(int i) {
        try{
            return (Object) minhaLista.get(i);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Indice maior que o tamanho da lista!");
            return null;
        }
    }

    @Override
    public Object pegarPrimeiroElemento() throws NoSuchElementException {
        return minhaLista.getFirst();
    }

    @Override
    public Object pegarUltimoElemento() {
        if(minhaLista.isEmpty()) throw new NoSuchElementException("Não há elementos na lista!");
        return minhaLista.getLast();
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
