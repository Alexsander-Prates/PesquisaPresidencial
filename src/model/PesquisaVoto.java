package model;

import java.util.List;

public class PesquisaVoto implements CalcularVotos{
    private Double quantidade =0.0;
    private Double totalVotos =0.0;

    public PesquisaVoto() {
    }


    @Override
    public Double calcularVotos(List<Voto> listVotos, String nomeCandidato) {

        listVotos.forEach(voto -> {
            if(voto.getCandidato().getNome().equals(nomeCandidato)){
                quantidade = quantidade + voto.getQuantidade();
                totalVotos = totalVotos + quantidade;
            }
        });
        return quantidade;
    }
}