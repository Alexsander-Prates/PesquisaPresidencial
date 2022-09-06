package DAO;

import model.Candidato;
import model.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class PesquisaDao {

    private static PesquisaDao instance;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();

    public static PesquisaDao getInstance(){
        if (instance == null){
            instance = new PesquisaDao();
        }
        return instance;
    }

    public void salvar(Pesquisa pesquisa){
        listaPesquisa.add(pesquisa);

    }

    public void atualizar(Pesquisa pesquisa){
        listaPesquisa.set(pesquisa.getId(),pesquisa);

    }

    public void excluir(int idPesquisa){
        listaPesquisa.remove(idPesquisa);

    }

    public List<Pesquisa> listar(){
        return listaPesquisa;
    }
}
