package questionario1.atv.pessoas;

import questionario1.atv.contatos.Telefone;

import java.util.ArrayList;

public class Socio extends Pessoa{
    private Telefone telefone;
    private ArrayList<Dependente> dependentes;
    public Socio() {
        super();
    }
    public Socio(long numCartao, String nome, String endereco, String email, Telefone telefone, ArrayList<Dependente> dependentes) {
        super(numCartao, nome, endereco, email);
        this.telefone = telefone;
        this.dependentes = dependentes;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        String strPessoa = "";
        String strTelefone = "";
        String strDependentes = "";

        strPessoa += super.toString() == null ? "" : super.toString();
        strTelefone += telefone == null ? "" : telefone.toString();
        strDependentes += dependentes == null ? "" : dependentes.toString();

        return "Socio{" + "pessoa:" + strPessoa +
                "telefone=" + strTelefone +
                ", dependentes=" + strDependentes +
                '}';
    }
}
