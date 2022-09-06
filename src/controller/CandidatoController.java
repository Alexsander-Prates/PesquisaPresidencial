package controller;

import DAO.CandidatoDao;
import model.Candidato;

import java.util.List;

public class CandidatoController {



    public void salvar(Candidato candidato) throws Exception{
        if (candidato.getNome() == null || candidato.getNome().length() <3){
            throw new Exception("Nome inválido para salvar");
        }
        CandidatoDao.getInstance().salvar(candidato);

    }

    public void atualizar(Candidato candidato) throws Exception{
        if (candidato.getNome() == null || candidato.getNome().length() <3){
            throw new Exception("Nome inválido para atualizar");
        }
        CandidatoDao.getInstance().salvar(candidato);
    }

    public void excluir(int idCandidato) throws Exception{
        if(idCandidato == 0){
            throw new Exception("Nenhum candidato selecionado para excluir ");
        }
        CandidatoDao.getInstance().excluir(idCandidato);
    }

    public List<Candidato> listar(){
        return CandidatoDao.getInstance().listar();
    }
}
