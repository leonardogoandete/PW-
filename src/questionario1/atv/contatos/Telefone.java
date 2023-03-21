package questionario1.atv.contatos;

public class Telefone {
    private int ddd;
    private Long numero;

    public Telefone() {}

    public Telefone(int ddd, Long numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + getDdd() + ")" + getNumero().toString().substring(0,5)+"-"+ getNumero().toString().substring(5);
    }
}
