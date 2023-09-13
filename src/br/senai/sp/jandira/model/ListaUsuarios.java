package br.senai.sp.jandira.model;

import java.util.*;
public class ListaUsuarios {

    int i = 1, tamanhoLista;

    // Instancia Usuario
    Usuario usuario = new Usuario();

    // Cria Lista
    List <Usuario> listaUsuarios = new ArrayList<>();

    public void adicionarLista(Usuario usuario){
        listaUsuarios.add(usuario);
        tamanhoLista = listaUsuarios.size();
    }

    public void listarUsuarios(){
        for (Usuario u : listaUsuarios) {
            System.out.println("Usuário " + i + " : " + u.getNome());
            i++;
        }
        System.out.println("");
        i = 1;
    }

    public Usuario getUsuario(int opcao){
        return listaUsuarios.get(opcao - 1);
    }

}
