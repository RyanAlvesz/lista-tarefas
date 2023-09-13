package br.senai.sp.jandira.model;

import java.util.*;
public class Atribuicao {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia ListaTarefa
    ListaTarefas listaTarefas = new ListaTarefas();

    // Instancia ListaUsuarios
    ListaUsuarios listaUsuarios = new ListaUsuarios();

    List <Atribuicao> lista = new ArrayList<>();
    Tarefa tarefa;
    Usuario usuario;

    public void atribuindo(){
        System.out.print("Informe o número do Tarefa: ");
        int t = teclado.nextInt();

        System.out.print("Informe o número do Usuário: ");
        int u = teclado.nextInt();

        tarefa = listaTarefas.getTarefa(t);
        usuario = listaUsuarios.getUsuario(u);

        atribuir(tarefa, usuario);
    }
    public void atribuir(Tarefa tarefa, Usuario usuario){
        this.tarefa = tarefa;
        this.usuario = usuario;
        lista.add(new Atribuicao());
    }

    public void listarAtribuicoes(){
        for (Atribuicao a : lista) {
            System.out.println("Tarefa: " + tarefa.titulo);
            System.out.println("Responsável: " + usuario.getNome());
        }
    }

}
