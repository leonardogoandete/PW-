package aula1.atv.teste1;

import aula1.atv.documentos.Cpf;

public class Teste1 {
    public static void main(String[] args) {
        Cpf c1 = new Cpf();
        Cpf c2 = new Cpf(123456789, 22);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1=c2;
        System.out.println(c1.toString());
    }
}
