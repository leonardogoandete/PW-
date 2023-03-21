package questionario1.atv.pessoas;

public class Dependente extends Pessoa{
    private String grauParentesco;

    public Dependente(){
        super();
    }
    public Dependente(long numCartao, String nome, String endereco, String email, String grauParentesco) {
        super(numCartao, nome, endereco, email);
        this.grauParentesco = grauParentesco;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nGrau de parentesco: " + getGrauParentesco();
    }
}
