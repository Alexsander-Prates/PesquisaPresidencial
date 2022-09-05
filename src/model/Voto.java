package model;

import java.util.List;

public class Voto {

    private Double quantidade;
    private Double totalVotos;

    private Candidato candidato;

    private Pesquisa pesquisa;



    public Voto(){

    }

    public Voto(Double quantidade, Double totalVotos, Candidato candidato,Pesquisa pesquisa) {
        this.quantidade = quantidade;
        this.totalVotos = totalVotos;
        this.candidato = candidato;
        this.pesquisa = pesquisa;
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

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(Double totalVotos) {
        this.totalVotos = totalVotos;
    }
}
