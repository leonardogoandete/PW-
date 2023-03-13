package aula2.atv.contas;
import java.util.ArrayList;

import aula2.atv.agencias.Agencia;
import aula2.atv.clientes.Cliente;

public class ContaEspecial extends Conta{
    private double limite;
    private ArrayList<Cliente> cliente;

    public ContaEspecial(Agencia agencia, double saldo, long numero, double limite, ArrayList<Cliente> cliente) {
        super(agencia, saldo, numero);
        this.limite = limite;
        this.cliente = cliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public double credita(double valor){
        return getSaldo();
    }

    @Override
    public double debita(double valor){
        return getSaldo();
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                ", cliente=" + cliente +
                '}';
    }
}