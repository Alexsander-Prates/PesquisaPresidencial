package model;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Candidato candidatoLula = new Candidato("Lula", 13);
        Candidato candidatoBolsonaro = new Candidato("Bolsonaro", 22);
        Candidato candidatoCiro = new Candidato("Ciro", 12);

        Pesquisa pesquisa1 = new Pesquisa("CNN Brasil", "SP");
        Pesquisa pesquisa2 = new Pesquisa("IBOPE", "RJ");
        Pesquisa pesquisa3 = new Pesquisa("Dada Brasil", "RS");

        Voto votoLula1 = new Voto(20.9);
        Voto votoLula2 = new Voto(10.7);
        Voto votoCiro1 = new Voto(10.7);
        Voto votoCiro2 = new Voto(12.5);
        Voto votoBolsonaro1 = new Voto(8.5);
        Voto votoBolsonaro2 = new Voto(12.8);

        PesquisaVoto pesquisaVotoLula1 = new PesquisaVoto(votoLula1, candidatoLula, pesquisa1);
        PesquisaVoto pesquisaVotoLula2 = new PesquisaVoto(votoLula2, candidatoLula, pesquisa1);
        PesquisaVoto pesquisaVotoCiro1 = new PesquisaVoto(votoCiro1, candidatoCiro, pesquisa1);
        PesquisaVoto pesquisaVotoCiro2 = new PesquisaVoto(votoCiro2, candidatoCiro, pesquisa1);
        PesquisaVoto pesquisaVotoBolsonaro1 = new PesquisaVoto(votoBolsonaro1, candidatoBolsonaro, pesquisa1);
        PesquisaVoto pesquisaVotoBolsonaro2 = new PesquisaVoto(votoBolsonaro2, candidatoBolsonaro, pesquisa1);

        PesquisaVoto[] lista = new PesquisaVoto[6];
        lista[0] = pesquisaVotoLula1;
        lista[1] = pesquisaVotoLula2;
        lista[2] = pesquisaVotoCiro1;
        lista[3] = pesquisaVotoCiro2;
        lista[4] = pesquisaVotoBolsonaro1;
        lista[5] = pesquisaVotoBolsonaro2;

        for (PesquisaVoto pesquisaV : lista) {
            System.out.println(pesquisaV.getVoto().getQuantidade());
            System.out.println(pesquisaV.getCandidato().getNome());
            System.out.println(pesquisaV.getPesquisa().getInstituto());
            System.out.println("----");
        }

        PesquisaVoto pesquisaVoto = new PesquisaVoto();
        Double candidatoLulaTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(pesquisaVotoLula1,pesquisaVotoLula2),"Lula");
        Double candidatoCiroTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(pesquisaVotoCiro1,pesquisaVotoCiro2), "Ciro");
        Double candidatoBolsonaroTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(pesquisaVotoBolsonaro1,pesquisaVotoBolsonaro2),"Bolsonaro");

        System.out.println("O Candidato: " + candidatoLula.getNome() + " teve " + candidatoLulaTotalVotos + " votos");
        System.out.println("O Candidato: " + candidatoCiro.getNome() + " teve " + candidatoCiroTotalVotos + " votos");
        System.out.println("O Candidato: " + candidatoBolsonaro.getNome() + " teve " + candidatoBolsonaroTotalVotos + " votos");

    }
}
