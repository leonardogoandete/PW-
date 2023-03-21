package questionario1.atv;

import questionario1.atv.pessoas.Dependente;
import questionario1.atv.pessoas.Socio;
import questionario1.atv.contatos.Telefone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList dependentes = new ArrayList<>();
        dependentes.add(new Dependente(789456123L,"Wolverine", "Travessa Teste 123", "wolverine@bol.com","primo"));
        dependentes.add(new Dependente(454118198L,"Jean Grey", "Travessa Teste 456", "jean_grey@bol.com","sobrinho"));

        Telefone telefone = new Telefone(51,999996666L);
        Socio socio = new Socio(123456789L,"Charles Xavier","Travessa B 256","charles_xavier@bol.com",telefone,dependentes);


        System.out.println(socio.toString());


    }
}
