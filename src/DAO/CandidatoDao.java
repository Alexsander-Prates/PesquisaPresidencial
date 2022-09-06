package DAO;

import model.Candidato;

import java.util.ArrayList;
import java.util.List;

public class CandidatoDao {

    private static CandidatoDao instance;
    private List<Candidato> listaCandidato = new ArrayList<>();

    //atributo static significar sempre salvar no mesma posição de memória
    //só vamos salvar em tempo de execução - somente enquanto estiver rodando o programa

    public static CandidatoDao getInstance(){
        if (instance == null){
            instance = new CandidatoDao();
        }
        return instance;
    }

    public void salvar(Candidato candidato){
        listaCandidato.add(candidato);
        //vai acessar a lista e receber o objeto do cliente.
        //depois vamos mudar para salvar em um SQL
    }

    public void atualizar(Candidato candidato){
        listaCandidato.set(candidato.getId(),candidato);
    }

    public void excluir(int idCandidato){
        listaCandidato.remove(idCandidato);
    }

    public List<Candidato> listar(){
        return listaCandidato;

    }
}
