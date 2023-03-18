package questionario1.atv;

import questionario1.atv.pessoas.Dependente;
import questionario1.atv.pessoas.Socio;
import questionario1.atv.contatos.Telefone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList dependentes = new ArrayList<>();
        dependentes.add(new Dependente(789456123,"Isadora", "Travessa Teste 123", "isadora@gmail.com","primo"));

        Telefone telefone = new Telefone(51,99999999);
        Socio socio = new Socio(123456789,"Laika","Travessa B 256","laika@laika.com",telefone,dependentes);


        System.out.println(socio.toString());

    }
}
