package DAO;

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
            String sql = "insert into Pesquisa (instituto, regiao, id_pesquisa) values (?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, pesquisa.getInstituto());
            preparedStatement.setString(2, pesquisa.getRegiao());
            preparedStatement.setInt(3, pesquisa.getId_pesquisa());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void atualizar(Pesquisa pesquisa){
        try {
            String sql = "update Pesquisa set instituto = ?, regiao = ? where id_pesquisa = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,pesquisa.getInstituto());
            preparedStatement.setString(2,pesquisa.getRegiao());
            preparedStatement.setInt(3,pesquisa.getId_pesquisa());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void excluir(int idPesquisa){
        try {
            String sql = "delete from Pesquisa where id_pesquisa = ?";
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
            String sql = "select * from Pesquisa";
            Statement statement = con.createStatement();
            ResultSet consultaSelect = statement.executeQuery(sql);
            while (consultaSelect.next()) {
                Pesquisa c = new Pesquisa();
                c.setInstituto(consultaSelect.getString("instituto"));
                c.setRegiao(consultaSelect.getString("Região"));
                c.setId_pesquisa(consultaSelect.getInt("id_pesquisa"));
                listaPesquisa.add(c);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return listaPesquisa;
    }
}
