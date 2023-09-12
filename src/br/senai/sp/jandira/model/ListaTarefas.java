package br.senai.sp.jandira.model;

import java.util.*;
public class ListaTarefas {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);
    int i = 1, respostaEdicao, respostaRemocao, respostaListaEdicao, respostaCaracteristaEdicao, tamanhoLista;
    String novoValorTarefa;

    Tarefa tarefa=new Tarefa();

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

            for (Tarefa tarefa : Lista){
                System.out.println("Tarefa " + i);
                System.out.println("-----------------------------");
                System.out.println("Título: " + tarefa.titulo);
                System.out.println("Descricao: " + tarefa.descricao);
                System.out.println("Data de Vencimento: " + tarefa.dataVencimento);
                System.out.println("Estado: " + tarefa.estado);
                System.out.println("");
                i++;
            }

            i = 1;

        }

    }
    public void EditarTarefa() {

        if (!Lista.isEmpty()) {

            System.out.println("O que você deseja fazer?");
            System.out.println("------------------------");
            System.out.println("[1 - Remover Tarefa]");
            System.out.println("[2 - Editar Tarefa]");
            System.out.println("");
            respostaEdicao = teclado.nextInt();
            System.out.println("");

            switch (respostaEdicao){
                case 1:
                    RemoverTarefa();
                    break;
                case 2:
                    EditarTarefas();
                    break;
            }

        } else {
            System.out.println("Não existem tarefas cadastradas");
            System.out.println("");
        }

    }

    void RemoverTarefa(){
        System.out.println("Qual tarefa você deseja remover?");
        System.out.println("--------------------------------");
        System.out.println("[0 - Todas]");
        System.out.println("[Número Tarefa]");
        System.out.println("");
        respostaRemocao = teclado.nextInt();
        System.out.println("");

        if (respostaRemocao == 0) {
            Lista.clear();
        } else if (respostaRemocao <= tamanhoLista) {
            Lista.remove(respostaRemocao - 1);
        } else {
            System.out.println("Essa tarefa não existe");
        }
    }

    void EditarTarefas(){
        System.out.println("Qual tarefa você deseja editar?");
        System.out.println("-------------------------------");
        respostaListaEdicao = teclado.nextInt();
        System.out.println("");

        if (respostaListaEdicao <= tamanhoLista) {
            System.out.println("O que você deseja editar?");
            System.out.println("-------------------------");
            System.out.println("[1 - Título]");
            System.out.println("[2 - Descrição]");
            System.out.println("[3 - Data de Vencimento]");
            System.out.println("[4 - Estado]");
            respostaCaracteristaEdicao = teclado.nextInt();

            System.out.println("");

            System.out.println("Qual será o novo valor?");
            novoValorTarefa = teclado.nextLine();
            teclado.next();

            switch (respostaCaracteristaEdicao) {
                case 1:
                    for (Tarefa t : Lista){
                        if (t.titulo == "1"){
                            tarefa.titulo = novoValorTarefa;
                        }
                    }
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;
            }

        } else {
            System.out.println("-------------------------------");
            System.out.println("     Essa tarefa não existe");
            System.out.println("-------------------------------");
            System.out.println("");
            EditarTarefas();

        }
    }

}
