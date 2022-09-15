package model;

import java.util.List;

public class PesquisaVoto implements CalcularVotos{

    private Voto voto;

    private Candidato candidato;

    private Pesquisa pesquisa;

    private Double quantidade1 = 0.0;

    public PesquisaVoto(Voto voto, Candidato candidato, Pesquisa pesquisa) {
        this.voto = voto;
        this.candidato = candidato;
        this.pesquisa = pesquisa;
    }

    public PesquisaVoto() {
    }

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }


    @Override
    public Double calcularVotos(List<PesquisaVoto> listVotos,String nomeCandidato) {

        listVotos.forEach(pesquisaVoto -> {
            if(pesquisaVoto.getCandidato().getNome().equals(nomeCandidato)) {
                quantidade1 = quantidade1 + pesquisaVoto.getVoto().getQuantidade();
                if(nomeCandidato != pesquisaVoto.getCandidato().getNome()){
                    quantidade1 = 0.0;
                }
            }

        });
        return quantidade1;
    }

}