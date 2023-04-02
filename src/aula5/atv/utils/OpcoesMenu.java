package aula5.atv.utils;

public enum OpcoesMenu {

    CADASTRAR(1,"Cadastrar uma pessoa"),
    LISTAR_TODOS(2,"Listar todas as pessoas ordenadas pelo nome"),
    TOT_CADASTRO(3,"Listar o número total de contatos e informar se a agenda está ou não vazia"),
    PESQ_PESSOA(4,"Pesquisar se uma pessoa está na agenda agenda"),
    SAIR(5,"Sair da agenda");


    private final int numero;
    private final String descricao;

    private OpcoesMenu(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getnumero() {
        return numero;
    }

    public String getdescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return numero + " - " + descricao+"\n";
    }
}
