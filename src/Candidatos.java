public class Candidatos {

    private int numero;
    private String nome;
    private Partido partido;

    public Candidatos(int numero, String nome, Partido partido) {
        this.numero = numero;
        this.nome = nome;
        this.partido = partido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}