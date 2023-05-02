package aula9.model.CarroPojo;

import aula9.carroDao.CarroDAO;

import java.util.List;

public class Carro {
    private int idCarro;
    private int ano;
    private String modelo, montadora;
    private Placa placa;

    public Carro(){}

    public Carro(int ano, String modelo, String montadora, Placa placa) {
        this.ano = ano;
        this.modelo = modelo;
        this.montadora = montadora;
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }

    @Override
    public String toString(){
        return getModelo() + " - " + getMontadora() + " - " + getAno() + " - " + getPlaca();
    }

    public List<Carro> listAll(){
        return new CarroDAO().listAll();
    }

    public void insert(Carro carro){
        new CarroDAO().insert(carro);
    }

    public Carro findById(int id){
        return new CarroDAO().findByID(id);
    }
}
