package questionario1.atv.pessoas;

public class Pessoa {
    /*
    Para cada sócio o sistema deve registrar o número do cartão de sócio,
    o nome, o telefone, o endereço e o e-mail do sócio.

    para o dependente o sistema
    também deve registrar o número do cartão de sócio, o nome, o endereço e o e-mail

    */

    private long numCartao;
    private String nome;
    private String endereco;
    private String email;

    public Pessoa(){}
    public Pessoa(long numCartao, String nome, String endereco, String email) {
        this.numCartao = numCartao;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public long getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(long numCartao) {
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
        return "Pessoa{" +
                "numCartao=" + numCartao +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
