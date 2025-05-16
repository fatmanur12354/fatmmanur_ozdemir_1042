public class Badami {

    String id;
    String name;
    String Country;
    String url;
    String dt;
    String ot;
    String eserileri;

    public Badami() {
    }

    public Badami(String id,String name, String url, String Country,String Dt,String Ot,String Eserileri) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.Country = Country;
        this.dt = Dt;
        this.ot = Ot;
        this.eserileri=Eserileri;


    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDt() {
        return dt;
    }
    public String getOt() {
        return ot;
    }

    public String getCountry() {
        return Country;
    }

    public String getUrl() {
        return url;
    }
    public String geEserleri() {
        return url;
    }
}