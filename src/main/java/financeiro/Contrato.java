package financeiro;

import java.util.ArrayList;
import java.util.List;
import pessoa.Titular;
import pessoa.Dependente;

public class Contrato {
    private Titular titular;
    private List<Dependente> dependentes;
    private Fatura fatura;
    private double preco;

    public Contrato(Titular titular, double preco) {
        this.titular = titular;
        this.preco = preco;
        this.dependentes = new ArrayList<>();
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}