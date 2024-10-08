package br.com.fiap.beans;

public class Endereco {

    private String logradouro;
    private int numero;
    private String complemtento;
    private String cep;

    public Endereco() {
        super();
    }

    public Endereco(String logradouro, int numero, String complemtento, String cep) {
        super();
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemtento = complemtento;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemtento() {
        return complemtento;
    }

    public void setComplemtento(String complemtento) {
        this.complemtento = complemtento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "\nlogradouro='" + logradouro + '\'' +
                "\nnumero=" + numero +
                "\ncomplemtento='" + complemtento + '\'' +
                "\ncep='" + cep + '\'' +
                '}';
    }
}
