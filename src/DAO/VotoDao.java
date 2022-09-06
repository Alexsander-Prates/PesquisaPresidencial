package DAO;

import model.Pesquisa;
import model.Voto;

import java.util.ArrayList;
import java.util.List;

public class VotoDao {

    private static VotoDao instance;
    private List<Voto> listaVoto = new ArrayList<>();

    public static VotoDao getInstance(){
        if (instance == null){
            instance = new VotoDao();
        }
        return instance;
    }

    public void registratVoto(Voto voto){
        listaVoto.add(voto);

    }

    public List<Voto> listar(){
        return null;
    }
}
