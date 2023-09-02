package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia CriarTarefa
    CriarTarefa criarTarefa = new CriarTarefa();

    // Instancia ListarTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

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
            System.out.println("[4 - Sair]");
            System.out.println("");

            int resposta = teclado.nextInt();
            System.out.println("");

            switch (resposta) {

                case 1:
                    listaTarefas.ListarTarefas();
                    break;

                case 2:
                    criarTarefa.CriarTarefa();
                    break;

                case 3:
                    break;

                case 4:
                    continuar = false;
                    break;

            }

        }

    }

}