package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaFuncionarios = new HashMap<String, String>();


        //variáveis
        String cpfFuncionario;
        String emailFuncionario;
        String nomeFuncionario;
        String telefoneFuncionario;
        int opcaoMenuSelecionada = 0;
        boolean exibirMenu = true;


        //Menu
        while (exibirMenu) {
            System.out.println("------ Zup Innovation ------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar novo funcionário.");
            System.out.println("2- Exibir lista de todos os funcionários cadastrados.");
            System.out.println("3- Sair!");

            //recebendo oção do usuário
            opcaoMenuSelecionada = leitor.nextInt();
            leitor.nextLine(); //adicionar o enter do usuário para não dar erro!

            //Opções Menu
            if (opcaoMenuSelecionada == 1) {

                System.out.println("------Cadastro Funcionarios Zup------");

                //Recebendo dados do usuário para cadastro
                System.out.println("Digite o nome completo do funcionário: ");
                nomeFuncionario = leitor.nextLine();
                System.out.println("Digite o CPF do funcionário");
                cpfFuncionario = leitor.nextLine();
                System.out.println("Digite o e-mail do funcionário:");
                emailFuncionario = leitor.nextLine();
                System.out.println("Digite o telefone do funcionário: ");
                telefoneFuncionario = leitor.nextLine();

                //adicionando funcionário a lista
                listaFuncionarios.put(cpfFuncionario, nomeFuncionario + " ||Telefone: " + telefoneFuncionario + " ||Email: " + emailFuncionario);

                System.out.println("Funcionário cadastrado com sucesso! \n");

            } else if (opcaoMenuSelecionada == 2) {

                System.out.println("------Zuppers Cadastrados------");

                //Exibir lista Funcionarios
                for (String impressaLista : listaFuncionarios.keySet()) {
                    System.out.println("||Funcionario: " + listaFuncionarios.get(impressaLista) + " ||CPF: " + impressaLista);
                }
                System.out.print("\n");

            } else if (opcaoMenuSelecionada == 3) {

                //Sair
                exibirMenu = false;
                System.out.println("Até a proxima!");

            } else {

                System.out.println("Opção selecioanda inexistente. Selecione novamente! \n ");

            }

        }

    }

}
