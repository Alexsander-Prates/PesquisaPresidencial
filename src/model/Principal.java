package model;

import javax.sound.midi.Soundbank;

public class Principal {

    public static void main(String[] args) {

        Candidato candidato1 = new Candidato("Lula",13);
        Candidato candidato2 = new Candidato("Bolsonaro", 22);
        Candidato candidato3= new Candidato("Ciro",12);

        Pesquisa pesquisa1 = new Pesquisa("CNN Brasil","SP");
        Pesquisa pesquisa2 = new Pesquisa("IBOPE","SP");
        Pesquisa pesquisa3 = new Pesquisa("Dada Brasil","SP");

        PesquisaVoto pesquisaVoto1 = new PesquisaVoto(10.8,null,candidato1,pesquisa1);
        PesquisaVoto pesquisaVoto2 = new PesquisaVoto(20.9,null,candidato2,pesquisa1);
        pesquisaVoto1.calcularVotos();
        System.out.println(pesquisaVoto1.getTotalVotos());

        PesquisaVoto[] lista = new PesquisaVoto[3];
        lista[0] = pesquisaVoto1;
        lista[1] = pesquisaVoto2;

        for(PesquisaVoto pesquisaV:lista){
            System.out.println(pesquisaV.getQuantidade());
            System.out.println(pesquisaV.getCandidato().getNome());
            System.out.println(pesquisaV.getPesquisa().getInstituto());
            System.out.println();
        }
    }
}
