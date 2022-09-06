import controller.CandidatoController;
import model.Candidato;

public class Pricipal {

    public static void main(String[] args) {

        Candidato candidatoLula = new Candidato();
        candidatoLula.setNome("Lula");
        candidatoLula.setId(01);
        candidatoLula.setCodigo(13);

        Candidato candidatoCiro = new Candidato();
        candidatoCiro.setId(02);
        candidatoCiro.setNome("Ciro");
        candidatoCiro.setCodigo(12);

        Candidato candidatoBolsonaro = new Candidato();
        candidatoBolsonaro.setId(03);
        candidatoBolsonaro.setNome("Bolsonaro");
        candidatoBolsonaro.setCodigo(22);

        CandidatoController controller = new CandidatoController();
        try{
            controller.salvar(candidatoLula);
            controller.salvar(candidatoCiro);
            controller.salvar(candidatoBolsonaro);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        for(Candidato c : controller.listar()){
            System.out.println(c.getNome()+c.getId()+c.getCodigo());
        }
    }
}
