package br.senai.sp.jandira.model;

import java.util.Scanner;

public class CriarUsuario {

    // Instancia Scanner
    Scanner teclado = new Scanner(System.in);

    // Instancia Usuario
    Usuario usuario = new Usuario();

    public Usuario cadastrarUsuario(){
        System.out.println("Qual é o nome do usuário?: ");
        String nome = teclado.nextLine();
        usuario.setNome(nome);
        return usuario;
    }

}
