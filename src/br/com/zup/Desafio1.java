package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String,String> listaFuncionarios = new HashMap<String,String>();


        //variáveis
        String cpfFuncionario;
        String emailFuncionario;
        String nomeFuncionario;
        String telefoneFuncionario;

        //recebendo dados do usuário
        System.out.println("------Cadastro Funcionarios Zup------");
        System.out.println("Digite o nome completo do funcionário: ");
        nomeFuncionario = leitor.nextLine();
        System.out.println("Digite o CPF do funcionário");
        cpfFuncionario = leitor.nextLine();
        System.out.println("Digite o e-mail do funcionário:");
        emailFuncionario = leitor.nextLine();
        System.out.println("Digite o telefone do funcionário: ");
        telefoneFuncionario = leitor.nextLine();

    }
}
