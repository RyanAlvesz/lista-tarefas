package br.senai.sp.jandira.model;

import java.util.*;
public class ListaTarefas {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);
    int i = 1, respostaEdicao, respostaRemocao, respostaListaEdicao, tamanhoLista;

    // Criando Lista de Tarefas
    List <Tarefa> Lista = new ArrayList<>();
    public void AdicionarTarefa(Tarefa tarefa){
        Lista.add(tarefa);
        tamanhoLista = Lista.size();
    }
    public void ListarTarefas(){

        if(Lista.isEmpty()){
            System.out.println("Não existem tarefas cadastradas");
            System.out.println("");
        }else{

            for (Tarefa teste : Lista){
                System.out.println("Tarefa " + i);
                System.out.println("-----------------------------");
                System.out.println("Títlo: " + teste.titulo);
                System.out.println("Descricao: " + teste.descricao);
                System.out.println("Data de Vencimento: " + teste.dataVencimento);
                System.out.println("Estado: " + teste.estado);
                System.out.println("");
                i++;
            }

            i = 1;

        }

    }
    public void EditarTarefa(){

        System.out.println("O que você deseja fazer?");
        System.out.println("[1 - Remover Tarefa]");
        System.out.println("[2 - Editar Tarefa]");
        System.out.println("");
        respostaEdicao = teclado.nextInt();

        if (respostaEdicao == 1 ){
            System.out.println("Qual tarefa você deseja remover?");
            System.out.println("[0 - Todas]");
            System.out.println("[Número Tarefa]");
            System.out.println("");
            respostaRemocao = teclado.nextInt();

            if (respostaRemocao == 0 ){
                Lista.clear();
            } else if (respostaRemocao <= tamanhoLista) {
                Lista.remove(respostaRemocao - 1);
            }else {
                System.out.println("Não existe essa tarefa");
            }

        } else if (respostaEdicao == 2) {

            System.out.println("Qual tarefa você deseja editar?");
            System.out.println("");
            respostaListaEdicao = teclado.nextInt();
            System.out.println("");
            System.out.println("O que você deseja editar?");
        }


    }

}
