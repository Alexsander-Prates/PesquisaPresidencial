package model;

public class Pesquisa   {

    private String instituto;
    private String regiao;

    private int id_pesquisa;

    public Pesquisa(int id_pesquisa) {
        this.id_pesquisa = id_pesquisa;
    }

    public Pesquisa(){

    }

    public Pesquisa(String instituto, String regiao) {
        this.instituto = instituto;
        this.regiao = regiao;
    }

    public int getId_pesquisa() {
        return id_pesquisa;
    }

    public void setId_pesquisa(int id_pesquisa) {
        this.id_pesquisa = id_pesquisa;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }





}