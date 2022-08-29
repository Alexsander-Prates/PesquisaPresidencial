import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Locale;

public class Pesquisa {
    private int registro;
    private String instituto;
    private String uf;
    private LocalDate date;

    private LocalDate date2;

    private LocalDate date3;

    private  Voto voto;


    public LocalDate getDate2() {
        return date2;
    }

    public void setDate2(LocalDate date2) {
        this.date2 = date2;
    }

    public LocalDate getDate3() {
        return date3;
    }

    public void setDate3(LocalDate date3) {
        this.date3 = date3;
    }



    public Pesquisa(int registro, String instituto, String uf) {
        this.registro = registro;
        this.instituto = instituto;
        this.uf = uf;
        this.date = Data();
        this.date2 = Data2();
        this.date3 = Data3();
    }


    private LocalDate Data (){
        return LocalDate.of(2022,01,01);
    }

    private LocalDate Data2 (){
        return LocalDate.of(2022,02,01);
    }

    private LocalDate Data3 (){
        return LocalDate.of(2022,03,01);
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}