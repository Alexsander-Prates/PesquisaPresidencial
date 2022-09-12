package DAO;

import model.Candidato;
import model.Pesquisa;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PesquisaDao {

    private static PesquisaDao instance;
    private List<Pesquisa> listaPesquisa = new ArrayList<>();
    private Connection con = ConnectionUtil.getConnection();
    //abrindo a conexão com o bando de dados.


    public static PesquisaDao getInstance(){
        if (instance == null){
            instance = new PesquisaDao();
        }
        return instance;
    }

    public void salvar(Pesquisa pesquisa) {
        try {
            String sql = "insert into pesquisa (instituto, regiao), values (?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, pesquisa.getInstituto());
            preparedStatement.setString(2, pesquisa.getRegiao());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void atualizar(Pesquisa pesquisa){
        try {
            String sql = "update pesquisa set instituto = ?, regiao = ? where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,pesquisa.getInstituto());
            preparedStatement.setString(2,pesquisa.getRegiao());
            preparedStatement.setInt(3,pesquisa.getId());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir(int idPesquisa){
        try {
            String sql = "delete from pesquisa where id = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1,idPesquisa);
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<Pesquisa> listar(){
        List<Pesquisa> listaPesquisa = new ArrayList<>();
        try {
            String sql = "select * from pesquisa";
            Statement statement = con.createStatement();
            ResultSet consultaSelect = statement.executeQuery(sql);
            while (consultaSelect.next()) {
                Pesquisa c = new Pesquisa();
                c.setInstituto(consultaSelect.getString("instituto"));
                c.setRegiao(consultaSelect.getString("Região"));
                c.setId(consultaSelect.getInt("id"));
                listaPesquisa.add(c);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return listaPesquisa;
    }
}
