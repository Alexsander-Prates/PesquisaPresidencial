import controller.CandidatoController;
import model.Candidato;
import model.Voto;

public class Pricipal {

    public static void main(String[] args) {

        Candidato candidato = new Candidato();
        candidato.setId(01);
        candidato.setNome("Lula");
        candidato.setCodigo(13);

        Candidato candidato2 = new Candidato();
        candidato.setId(02);
        candidato.setNome("Ciro");
        candidato.setCodigo(12);

        Candidato candidato3 = new Candidato();
        candidato.setId(03);
        candidato.setNome("Bolsonaro");
        candidato.setCodigo(22);

        CandidatoController controller = new CandidatoController();
        try{
            controller.salvar(candidato);
            controller.salvar(candidato2);
            controller.salvar(candidato3);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        for(Candidato c : controller.listar()){
            System.out.println(c.getNome()+c.getId()+c.getCodigo());
        }



    }
}
