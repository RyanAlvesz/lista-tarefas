package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList <Tarefa> Lista = new ArrayList<>();

    public void AdicionarTarefa(Tarefa tarefa){
        Lista.add(tarefa);
    }
    public void ListarTarefas(){

        Lista.forEach((tarefa) -> {
            System.out.println(tarefa.titulo);
            System.out.println(tarefa.descricao);
            System.out.println(tarefa.dataVencimento);
            System.out.println(tarefa.estado);
        });

    }

}
