package aula2.atv.teste;

import aula2.atv.agencias.Agencia;
import aula2.atv.clientes.Cliente;
import aula2.atv.contas.ContaEspecial;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Agencia ag = new Agencia(116,"Av Veiga 439");
        //List<Endereco> endLari = new ArrayList<Endereco>();
        ArrayList<Cliente> clientesLista = new ArrayList<>();
        clientesLista.add(new Cliente("18035208764","Leonardo"));



        ContaEspecial contaespecial = new ContaEspecial(ag,2599.55d,0116L,12000.23d,clientesLista);

        System.out.println(contaespecial.getAgencia().toString());

    }
}
