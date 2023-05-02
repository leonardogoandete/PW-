package aula9.atv;

import aula9.model.CarroPojo.Carro;
import aula9.model.CarroPojo.Placa;

public class Enunciado10 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Placa placa = new Placa();

        //System.out.println(placa.findById(4));
        //Placa pl = new Placa("NFC",3762);
        //System.out.println("==="+ pl.findById(9));

        //System.out.println(SQLs.DELETE.getQuery()+"aaa");
        //System.out.println(carro.listAll());
        //System.out.println(carro.findById(1));
        //carro.insert(new Carro(1969,"Fusca","Volkswagem",new Placa("NFC",3399)));
        //carro.insert(new Carro(2000,"Santana","VW",new Placa("QUE",5797)));
        //System.out.println("\nLIST ALL");
        //System.out.println(carro.listAll());
        //System.out.println(carro.listAll());
        //System.out.println(carro.findById(2));
        System.out.println(placa.findById(1));
    }
}
