package br.com.fiap.beans;

public class Colaborador {

    private String nome;
    private String cargo;
    private double valorHora;
    private double quantHoras;
    private Endereco endereco;

    //metodo construtor vazio
    public Colaborador() {
        super();
    }

    //metodo construtor cheio (sem atributo de ref)
    public Colaborador(String nome, String cargo, double valorHora, double quantHoras) {
        super();
        this.nome = nome;
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.quantHoras = quantHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(double quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String   toString() {
        return "Colaborador{" +
                "nome='" + nome + '\'' +
                "\ncargo='" + cargo + '\'' +
                "\nvalorHora=" + valorHora +
                "\nquantHoras=" + quantHoras +
                "\nendereco=" + endereco +
                '}';
    }

    //metodo worker
    public double salarioTotal(){
        return valorHora * quantHoras;
    }
}
