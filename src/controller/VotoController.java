package controller;

import DAO.PesquisaDao;
import DAO.VotoDao;
import model.Pesquisa;
import model.Voto;

import java.util.List;

public class VotoController {

    public void registratVoto(Voto voto) throws Exception{
        if(voto.getQuantidade() == null){
            throw new Exception("Nenhuam voto registrado");
        }
        if(voto.getCandidato() == null){
            throw new Exception("Nenhum candidato registrado ao voto");
        }
        VotoDao.getInstance().registratVoto(voto);
    }

    public List<Voto> listar(){
        return VotoDao.getInstance().listar();
    }
}
