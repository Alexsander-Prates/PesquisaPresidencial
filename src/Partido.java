public class Partido {

    private int codigo;
    private String nome;
    private String e_mail;
    private String sigla;

    public Partido(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mai) {
        this.e_mail = e_mai;
    }

    public String getSigla() {
        return sigla;
    }

    public Partido(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
}