package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    //String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(j);
    }

    //psvm vem isso
    public static void main(String[] args) {

        // instanciar objetos

        //int codigo, String nome, String cargo, double salario
        Colaborador objColaborador = new Colaborador(
                inteiro("Informe Código"),
                texto("Informe o nome"),
                texto("Cargo"),
                real("Salario")
        );

        //String logradouro, int numero, String complemento, String cep, String bairro, String cidade
        Endereco objEndColaborador = new Endereco(
                texto("logradouro"),
                inteiro("Número"),
                texto("Complemento"),
                texto("CEP"),
                texto("Bairro"),
                texto("Cidade")
        );

        objColaborador.setEndereco(objEndColaborador);
        System.out.println(objColaborador);
    }
}
