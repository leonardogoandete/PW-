package aula6.atv;

import java.util.NoSuchElementException;

public class Teste {

    public static void main(String[] args) {
        MinhaListaGenerica ml = new MinhaListaGenerica();

        //ml.pegarElemento(14);

        try{
            ml.pegarPrimeiroElemento();
        }catch (NoSuchElementException e){
            System.out.println("Não eh possivel pegar o primeiro elemento! \n Erro: " + e);
        }

        //ml.pegarUltimoElemento();
        //ml.removerElementoPosicao(55);

        System.out.println("aaaaaaa");
    }
}
