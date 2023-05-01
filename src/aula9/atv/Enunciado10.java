package aula9.atv;

import aula9.model.CarroPojo.Carro;
import aula9.sql.SQLs;

public class Enunciado10 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(SQLs.DELETE.getQuery()+"aaa");
        System.out.println(carro.listAll());
    }
}
