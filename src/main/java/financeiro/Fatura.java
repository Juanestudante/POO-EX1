package financeiro;

import java.util.Date;

public class Fatura {
    private Date dataVencimento;
    private double valor;
    private double juros;
    private double multa;

    public Fatura(Date dataVencimento, double valor, double juros, double multa) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
    }

    
    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}