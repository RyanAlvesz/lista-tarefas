package br.senai.sp.jandira.model;

public class Estado {

    public String Estado(int estado){

        String estadoTarefa = "Concluída";

        switch (estado){

            case 1:
                break;

            case 2:
                estadoTarefa = "Não concluída";
                break;
        }

        return estadoTarefa;
    }

}
