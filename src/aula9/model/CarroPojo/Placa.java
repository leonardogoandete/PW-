package aula9.model.CarroPojo;

import aula9.carroDao.PlacaDAO;

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
}
