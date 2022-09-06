package controller;

import DAO.CandidatoDao;
import DAO.PesquisaDao;
import model.Pesquisa;

import java.util.List;

public class PesquisaController {

    public void salvar(Pesquisa pesquisa) throws Exception{
        if (pesquisa.getInstituto() == null || pesquisa.getInstituto().length() <3){
            throw new Exception("Instituto inválido para salvar");
        }
        PesquisaDao.getInstance().salvar(pesquisa);

    }

    public void atualizar(Pesquisa pesquisa) throws Exception{
        if (pesquisa.getInstituto() == null || pesquisa.getInstituto().length()<3){
            throw  new Exception(" Atualização de pesquisa inválidade");
        }
        PesquisaDao.getInstance().atualizar(pesquisa);
    }

    public void excluir(int idPesquisa) throws Exception{
        if(idPesquisa ==0){
            throw new Exception("Nenhuma pesquisa encontrada");
        }
        PesquisaDao.getInstance().excluir(idPesquisa);
    }

    public List<Pesquisa> listar(){
        return PesquisaDao.getInstance().listar();
    }
}
