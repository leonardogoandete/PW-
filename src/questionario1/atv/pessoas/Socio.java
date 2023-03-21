package questionario1.atv.pessoas;

import questionario1.atv.contatos.Telefone;

import java.util.ArrayList;

public class Socio extends Pessoa{
    private Telefone telefone;
    private ArrayList<Dependente> dependentes;
    public Socio() {
        super();
    }
    public Socio(Long numCartao, String nome, String endereco, String email, Telefone telefone, ArrayList<Dependente> dependentes) {
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
        StringBuffer sb = new StringBuffer();
        int i =1;
        sb.append(
                "<==== Socio ====>\n"+
                "Nome: "+ (super.getNome() == null ? "" : super.getNome()) +
                "\nNumero do cartao: " + (super.getNumCartao() == null ? "" : super.getNumCartao()) +
                "\nEndereco: "+ (super.getEndereco() == null ? "" : super.getEndereco()) +
                "\nTelefone: "+ (getTelefone() == null ? "": getTelefone()) +
                "\nE-mail: "+ (super.getEmail() == null ? "" : super.getEmail() +
                "\nDependentes:\n"));

        for (Dependente dep : dependentes) {
            sb.append(
                    "\tDependente "+(i++) +
                    "\n\tNome: "+ (dep.getNome() == null ? "" : dep.getNome()) +
                    "\n\tNumero do cartao: " + (dep.getNumCartao() == null ? "" : dep.getNumCartao()) +
                    "\n\tEndereco: "+ (dep.getEndereco() == null ? "" : dep.getEndereco()) +
                    "\n\tE-mail: "+ (dep.getEmail() == null ? "" : dep.getEmail()) +
                    "\n\tGrau de parentesco: "+ (dep.getGrauParentesco() == null ? "" : dep.getGrauParentesco())+"\n");
        }

        return sb.toString();
    }
}
