package model;

import java.time.LocalDate;

public class Pesquisa   {

    private String instituto;
    private String regiao;

    private int id;

    public Pesquisa(int id) {
        this.id = id;
    }

    public Pesquisa(){

    }

    public Pesquisa(String instituto, String regiao) {
        this.instituto = instituto;
        this.regiao = regiao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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