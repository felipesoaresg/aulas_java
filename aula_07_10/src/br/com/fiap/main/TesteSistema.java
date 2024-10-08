package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

import javax.swing.*;

public class TesteSistema {

    //string
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {
        //String nome, String cargo, double valorHora, double quantHoras
        Colaborador objColaborador = new Colaborador(
                texto("Nome:"),
                texto("Cargo"),
                real("Valor da Hora:"),
                real("Quantidade:")
        );
        Endereco objEndColaborador = new Endereco(
          //String logradouro, int numero, String complemtento, String cep
          texto("Lougradouro"),
          inteiro("Numero"),
          texto("Complemento"),
          texto("Cep")
        );

        objColaborador.setEndereco(objEndColaborador);

        System.out.println(objColaborador);

        System.out.println("\n\nSalario: " + objColaborador.salarioTotal());
    }
}
