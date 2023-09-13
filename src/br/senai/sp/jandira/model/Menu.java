package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia ListarTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    // Instancia ListaUsuarios
    ListaUsuarios listarUsuarios = new ListaUsuarios();

    // Instancia Usuario
    Usuario usuario = new Usuario();

    // Instancia Atribuicao
    Atribuicao atribuicao = new Atribuicao();

        public void Menu(){

            boolean continuar = true;

            while(continuar){

            System.out.println("----------------------------");
            System.out.println("            Menu");
            System.out.println("----------------------------");
            System.out.println("");
            System.out.println("Escolha uma opção:");
            System.out.println("[1 - Listar tarefas]");
            System.out.println("[2 - Criar tarefa]");
            System.out.println("[3 - Editar tarefas]");
            System.out.println("[4 - Cadastrar Usuário]");
            System.out.println("[5 - Listar Usuário]");
            System.out.println("[6 - Atribuir tarefa para um Usuário]");
            System.out.println("[7 - Listar Atribuições]");
            System.out.println("[8 - Sair]");
            System.out.println("");

            int resposta = teclado.nextInt();
            System.out.println("");

            switch (resposta) {

                case 1:
                    listaTarefas.ListarTarefas();
                    break;

                case 2:
                    // Instancia CriarTarefa
                    CriarTarefa criarTarefa = new CriarTarefa();
                    Tarefa tarefa = criarTarefa.CriarTarefa();
                    listaTarefas.AdicionarTarefa(tarefa);
                    break;

                case 3:
                    listaTarefas.EditarTarefa();
                    break;

                case 4:
                    // Instancia Criar Usuario
                    CriarUsuario criarUsuario = new CriarUsuario();
                    Usuario usuario = criarUsuario.cadastrarUsuario();
                    listarUsuarios.adicionarLista(usuario);
                    break;

                case 5:
                    listarUsuarios.listarUsuarios();
                    break;

                case 6:
                    atribuicao.atribuindo();
                    break;

                case 7:
                    atribuicao.listarAtribuicoes();

                case 8:
                    continuar = false;
                    break;


            }

        }

    }

}