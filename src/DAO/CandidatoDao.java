package DAO;

import model.Candidato;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidatoDao {

    private static CandidatoDao instance;
    private List<Candidato> listaCandidato = new ArrayList<>();
    private Connection con = ConnectionUtil.getConnection();

    //atributo static significar sempre salvar no mesma posição de memória
    //só vamos salvar em tempo de execução - somente enquanto estiver rodando o programa

    public static CandidatoDao getInstance(){
        if (instance == null){
            instance = new CandidatoDao();
        }
        return instance;
    }

    public void salvar(Candidato candidato){
        try {
            String sql = "insert into cliente (nome, codigo, id) values (? , ? , ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, candidato.getNome());
            preparedStatement.setInt(2,candidato.getCodigo());
            preparedStatement.setInt(2,candidato.getId());
            preparedStatement.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizar(Candidato candidato){
        try {
            String sql = "update candidato set (nome = ?, codigo = ?, id = ?) where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, candidato.getNome());
            preparedStatement.setInt(2,candidato.getCodigo());
            preparedStatement.setInt(2,candidato.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void excluir(int idCandidato){
        try {
            String sql = "dele from candidato where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,idCandidato);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Candidato> listar(){
        List<Candidato> listaCandidatos = new ArrayList<>();
        try {
            String sql = "select * from candidatos";
            //////////////////////////////////////////////////////////////////////
            Statement statement = con.createStatement();
            ResultSet consultaSelect = statement.executeQuery(sql);
            while (consultaSelect.next()) {
                Candidato c = new Candidato();
                c.setNome(consultaSelect.getString("nome"));
                c.setCodigo(consultaSelect.getInt("Código"));
                c.setId(consultaSelect.getInt("id"));
                listaCandidatos.add(c);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return listaCandidato;
    }
}
