package model;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Candidato candidatoLula = new Candidato("Lula",13);
        Candidato candidatoBolsonaro = new Candidato("Bolsonaro", 22);
        Candidato candidatoCiro = new Candidato("Ciro",12);

        Pesquisa pesquisa1 = new Pesquisa("CNN Brasil","SP");
        Pesquisa pesquisa2 = new Pesquisa("IBOPE","RJ");
        Pesquisa pesquisa3 = new Pesquisa("Dada Brasil","RS");

        Voto votoLula = new Voto(10.8,null,candidatoLula,pesquisa1);
        Voto votoLula2 = new Voto(20.8,null,candidatoLula,pesquisa1);
        Voto votoCiro = new Voto(1.8,null,candidatoCiro,pesquisa1);
        Voto votoCiro1 = new Voto(2.0,null,candidatoCiro,pesquisa1);
        Voto votoBolsonaro = new Voto(15.7,null,candidatoBolsonaro,pesquisa1);
        Voto votoBolsonaro1 = new Voto(7.3,null,candidatoBolsonaro,pesquisa1);


        Voto[] lista = new Voto[6];
        lista[0] = votoLula;
        lista[1] = votoLula2;
        lista[2] = votoCiro;
        lista[3] = votoCiro1;
        lista[4] = votoBolsonaro;
        lista[5] = votoBolsonaro1;

        for(Voto pesquisaV:lista){
            System.out.println(pesquisaV.getQuantidade());
            System.out.println(pesquisaV.getCandidato().getNome());
            System.out.println(pesquisaV.getPesquisa().getInstituto());
            System.out.println("----");
        }

        PesquisaVoto pesquisaVoto = new PesquisaVoto();
        Double candidatoLulaTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(votoLula, votoLula2), "Lula");
        Double candidatoCiroTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(votoCiro,votoCiro1), "Ciro");
        Double candidatoBolsonaroTotalVotos = pesquisaVoto.calcularVotos(Arrays.asList(votoBolsonaro,votoBolsonaro1), "Bolsonaro");
        System.out.println("O Candidato: " + candidatoLula.getNome() + " teve " + candidatoLulaTotalVotos + " votos");
        System.out.println("O Candidato: " + candidatoCiro.getNome() + " teve " + candidatoCiroTotalVotos + " votos");
        System.out.println("O Candidato: " + candidatoBolsonaro.getNome() + " teve " + candidatoBolsonaroTotalVotos + " votos");
    }
}
