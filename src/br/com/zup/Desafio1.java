package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> listaFuncionarios = new HashMap<String, String>();


        //variáveis
        String confirmacaoExclusao;
        String cpfFuncionario;
        String emailFuncionario;
        String excluirCPF = "";
        String excluirFuncionario;
        String nomeFuncionario;
        String telefoneFuncionario;
        boolean cpfExistente = false;
        boolean exibirMenu = true;
        int opcaoMenuSelecionada = 0;


        //Menu
        while (exibirMenu) {

            System.out.println("------ Zup Innovation ------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1- Cadastrar novo funcionário.");
            System.out.println("2- Exibir lista de todos os funcionários cadastrados.");
            System.out.println("3- Excluir funcionário.");
            System.out.println("4- Sair!");
            System.out.println("Digite a opção desejada desejada: ");

            //recebendo oção do usuário
            opcaoMenuSelecionada = leitor.nextInt();
            leitor.nextLine();

            //Opções Menu
            if (opcaoMenuSelecionada == 1) {

                System.out.println("------Cadastro Funcionários Zup------");

                //Recebendo dados do usuário para cadastro
                System.out.println("Digite o nome completo do funcionário: ");
                nomeFuncionario = leitor.nextLine();
                System.out.println("Digite o CPF do funcionário:");
                cpfFuncionario = leitor.nextLine();
                System.out.println("Digite o e-mail do funcionário:");
                emailFuncionario = leitor.nextLine();
                System.out.println("Digite o telefone do funcionário: ");
                telefoneFuncionario = leitor.nextLine();

                if (!nomeFuncionario.equals("") && !emailFuncionario.equals("") && !telefoneFuncionario.equals("") && !cpfFuncionario.equals("")){

                    if (listaFuncionarios.size() != 0) {

                        for (String funcionarios : listaFuncionarios.keySet()) {

                            if (funcionarios.equals(cpfFuncionario)) {
                                cpfExistente = true;
                                break;
                            }else {
                                cpfExistente = false;
                            }

                        }

                        if (cpfExistente) {
                            //cpf já existente
                            System.out.println("\nO CPF já foi cadastrado anteriormente!\n");
                        } else {
                            //adicionar funcionário a lista
                            listaFuncionarios.put(cpfFuncionario, nomeFuncionario + " ||Telefone: " + telefoneFuncionario + " ||Email: " + emailFuncionario);
                            System.out.println("\nZupper cadastrado com sucesso!\n");
                        }

                    } else {
                        //adicionando funcionário a lista
                        listaFuncionarios.put(cpfFuncionario, nomeFuncionario + " ||Telefone: " + telefoneFuncionario + " ||Email: " + emailFuncionario);
                        System.out.println("\nZupper cadastrado com sucesso!\n");
                    }

                }else{

                    System.out.println("\nDados incompletos, funcionário não cadastrado!\n");

                }




            } else if (opcaoMenuSelecionada == 2) {

                System.out.println("\n------Zuppers Cadastrados------\n");

                if (listaFuncionarios.size() != 0) {
                    //Exibir lista Funcionarios
                    for (String funcionarios : listaFuncionarios.keySet()) {
                        System.out.println("Zupper " + listaFuncionarios.get(funcionarios) + " ||CPF: " + funcionarios);
                    }

                    System.out.println("\nTotal de Zuppers cadastrados = " + listaFuncionarios.size() + "\n");

                } else {
                    System.out.println("\nNenhum Zupper cadastrado!\n ");
                }

            } else if (opcaoMenuSelecionada == 3) {

                System.out.println("------Excluir Zupper------");

                //Recebendo dados usuário
                System.out.println("Digite o CPF do zupper que deseja excluir: ");
                excluirFuncionario = leitor.nextLine();

                //buscar na lista se tem o CPF e armazenar na variavel de exclusão
                for (String funcionarios : listaFuncionarios.keySet()) {

                    if (funcionarios.equals(excluirFuncionario)) {
                        excluirCPF = excluirFuncionario;
                        System.out.println("\nO zupper encontrado foi:");
                        System.out.println(listaFuncionarios.get(funcionarios) + " ||CPF: " + funcionarios);
                        break;
                    }

                }

                if (excluirCPF.equals(excluirFuncionario)) {

                    System.out.println("\nDeseja mesmo excluir o zupper do cadastro?");
                    System.out.println("Digite S/N");
                    confirmacaoExclusao = leitor.next();

                    if (confirmacaoExclusao.equals("S") || confirmacaoExclusao.equals("s")) {
                        listaFuncionarios.remove(excluirCPF);
                        System.out.println("\nZupper excluído com sucesso!\n");
                    }else {
                        System.out.println("\nZupper não excluído da lista de funcionários!\n");
                    }

                } else {
                    System.out.println("\nO CPF digitado é inexistente na lista de zuppers cadastrados!\n");
                }

            } else if (opcaoMenuSelecionada == 4) {

                exibirMenu = false;
                System.out.println("\nAté a proxima!");

            } else {
                System.out.println("\nOpção selecioanda inexistente. Selecione novamente! \n ");
            }

        }

    }

}
