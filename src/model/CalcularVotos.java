package model;

import java.util.List;

public interface CalcularVotos {

    Double calcularVotos(List<PesquisaVoto> listDeVotos,String nomeCandidato);
}
