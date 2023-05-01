package aula9.model.CarroPojo;

public class Placa {
    private String letras;
    private int numeros;

    Placa(){}

    public Placa(String letras, int numeros) {
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

    @Override
    public String toString(){
        return getLetras()+"-"+getNumeros();
    }
}
