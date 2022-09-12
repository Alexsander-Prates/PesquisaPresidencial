package model;

import java.util.List;

public class Voto {

    private Double quantidade;

    private Candidato candidato;

    private Pesquisa pesquisa;

    private List<PesquisaVoto> pesquisaVotos;

    public Voto(Double quantidade, Candidato candidato, Pesquisa pesquisa, List<PesquisaVoto> pesquisaVotos) {
        this.quantidade = quantidade;
        this.candidato = candidato;
        this.pesquisa = pesquisa;
        this.pesquisaVotos = pesquisaVotos;
    }

    public Voto(Double quantidade, Candidato candidato) {
        this.quantidade = quantidade;
        this.candidato = candidato;
    }

    public Voto(){

    }

    public Voto(Double quantidade) {
        this.quantidade = quantidade;

    }

    public List<PesquisaVoto> getPesquisaVotos() {
        return pesquisaVotos;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setPesquisaVotos(List<PesquisaVoto> pesquisaVotos) {
        this.pesquisaVotos = pesquisaVotos;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }


}
