package DAO;

import model.PesquisaVoto;
import model.Voto;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VotoDao {

    private static VotoDao instance;
    private List<Voto> listaVoto = new ArrayList<>();

    private Connection con = ConnectionUtil.getConnection();
    //abrindo a conexão com o bando de dados.

    public static VotoDao getInstance(){
        if (instance == null){
            instance = new VotoDao();
        }
        return instance;
    }
    public void registratVoto(Voto voto){
        try {
            String sql = "insert into voto (quantidade, id_candidato, id_pesquisa) values (? , ? , ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDouble(1,voto.getQuantidade());
            preparedStatement.setInt(2,voto.getCandidato().getId());
            preparedStatement.setInt(3,voto.getPesquisa().getId_pesquisa());
            int key = preparedStatement.executeUpdate();

            if(key >=1){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                resultSet.next();
                int idVoto = resultSet.getInt(1);
                //aqui salvei o idVotos recebendo os foreign keys de candidatos e pesquisa.

                String sqlPesquisaVoto = " insert into Pesquisa_Voto (quantidade, id_candidato, id_pesquisa) values (?, ?,?)";
                PreparedStatement preparedStatementPesquisaVoto = con.prepareStatement(sqlPesquisaVoto);
                for(PesquisaVoto item: voto.getPesquisaVotos()) {
                    preparedStatementPesquisaVoto.setDouble(1,voto.getQuantidade());
                    preparedStatementPesquisaVoto.setInt(2,voto.getCandidato().getId());
                    preparedStatementPesquisaVoto.setInt(3,voto.getPesquisa().getId_pesquisa());
                    preparedStatementPesquisaVoto.execute();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public List<Voto> listar(){
        return null;
    }
}
