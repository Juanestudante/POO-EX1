package main;

import java.util.Date;
import pessoa.Titular;
import pessoa.Dependente;
import financeiro.Contrato;
import financeiro.Fatura;
import saude.Consulta;

public class Main {
    public static void main(String[] args) {

        Titular titular = new Titular("Juan Lucas", "Parangaba", "29/12/2004", "Masculino");


        Contrato contrato = new Contrato(titular, 500.0);


        Dependente dependente1 = new Dependente("Leticia", "Rua 12345", "10/05/2005", "Feminino");
        Dependente dependente2 = new Dependente("Pedro Silva", "Rua 12345", "15/08/2006", "Masculino");
        contrato.adicionarDependente(dependente1);
        contrato.adicionarDependente(dependente2);


        Fatura fatura = new Fatura(new Date(), 500.0, 2.0, 50.0);
        contrato.setFatura(fatura);


        Consulta consulta = new Consulta(new Date(), "Dr. Carlos");


        System.out.println("Titular: " + contrato.getTitular().getNome());
        System.out.println("Dependentes: " + contrato.getDependentes().size());
        System.out.println("Valor da fatura: R$ " + contrato.getFatura().getValor());
    }
}