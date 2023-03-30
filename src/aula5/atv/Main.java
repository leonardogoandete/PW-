package aula5.atv;

import aula5.atv.contatos.Contato;
import aula5.atv.contatos.Telefone;
import aula5.atv.pessoas.Pessoa;

public class Main {
    public static void main(String[] args) {
        //Telefone telefone = new Telefone(51,991561597L);
        Contato ct = new Contato();
        ct.setDdd(51);
        ct.setNumero(991561597L);

        System.out.println(ct.toString());

        Pessoa p1 = new Pessoa(null,"18035208764",ct);
        System.out.println(p1);

    }
}
