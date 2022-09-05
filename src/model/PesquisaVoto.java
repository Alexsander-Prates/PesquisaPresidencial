package model;

public class PesquisaVoto extends Voto implements CalcularVotos{


    public PesquisaVoto() {
    }


    public PesquisaVoto(Double quantidade, Double totalVotos, Candidato candidato, Pesquisa pesquisa) {
        super(quantidade, totalVotos, candidato, pesquisa);

    }

    @Override
    public void calcularVotos() {
        if(getQuantidade() > 1){
            setTotalVotos(getQuantidade()+getQuantidade());
        } else {
            setTotalVotos(getQuantidade());
        }
    }
}