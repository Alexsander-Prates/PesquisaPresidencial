package controller;

import DAO.PesquisaDao;
import DAO.VotoDao;
import model.Pesquisa;
import model.Voto;
import model.Candidato;

import java.util.List;

public class VotoController {

    public void registratVoto(Voto voto, Candidato candidato) throws Exception{
        if(voto.getQuantidade() == null){
            throw new Exception("Nenhuma quantidade de votos registrada");
        }
        if(candidato.getNome() == null){
            throw new Exception("Nenhum candidato registrado ao voto");
        }
        VotoDao.getInstance().registratVoto(voto);
    }

    public List<Voto> listar(){
        return VotoDao.getInstance().listar();
    }
}
