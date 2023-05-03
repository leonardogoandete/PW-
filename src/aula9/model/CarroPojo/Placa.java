package aula9.model.CarroPojo;

import aula9.model.carroDao.PlacaDAO;

import java.util.List;

public class Placa {
    private int idPlaca;
    private String letras;
    private int numeros;

    public Placa(){}

    public Placa(String letras, int numeros) {
        this(-1, letras, numeros);
    }

    public Placa(int idPlaca, String letras, int numeros) {
        this.idPlaca = idPlaca;
        this.letras = letras;
        this.numeros = numeros;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    @Override
    public String toString(){
        return getLetras()+"-"+getNumeros();
    }

    public int insert(Placa placa){
        return new PlacaDAO().insert(placa);
    }

    public Placa findById(int id){
        return new PlacaDAO().findByID(id);
    }

    public List<Placa> listAll(){
        return new PlacaDAO().listAll();
    }

    public int update(Placa placa){
        return new PlacaDAO().update(placa);
    }

    public int delete(Placa placa){
        return new PlacaDAO().delete(placa);
    }
}
