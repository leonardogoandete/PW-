package aula2.atv.contas;

import aula2.atv.agencias.Agencia;

public class Conta {
    private Agencia agencia;
    private double saldo;
    private long numero;


    public Conta(Agencia agencia, double saldo, long numero) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.numero = numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double credita(double valor) {

        return getSaldo();
    }

    public double debita(double valor) {

        return getSaldo();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                '}';
    }
}
