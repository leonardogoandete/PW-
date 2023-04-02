package aula5.atv;

import aula5.atv.agenda.Agenda;
import aula5.atv.contatos.Telefone;
import aula5.atv.pessoas.Pessoa;

public class MenuAgenda {
    public static void main(String[] args) {
        Agenda ag = new Agenda();

        Pessoa p1 = new Pessoa("Leo","12345", new Telefone(51,12345L));
        Pessoa p2 = new Pessoa("Lari","5687", new Telefone(51,34783L));
        Pessoa p3 = new Pessoa("Bidu", "2524646", new Telefone(13,3435L));
        ag.cadastrar(p1);
        ag.cadastrar(null);


        System.out.println(ag.listarTodos());
        /*
        System.out.println("Total: "+ag.totalizar());
        ag.remover(p1);
        System.out.println("after remove:\n"+ ag.listarTodos());
        System.out.println("Total: "+ag.totalizar());
        System.out.println("Procurando nome:"+ ag.pesquisar(p2));
        */
        //ag.pesquisar(null);


    }
}
