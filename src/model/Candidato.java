package model;

public class Candidato {

    private String nome;
    private int codigo;

    private int id;

    public Candidato(){

    }

    public Candidato(int id){

        this.id = id;
    }

    public Candidato(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
