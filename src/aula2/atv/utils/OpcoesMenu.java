package aula2.atv.utils;

public enum OpcoesMenu {

    CADASTRAR(1,"Cadastrar Conta Especial"),
    PESQUI_CE_NUM(2,"Pesquisar Conta Especial usando número"),
    PESQUI_CE_NUM_AG(3,"Pesquisar Conta Especial usando número da agência"),
    PESQUI_CE_CPF(4,"Pesquisar Conta Especial usando o CPF do cliente"),
    LISTA_TODOS(5,"Listar todos os clientes"),
    SAIR(6,"Sair");


    private final int numOpcao;
    private final String descOpcao;

    private OpcoesMenu(int numOpcao, String descOpcao) {
        this.numOpcao = numOpcao;
        this.descOpcao = descOpcao;
    }

    public int getNumOpcao() {
        return numOpcao;
    }

    public String getDescOpcao() {
        return descOpcao;
    }

    @Override
    public String toString() {
        return numOpcao + " - " + descOpcao+"\n";
    }
}
