package br.senai.sp.jandira.model;

public class Estado {

    public boolean Estado(int estado){

        boolean estadoTarefa = false;

        switch (estado){

            case 1:
                estadoTarefa = true;

            case 2:
                estadoTarefa = false;
        }

        return estadoTarefa;
    }

}
