package aula9.model;

public class Endereco {
    private String logradouro, complemento, uf;

    public Endereco(){}

    public Endereco(String logradouro, String complemento, String uf) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString(){
        return "Logradouro "+ getLogradouro()+" complemento: "+getComplemento()+ " UF: "+getUf();
    }
}
