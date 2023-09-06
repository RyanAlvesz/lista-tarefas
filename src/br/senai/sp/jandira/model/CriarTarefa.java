package br.senai.sp.jandira.model;

import java.util.Scanner;
public class CriarTarefa {

    // Instancia Tarefa
    Tarefa tarefa = new Tarefa();

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia Estado
    Estado estado = new Estado();

    // Instancia ListaTarefas
    ListaTarefas listarTarefas = new ListaTarefas();

    int resposta;
    public Tarefa CriarTarefa(){

        System.out.println("----------------------------");
        System.out.println("       Criando Tarefa");
        System.out.println("----------------------------");
        System.out.println("");

        System.out.print("Título: ");
        tarefa.titulo = teclado.nextLine();
        System.out.print("");

        System.out.print("Descrição: ");
        tarefa.descricao = teclado.nextLine();
        System.out.print("");

        System.out.print("Data de Vencimento: ");
        tarefa.dataVencimento = teclado.nextLine();
        System.out.print("");

        System.out.print("Estado [1 - Concluída] [2 - Não Concluída]: ");
        resposta = teclado.nextInt();
        teclado.nextLine();
        tarefa.estado = estado.Estado(resposta);
        System.out.println("");

        return tarefa;

    }

}