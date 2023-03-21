package questionario1.atv.pessoas;

public class Pessoa {
    /*
    Para cada sócio o sistema deve registrar o número do cartão de sócio,
    o nome, o telefone, o endereço e o e-mail do sócio.

    para o dependente o sistema
    também deve registrar o número do cartão de sócio, o nome, o endereço e o e-mail

    */

    private Long numCartao;
    private String nome;
    private String endereco;
    private String email;

    public Pessoa(){}
    public Pessoa(Long numCartao, String nome, String endereco, String email) {
        this.numCartao = numCartao;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Long getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(Long numCartao) {
        this.numCartao = numCartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "\nNome: " + getNome() +
                "\nNumero do cartao: " + getNumCartao() +
                "\nEndereco: " + getEndereco() +
                "\nE-mail: " + getEmail();
    }
}
