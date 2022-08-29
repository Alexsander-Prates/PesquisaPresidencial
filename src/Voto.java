public class Voto {
    private Pesquisa pesquisa;
    private Candidatos candidatos;
    private int quantidade;

    private int quantidade2;

    private int quantidade3;

    private int valorTotal;

    public Voto(Pesquisa pesquisa, Candidatos candidatos, int quantidade, int quantidade2,int quantidade3) {
        this.pesquisa = pesquisa;
        this.candidatos = candidatos;
        this.quantidade = quantidade;
        this.quantidade2 = quantidade2;
        this.quantidade3 = quantidade3;
        this.valorTotal = calcularTotalVotos();
    }

    private int calcularTotalVotos(){
        return getQuantidade() + getQuantidade2() + getQuantidade3();
    }

    public int getQuantidade3() {
        return quantidade3;
    }

    public void setQuantidade3(int quantidade3) {
        this.quantidade3 = quantidade3;
    }

    public int getQuantidade2() {
        return quantidade2;
    }

    public void setQuantidade2(int quantidade2) {
        this.quantidade2 = quantidade2;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pesquisa getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(Pesquisa pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Candidatos getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(Candidatos candidatos) {
        this.candidatos = candidatos;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}